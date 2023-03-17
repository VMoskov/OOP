public class Insert {
    public static void main(String[] args) {

    }
    public static int[] insert(int[] arr, int num, int index) {

        int[] novi = new int[arr.length+1];

        int i = 0;
        for (; i < index; i++) {
            novi[i] = arr[i];
        }

        novi[i] = num;

        for (; i < arr.length; i++) {
            novi[i+1] = arr[i];
        }

        return novi;

    }
}
