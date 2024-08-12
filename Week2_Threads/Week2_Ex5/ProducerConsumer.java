public class ProducerConsumer {
    public static void main(String[] args) {
        DataQueue queue = new DataQueue();

        Producer producer1 = new Producer(queue, "Producer 1");
        Producer producer2 = new Producer(queue, "Producer 2");

        Consumer consumer1 = new Consumer(queue, "Consumer 1");
        Consumer consumer2 = new Consumer(queue, "Consumer 2");

        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
}

class DataQueue {
    private List<String> data = new ArrayList<>();
    private int capacity = 5;

    public synchronized void produce(String data) {
        while (this.data.size() == capacity) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.data.add(data);
        notifyAll();
    }

    public synchronized String consume() {
        while (this.data.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String data = this.data.remove(0);
        notifyAll();
        return data;
    }
}

class Producer extends Thread {
    private DataQueue queue;
    private String name;

    public Producer(DataQueue queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String data = "Data " + i;
            queue.produce(data);
            System.out.println(name + " produced: " + data);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    private DataQueue queue;
    private String name;

    public Consumer(DataQueue queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            String data = queue.consume();
            System.out.println(name + " consumed: " + data);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
