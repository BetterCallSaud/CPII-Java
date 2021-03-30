class Exception1 {
    public static void main(String[] args) {
        System.out.println("\nTrying to divide number by zero...\n");
        try {
            System.out.println(4/0);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("\nDivision by Zero invalid!!!");
        }
    }
}
