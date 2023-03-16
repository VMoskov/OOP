import java.util.Collection;
import java.util.*;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class TataSteel {
    public static Map<String, Integer> countAttendance(Map<Integer, Map<String, Double>> tataSteelStandings) {
        Map<String, Integer> finished = new TreeMap<>();
        Map<String, Integer> reverseSortedMap = new TreeMap<String, Integer>(Collections.reverseOrder());

        for(Integer i : tataSteelStandings.keySet()) {
            for(String name : tataSteelStandings.get(i).keySet()) {
                Integer val = finished.get(name);
                finished.put(name, val == null ? 1 : val + 1);
            }
        }
        reverseSortedMap.putAll(finished);
        return reverseSortedMap;



    }
}