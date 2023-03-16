public class SkSustav {
    public static Map<String, Double> averages(Map<Integer, Map<Integer, Integer>> dnevnik,
                                               Map<Integer, String> listaPredmeta) {
        Map<String, ArrayList<Integer>> sums = new HashMap<>();

        for (var entry : dnevnik.entrySet()) {
            for (var entry2 : entry.getValue().entrySet()) {
                sums.putIfAbsent(listaPredmeta.get(entry2.getKey()), new ArrayList<>());
                sums.get(listaPredmeta.get(entry2.getKey())).add(entry2.getValue());
            }
        }

        Map<String, Double> avgs = new HashMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : sums.entrySet()) {
            int suma = 0;
            for (Integer i : entry.getValue())
                suma += i;

            avgs.put(entry.getKey(), (double) suma / entry.getValue().size());
        }

        return avgs;
    }
}