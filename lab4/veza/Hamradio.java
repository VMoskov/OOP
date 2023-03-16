import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Hamradio {

    public static Map<String, Integer> brojVezaPoOsobi(Map<String, Collection<Veza>> data) {
        // Dovršiti - pazi, metoda vraća broj RAZLIČITIH operatera s kojima je netko
        // komunicirao
        Map<String, Integer> brojVeza = new TreeMap<>();
        Set<String> operateri = new HashSet<>();

        for (Map.Entry<String, Collection<Veza>> entry : data.entrySet()) {
            if (!brojVeza.containsKey(entry.getKey())) {
                for (Veza veza : entry.getValue()) {
                    operateri.add(veza.getOperater());
                }
                brojVeza.put(entry.getKey(), operateri.size());
                operateri.clear();
            }
        }

        return brojVeza;
    }
    public static Map<String, Integer> kilometriPoOsobi(Map<String, Collection<Veza>> data) {

        Map<String, Integer> kilometri = new TreeMap<>();
        int ukupno = 0;

        for (Map.Entry<String, Collection<Veza>> entry : data.entrySet()) {
            if (!kilometri.containsKey(entry.getKey())) {
                for (Veza veza : entry.getValue()) {
                    ukupno += veza.getUdaljenost();
                }
                kilometri.put(entry.getKey(), ukupno);
                ukupno = 0;
            }
        }

        return kilometri;
    }

    public static Map<String, Integer> brojZemaljaPoOsobi(Map<String, Collection<Veza>> data) {
        // Dovršiti - pazi, metoda vraća broj RAZLIČITIH zemalja s kojima je netko
        // komunicirao

        Map<String, Integer> brojZemalja = new TreeMap<>();
        Set<String> imenaZemalja = new HashSet<>();

        for (Map.Entry<String, Collection<Veza>> entry : data.entrySet()) {
            if (!brojZemalja.containsKey(entry.getKey())) {
                for (Veza veza : entry.getValue()) {
                    imenaZemalja.add(veza.getZemlja());
                }
                brojZemalja.put(entry.getKey(), imenaZemalja.size());
                imenaZemalja.clear();
            }
        }

        return brojZemalja;
    }

}