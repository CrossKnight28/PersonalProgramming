public class BreakingPowershell {
    public static void main(String[] args) {
        int value = 3;
        int timesRanBeforeBroken = 0;

        while (value == value) {
            timesRanBeforeBroken++;
            System.out.print(" " + timesRanBeforeBroken);
        }
    }
}