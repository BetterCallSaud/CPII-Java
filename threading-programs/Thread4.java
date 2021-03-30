class MultiThreading implements Runnable {
    public void run() {
        try {
            System.out.println("Current state of Thread " + Thread.currentThread().getId() + ": " + Thread.currentThread().getState());
        } catch (Exception ex) {
            System.out.println("Exception is catched");
        }
    }
}
class Thread4 {
    public static void main(String[] args) {
        int num = 10;
        for (int i = 0; i < num; ++i) {
            Thread thread = new Thread(new MultiThreading());
            thread.start();
        }
    }
}
