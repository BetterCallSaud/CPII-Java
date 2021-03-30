class Thread2 implements Runnable {

    public static void main(String[] args) {
        Thread t1 = new Thread("Java");
        Thread t2 = new Thread("Python");
        t1.start();
        t2.start();
        System.out.println("Following are the thread names:");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }

    @Override
    public void run() {}
}
