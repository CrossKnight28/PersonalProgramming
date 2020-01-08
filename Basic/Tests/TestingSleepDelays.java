public class TestingSleepDelays {
    public static void main(String[] args) {
        System.out.println("Line 1 -");
        System.out.println("");
        try {
            Thread.sleep(500);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Line 2 -");
    }
}