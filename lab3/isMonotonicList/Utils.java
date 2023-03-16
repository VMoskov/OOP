class Utils {

    public static boolean isMonotonicList(int[] arr) throws InvalidMonotonic {

        boolean rising = false;
        boolean falling = false;
        boolean monotonic = true;

        if (arr.length < 3) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                falling = true;
            } else if (arr[i] <= arr[i + 1] && !falling) {
                rising = true;
            } else {
                monotonic = false;
                break;
            }
        }

        if (monotonic == false && arr.length >= 2) {
            throw new InvalidMonotonic();
        }

        return true;

    }
}