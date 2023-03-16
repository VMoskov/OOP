package hr.fer.oop.lab1;

public class MaxSubArray {
    public static void main(String[] args) {
    }

    public static int maxSubArray(int[] arr, int delimiter){
        int counter=0;
        int max=0;
        for (int i=0; i < arr.length; i++){
            if (arr[i] != delimiter){
                counter++;
                if (counter>max){
                    max=counter;
                }
            }
            else{
                max=counter;
                counter=0;
            }
        }
        if(max==0){
            return counter;
        }
        else{
            return max;
        }
    }
}
