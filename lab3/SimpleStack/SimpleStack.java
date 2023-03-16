class SimpleStack<T> {
    private T[] stack;
    private int trenutni;
    private int maxS;

    public SimpleStack(int maxSize) {
        if (maxSize < 1) {
            throw new IllegalArgumentException();
        }
        this.maxS = maxSize;
        stack = (T[]) new Object[maxSize];
        trenutni = -1;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NullPointerException();
        }
        return stack[trenutni--];
    }

    public void push(T e) {
        if (isFull()) {
            throw new RuntimeException();
        }
        stack[++trenutni] = e;
    }
    public boolean isEmpty() {
        return trenutni == -1;
    }
    public int getMaxSize() {
        return maxS;
    }

    public int getNumberOfElements() {
        return trenutni + 1;
    }
    public boolean isFull() {
        return trenutni == maxS - 1;
    }

}