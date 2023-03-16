public static Map<String, Integer> rankingCalculation(Map<Integer, Map<Integer, Integer>> standings) {
        Map<String, Integer> tbr = new TreeMap<>();

        for (Map.Entry<Integer, Map<Integer, Integer>> igracZapisi : standings.entrySet()) {
        int suma = 0;
        int id = igracZapisi.getKey();
        for (Map.Entry<Integer, Integer> zapis : igracZapisi.getValue().entrySet()) {
        suma += zapis.getValue();
        }
        tbr.put(drivers.get(id), suma);
        }


        Map<String, Integer> tbr2 = new TreeMap<>((o1, o2) -> {
        if (tbr.get(o1) > tbr.get(o2)) return 1;
        return -1;
        });

        tbr2.putAll(tbr);

        return tbr2;
        }