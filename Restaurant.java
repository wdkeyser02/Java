import java.util.concurrent.CountDownLatch;

public class Restaurant {
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("\nMain is Started!\n");
        int numberOfChefs = 5;
        CountDownLatch latch = new CountDownLatch(numberOfChefs);

        // Chefs start preparing their dishes
        new Thread(new Chef("Chef A", "Pizza", latch, 1000)).start();
        new Thread(new Chef("Chef B", "Pasta", latch, 500)).start();
        new Thread(new Chef("Chef C", "Salad", latch, 200)).start();
        new Thread(new Chef("Chef D", "Burger", latch, 1000)).start();
        new Thread(new Chef("Chef E", "Fish", latch, 10000)).start();

        // Wait for all dishes to be ready
        latch.await();

        System.out.println("All dishes are ready! Let's start serving customers.");
    }
}

class Chef implements Runnable {
    private final String name;
    private final String dish;
    private final CountDownLatch latch;
    private final int cookingTime;

    public Chef(String name, String dish, CountDownLatch latch, int cookingTime) {
        this.name = name;
        this.dish = dish;
        this.latch = latch;
        this.cookingTime = cookingTime;
    }

    @Override
    public void run() {
        // Simulate preparing the dish
        try {
            System.out.println(name + " is preparing " + dish);
            Thread.sleep(cookingTime); // Simulate cooking time
            System.out.println(name + " has finished preparing " + dish);
            latch.countDown(); // Notify that this dish is ready
            System.out.println("Counter: " + latch.getCount());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}