import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Eurosong {

    public static Map<String, Integer> getCurrentResult(Map<String, Map<String, Integer>> mapZaZbroj) {

        //vraca mapu svih drzava natjecatelja i zbroj bodova koje su osvojile (abecedno poredati prema imenu drzave)
        Map<String, Integer> currentResult = new TreeMap<>();



        for(String country: mapZaZbroj.keySet()) {

            int sum = 0;

            for(Integer bod: mapZaZbroj.get(country).values()) {

                sum += bod;
            }
            currentResult.put(country, sum);
        }

        return currentResult;

    }

    public static Map<String, Integer> getPointsByCountry(String country, Map<String, Map<String, Integer>> eurosongMap) {
        Map<String, Integer> mapa = new TreeMap<String, Integer>();
        for (String state : eurosongMap.keySet()) {
            mapa.put(state, eurosongMap.get(state).get(country));
        }
        return mapa;
    }

    public static String getWinner(Map<String, Map<String, Integer>> eurosongMap) {
        String winner = "";
        Integer maxPoints = 0;

        Map<String, Integer> current = getCurrentResult(eurosongMap);

        for (String country : current.keySet()) {
            if (current.get(country) > maxPoints) {
                maxPoints = current.get(country);
                winner = country + "=" + current.get(country);
            }
        }
        return winner;
    }
}