import java.util.*;
class LabTask {
    public static List<Integer> viceversa(Map<Integer, Integer> map) {
        List<Integer> listaKojuVraca = new LinkedList<>();
        for (Integer key : map.keySet())
            for (Integer key2 : map.keySet()) {
                if (!Objects.equals(key, map.get(key2))) {
                } else {
                    if (!Objects.equals(map.get(key), key2)) {
                    } else {
                        listaKojuVraca.add(key);
                    }
                }
            }
        Collections.sort(listaKojuVraca);
        Collections.reverse(listaKojuVraca);
        return listaKojuVraca;
    }
}