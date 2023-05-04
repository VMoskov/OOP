package isPrimeList;

public class Utils {

    public static boolean isPrimeList(int[] list) throws InvalidPrimeNumberList {
        for(int element : list){
            if(element <= 1){
                throw new InvalidPrimeNumberList();
            }
            for(int i = 2; i < element/2; i++){
                if(element % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
