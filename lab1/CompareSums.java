public class CompareSums {
    public static void main(String[] args) {

    }

    public static int compareSums(int[] first, int[] second){
        int prvo = 0;
        int drugo = 0;
        for (int j : first) {
            prvo += j;
        }
        for (int j : second) {
            drugo += j;
        }

        return Math.min(prvo, drugo);
    }
}
