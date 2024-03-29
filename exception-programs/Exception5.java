public class Exception5 {
    private static final String CLASS_TO_LOAD = "main.java.Utils";

    public static void main(String[] args) {
        try {
            Class loadedClass = Class.forName(CLASS_TO_LOAD);
            System.out.println("Class " + loadedClass + " found!\n");
        } catch (ClassNotFoundException ex) {
            System.err.println("ClassNotFoundException was found: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
