import java.util.regex.PatternSyntaxException;

class Utils {
    public static boolean isValidEmailAddress(String email) {
        try {
            String[] parts = email.split("@");
            if(parts.length != 2) throw new IllegalArgumentException();
            if(!(parts[parts.length-1].contains("."))) throw new IllegalArgumentException();
            if(!(parts[1].contains(".hr"))) return false;
        }catch(Exception e){
            throw new IllegalArgumentException();
        }
        return true;
    }
}