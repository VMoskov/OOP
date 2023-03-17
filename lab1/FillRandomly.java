public class FillRandomly {
    public static void main(String[] args) {

    }

    public static void fillRandomly(int[] dest, int[] src){
        for (int i = 0; i < dest.length; i++) {
            int rand = (int)(Math.random() * src.length + 1);
            dest[i] = src[rand];
        }

    }
}
