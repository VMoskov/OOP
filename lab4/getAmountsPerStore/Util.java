import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Util {
    public static Map<String, Integer> getAmountsPerStore(Map<String, Map<String, Integer>> shoppingList){
        Map <String, Integer> shoppingCart = new HashMap<>();
        Set<String> items = new HashSet<>();
        items = shoppingList.keySet();
        Integer newValue, oldValue = 0;
        for (String i : items) {
            Set<String> store =shoppingList.get(i).keySet();
            for (String h : store) {

                if (shoppingCart.containsKey(h)){

                    for (String j : store) {
                        newValue = shoppingList.get(i).get(j);
                        oldValue = shoppingCart.get(j);
                        shoppingCart.replace(j, oldValue + newValue);
                    }
                } else {

                    for (String j : store)
                        shoppingCart.put(j , shoppingList.get(i).get(j));
                }
            }}
        return shoppingCart;

    }
}