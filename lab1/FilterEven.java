public class FilterEven{

    public static void main(String[] args) {

    }
    public static int[] filterEven(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int k : arr) {
            if (k % 2 == 0) {
                result[j] = k;
                j++;
            }
        }
        return result;
    }
}