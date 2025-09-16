public class Main {

    public static void main(String[] args) {
        Thread childThread = new Thread(() -> count(), "child");
        childThread.start();
        count();
    }

    public static void count() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}