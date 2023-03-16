import java.util.*;

class LabTask {

    public static Collection<String> getMostPopularPeople(Collection<Pair> pairs) {

        Set<Pair> tree = new TreeSet<>();

        Map<String, Integer> check = new LinkedHashMap<>();

        Collection<String> novo = new TreeSet<>();

        for (Pair i : pairs) {

            String name1 = i.getName1();
            String name2 = i.getName2();

            if (name1 == null || name2 == null)
                continue;

            Pair ss = new Pair(name1, name2);

            if (name1.compareTo(name2) > 0)
                ss = new Pair(name1, name2);
            else
                ss = new Pair(name2, name1);

            tree.add(ss);
        }

        for (Pair j : tree) {

            String ime1 = j.getName1();
            String ime2 = j.getName2();

            if (ime1 == null || ime2 == null)
                continue;

            if (check.containsKey(ime1))
                check.put(ime1, check.get(ime1) + 1);
            else
                check.put(ime1, 1);

            if (check.containsKey(ime2))
                check.put(ime2, check.get(ime2) + 1);
            else
                check.put(ime2, 1);
        }

        // int maks = Collections.max(check.values());

        int maks = 0;

        for (Map.Entry<String, Integer> k : check.entrySet()) {

            if (k.getValue() > maks)
                maks = k.getValue();
        }

        for (Map.Entry<String, Integer> k : check.entrySet()) {

            if (k.getValue() == maks)
                novo.add(k.getKey());
        }

        return novo;
    }
}