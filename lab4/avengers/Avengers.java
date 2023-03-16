 
import java.util.*;

public class Avengers {
    private List<String> avengers;
    private Map<String, Superhero> superheromap;

    public Avengers() {
        avengers = new LinkedList<>();
        superheromap = new HashMap<>();
    }

    public void addSuperhero(Superhero superhero) {
        avengers.add(superhero.getAlias());
        superheromap.put(superhero.getAlias(), superhero);

    }

    public List<Superhero> getAvengersByAlias() {
        Collections.sort(avengers);
        List<Superhero> final_list = new ArrayList<>(avengers.size());
        for(String s: avengers) {
            final_list.add(superheromap.get(s));
        }

        return final_list;
    }

    public List<Superhero> getAvengersBySupervillain(String supervillain) {
        List<String> hero_list = new LinkedList<>();
        for (String s: superheromap.keySet()) {
            if (superheromap.get(s).getSupervillains().contains(supervillain)) {
                hero_list.add(s);
            }
        }

        Collections.sort(hero_list);
        List<Superhero> final_list = new LinkedList<>();

        for (String s: hero_list) {
            final_list.add(superheromap.get(s));
        }

        return final_list;
    }
}