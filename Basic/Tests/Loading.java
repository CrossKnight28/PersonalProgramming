public class Loading {
    public static void main(String[] args) {
        int x = 0;

        System.out.print("Loading.");

        do {
            System.out.print(".");

            try {
                Thread.sleep(400);
            }
            catch (Exception e) {
                System.out.print("Error " + e);
            } 
        } while (x == 0);
    }
}