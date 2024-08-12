public class SensorSimulation {
    public static void main(String[] args) {
        Sensor sensor1 = new Sensor("Sensor 1");
        Sensor sensor2 = new Sensor("Sensor 2");
        Sensor sensor3 = new Sensor("Sensor 3");

        sensor1.start();
        sensor2.start();
        sensor3.start();

        try {
            sensor1.join();
            sensor2.join();
            sensor3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread exiting");
    }
}

class Sensor extends Thread {
    private String name;

    public Sensor(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
