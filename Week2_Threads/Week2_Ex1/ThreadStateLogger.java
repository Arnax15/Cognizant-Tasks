public class ThreadStateLogger {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        System.out.println("Before starting: " + thread.getState());

        thread.start();
        System.out.println("After starting: " + thread.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("During execution: " + thread.getState());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After completion: " + thread.getState());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
