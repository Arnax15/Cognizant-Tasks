import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class WebCrawler {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 10; i++) {
            CrawlerTask task = new CrawlerTask("Task " + i);
            executor.submit(task);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Web crawling completed");
    }
}

class CrawlerTask implements Runnable {
    private String name;

    public CrawlerTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " completed");
    }
}
