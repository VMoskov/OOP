package isPrimeList;

public class isPrimeListMain {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        try {
            Utils.isPrimeList(list);
        } catch (InvalidPrimeNumberList e) {
            System.out.println("InvalidPrimeNumberList");
        }
    }
}
