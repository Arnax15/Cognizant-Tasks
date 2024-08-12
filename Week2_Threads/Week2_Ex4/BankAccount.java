public class BankAccount {
    private int balance;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Transaction transaction1 = new Transaction(account, 1000);
        Transaction transaction2 = new Transaction(account, -500);

        transaction1.start();
        transaction2.start();

        try {
            transaction1.join();
            transaction2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: " + account.getBalance());
    }
}

class Transaction extends Thread {
    private BankAccount account;
    private int amount;

    public Transaction(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (amount > 0) {
            account.deposit(amount);
        } else {
            account.withdraw(-amount);
        }
    }
}
