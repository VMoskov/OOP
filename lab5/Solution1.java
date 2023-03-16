import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*

prema sljedećim zahtjevima:

metoda vraća predikat koji omogućuje testiranje je li string pisan
VELIKIM slovima (slučaj ako se proslijedi CaseOption.UPPERCASE) ili
malim slovima (slučaj ako se proslijedi CaseOption.LOWERCASE)
inače predikat vraća false.
pomoć: String ima metodu chars() koja će možda biti korisna
čitavu klasu Solution zalijepiti u Edgar.
Primjer
*/

class Solution1 {
    String test;

    public static Predicate<String> allLettersMatch(CaseOption option){
        return ime -> option == CaseOption.UPPERCASE ? ime.matches("^[A-Z]+$") : ime.matches("^[a-z]+$");
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("juriCa", "IVANA", "zeljka");
        List<String> uppercaseOutput = input.stream().filter(ime -> ime.matches("^[A-Z]+$")).collect(Collectors.toList());
        List<String> lowercaseOutput = input.stream().filter(Solution1.allLettersMatch(CaseOption.LOWERCASE)).collect(Collectors.toList());

        System.out.println("ez");

    }

}

enum CaseOption {UPPERCASE, LOWERCASE}
