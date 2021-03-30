class Exception4 {
    public static void main(String[] args) {
        System.out.println("Trying to parse a string to an integer");
        String s = "abc";
        try {
            int i = Integer.parseInt(s);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
