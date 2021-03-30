class MultiThreading implements Runnable {

    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        } catch(Exception ex) {
            System.out.println("Exception is caught.");
        }
    }
}

class Thread1 {
    public static void main(String[] args) {
            int num = 10; // Number of threads
            for (int i = 0; i < num; ++i) {
                Thread thread = new Thread(new MultiThreading());
                thread.start();
            }
    }
}
