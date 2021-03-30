class Exception3 {
    public static void main(String[] args) {
        System.out.println("Trying to print length of a NULL Pointer\n");
        try {
            String s = null;
            System.out.println(s.length());
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
