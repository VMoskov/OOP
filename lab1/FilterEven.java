public class FilterEven{
    public static int[] filterEven(int[] arr) {
        int[] result = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}