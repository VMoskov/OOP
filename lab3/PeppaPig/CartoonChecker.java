import java.util.List;
import java.util.Arrays;

class CartoonChecker {

    public static void processCharacter(String podatak) {
        List<String> chars = Arrays.asList(Peppa.getAllCharacters());
        for(String s : chars) {
            if(s.equals(podatak)) {
                System.out.println(s + " JE lik u crtanom filmu Peppa Pig");
            }
        }
        if(!chars.contains(podatak)) throw new InvalidPeppaPigCharacterException(podatak + " NIJE lik u crtanom filmu Peppa Pig");
    }
}