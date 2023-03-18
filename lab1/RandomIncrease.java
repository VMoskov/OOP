public class RandomIncrease {
    public static void main(String[] args) {

    }

    static void randomIncrease(int[] arr){
        int velicina = arr.length;
        int poz = (int)(Math.random()*velicina);
        if(poz == arr.length - 1){
            arr[poz] += arr[poz-1];
        }else if(poz == 0){
            arr[0] += arr[1];
        }else if(arr[poz + 1] > arr[poz - 1]){
            arr[poz] += arr[poz + 1];
        }else{
            arr[poz] += arr[poz - 1];
        }
    }
}
