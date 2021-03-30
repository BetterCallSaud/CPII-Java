class MultiThreading implements Runnable {
    public void run() {
        try {
            System.out.println("Priority of Thread " + Thread.currentThread().getId() + ": " + Thread.currentThread().getPriority());
        } catch (Exception ex) {
            System.out.println("Exception is catched");
        }
    }
}
class Thread3 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i < num; ++i) {
            Thread thread = new Thread(new MultiThreading());
            thread.start();
        }
    }
}
