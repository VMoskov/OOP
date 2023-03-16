class Agent <T, V extends Number>{

    private T name;
    private V value;

    public Agent(T name, V value) {
        this.name = name;
        this.value = value;
    }

    public T getName() {
        return name;
    }

    public V getValue() {
        return value;
    }

    public <U, W extends Number> boolean notificationHigherThanTen(Agent<U, W> another) {
        double sum = this.getValue().doubleValue() + another.getValue().doubleValue();

        if (sum > 10) {
            return true;
        }
        return false;

    }

    public <U, W extends Number> String nameConcatenator(Agent<U, W> another) {
        if (this.getName() instanceof String && another.getName() instanceof String) {
            return this.getName() + "+" + another.getName();
        }
        return "Type Error";
    }
}