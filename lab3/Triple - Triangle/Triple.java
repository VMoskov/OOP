class Triple <T> {

    private T first;
    private T second;
    private T third;

    public Triple(T first, T second, T third) {
        super();
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getElement(int element) throws IllegalArgumentException {
        if (element < 1 || element > 3) {
            throw new IllegalArgumentException();
        }

        if (element == 1) {
            return first;
        } else if (element == 2) {
            return second;
        } else {
            return third;
        }
    }

    public void setElement(int index, T newElement) throws IllegalArgumentException {
        if (index < 1 || index > 3) {
            throw new IllegalArgumentException();
        }

        if (index == 1) {
            first = newElement;
        } else if (index == 2) {
            second = newElement;
        } else {
            third = newElement;
        }
    }
}