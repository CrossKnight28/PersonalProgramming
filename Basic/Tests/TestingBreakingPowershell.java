public class TestingBreakingPowershell {
    public static void main(String[] args) {
        int value = 3;
        int timesRanBeforeBroken = 0;

        while (value == value) {
            thread.sleep(1000);
            timesRanBeforeBroken++;
            System.out.print(" " + timesRanBeforeBroken);
        }
    }
}