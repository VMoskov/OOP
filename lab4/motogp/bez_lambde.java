public static Map<String, Integer> rankingCalculation(Map<Integer, Map<Integer, Integer>> standings) {
        Map<String, Integer> racerPoint = new HashMap<String, Integer>();
        for (Map.Entry<Integer, Map<Integer, Integer>> racePoint : standings.entrySet()) {
        Integer sum = 0;
        int id = racePoint.getKey();
        for (Map.Entry<Integer, Integer> points : racePoint.getValue().entrySet()) {
        sum = sum + points.getValue();
        }
        racerPoint.put(drivers.get(id), sum);
        }
        return orderByValue(racerPoint);
        }

private static Map<String, Integer> orderByValue(Map<String,Integer> initialMap){
        Map<String, Integer> returnMap = new TreeMap<>(new Comparator<String>() {
@Override
public int compare(String obj1, String obj2) {
        if (initialMap.get(obj1) <= initialMap.get(obj2)) return -1;
        return 1;
        }
        });
        for (Map.Entry<String, Integer> racer : initialMap.entrySet()) {
        returnMap.put(racer.getKey(), racer.getValue());
        }
        return returnMap;
        }