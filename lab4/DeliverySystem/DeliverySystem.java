class DeliverySystem {


    public static Map<String, Float> mostDistantDeliveriesPerDeliveryMan(Map<String, Collection<Connection>> data) {
        // Metoda vraća udaljenost najudaljenije dostave za svakog dostavljača
        Map<String, Float> ret = new TreeMap<>();
        float max = 0f;
        for (Map.Entry<String, Collection<Connection>> entry : data.entrySet()) {
            for (Connection connections : entry.getValue()) {
                if (connections.getDistance() > max)
                    max = connections.getDistance();
            }
            ret.put(entry.getKey(), max);
            max = 0f;

        }

        return ret;

    }

    public static Map<String, Float> totalDistancePerDeliveryMan(Map<String,Collection<Connection>> data) {
        // Metoda vraća ukupnu udaljenost koju je svaki dostavljač prošao
        Map<String, Float> ret = new LinkedHashMap<>();
        float sum = 0f;
        for (Map.Entry<String, Collection<Connection>> entry : data.entrySet()) {
            for (Connection connections : entry.getValue()) {
                sum += connections.getDistance();
            }
            ret.put(entry.getKey(), sum);
            sum = 0f;

        }

        return ret;

    }

}