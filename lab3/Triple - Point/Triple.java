class Triple <T>{
    private T x;
    private T y;
    private T z;

    public Triple(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getElement(int n){
        if(n == 1) return x;
        if(n == 2) return y;
        if(n == 3) return z;
        throw new IllegalArgumentException();
    }

    public T setElement(int n, T set){
        if(n == 1) this.x = set;
        if(n == 2) this.y = set;
        if(n == 3) this.z = set;
        throw new IllegalArgumentException();
    }

}
