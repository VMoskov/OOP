class Measurement <T, V extends Number> {

    private T tag;
    private V value;



    public Measurement(T tag, V value) {
        this.tag = tag;
        this.value = value;
    }


    public T getTag() {
        return tag;
    }


    public V getValue() {
        return value;
    }



    public <U, D extends Number> boolean notificationHigherThanHundred(Measurement<U,D> another) {

        double zbroj = this.getValue().doubleValue() + another.getValue().doubleValue();

        if (zbroj > 100) {
            return true;
        } else {
            return false;
        }


    }


    public <U, D extends Number> String tagConcatenator (Measurement<U, D> another) {

        if (this.getTag() instanceof String && another.getTag() instanceof String) {
            return this.getTag() + "+" + another.getTag();

        } else {
            return "Type Error";
        }


    }
}