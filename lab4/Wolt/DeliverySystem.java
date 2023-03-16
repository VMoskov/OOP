import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class DeliverySystem {

    public static Map<String, Float> mostDistantDeliveriesPerDeliveryMan(Map<String, Collection<Connection>> data) {
        var ret = new TreeMap<String, Float>();

        for (String name : data.keySet()) {
            var v = data.get(name);

            float najdalji = 0.f;

            for (Iterator<Connection> iterator = v.iterator(); iterator.hasNext();) {
                var d = iterator.next().getDistance();
                if (d > najdalji)
                    najdalji = d;
            }

            ret.put(name, najdalji);
        }

        return ret;
    }

    public static Map<String, Float> totalDistancePerDeliveryMan(Map<String, Collection<Connection>> data) {
        var ret = new LinkedHashMap<String, Float>();

        for (String name : data.keySet()) {
            var v = data.get(name);

            float tot = 0.f;

            for (Iterator<Connection> iterator = v.iterator(); iterator.hasNext();) {
                tot += iterator.next().getDistance();
            }

            ret.put(name, tot);
        }

        return ret;
    }

}

