public class ThreadSleep {
    public static void main(String[] args) {
        loading(".");
        loading("..");
        loading("...");
        loading("....");
        loading(".....");
    }

    public static void loading(String message) {
        try {
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.print("Error " + e);
        }
        System.out.println("Loading" + message);
    }
}