import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "trava";
        String str2 = "varTa";
        System.out.println(anagram(str1, str2));
    }

    public static boolean anagram(String str1, String str2){
        String string = str1.replaceAll(" ", "");
        String string2 = str2.replaceAll(" ", "");
        String sr1 = string.toLowerCase(Locale.ROOT);
        String sr2 = string2.toLowerCase(Locale.ROOT);

        int[] arr1 = new int[sr1.length()];
        int[] arr2 = new int[sr2.length()];

        for(int i = 0; i < sr1.length(); i++){
            arr1[i] = sr1.charAt(i);
        }

        for(int i = 0; i < sr2.length(); i++){
            arr2[i] = sr2.charAt(i);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < sr1.length(); i++){
            if(arr1[i] == arr2[i]){
                return true;
            }
        }

        return false;



    }
}
