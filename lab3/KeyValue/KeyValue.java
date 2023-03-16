public class KeyValue<T, V> {
    private T key;
    private V value;

    public KeyValue(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }


    public void setKey(T key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static <U extends Comparable<U>> KeyValue<U, U>[] copy(KeyValue<U, U>[] array) {
        if (array == null || array.length == 0) {
            return null;
        }


        int counter = 0;
        KeyValue<U, U> still = new KeyValue<U, U>(array[0].getKey(), array[0].getValue());

        for (int i = 1; i < array.length; i++) {
            if (array[i].getValue().compareTo(still.getValue()) > 0) {
                ++counter;
                still = new KeyValue<U, U>(array[i].getKey(), array[i].getValue());
            }
        }

        KeyValue<U, U>[] new_array = (KeyValue<U, U>[]) new KeyValue<?, ?>[counter+1];

        new_array[0] = new KeyValue<U, U>(array[0].getKey(), array[0].getValue());
        int index = 1;
        still = new_array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].getValue().compareTo(still.getValue()) > 0) {
                still = new KeyValue<U, U>(array[i].getKey(), array[i].getValue());;
                new_array[index] = new KeyValue<U, U>(array[i].getKey(), array[i].getValue());
                index++;
            }
        }

        return new_array;

    }
}