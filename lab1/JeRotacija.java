public class JeRotacija {
    public static void main(String[] args) {

    }

    public static boolean jeRotacija(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String str1str1 = str1 + str1;
        return str1str1.toLowerCase().contains(str2.toLowerCase());
    }
}
