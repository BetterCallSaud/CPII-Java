class Exception2 {
    public static void main(String[] args) {
            int arr[] = {1,2,3,4};
            System.out.println("\nTrying to access out of bounds index of array");
            try {
                System.out.println(arr[4]);
            } catch(Exception ex) {
                ex.printStackTrace();
            }
    }
}
