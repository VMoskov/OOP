class Couple<P> {
    private P first;
    private P second;

    public Couple(P first, P second) {
        this.first=first;
        this.second=second;
    }
    public P getElement(int index) {
        if(index==1) {
            return this.first;
        }
        else if(index==2) {return this.second;}
        else {throw new IllegalArgumentException();}
    }
    public void setElement(int index, P value) {
        if(index==1) { this.first = value;}
        else if(index==2) { this.second = value;}
        else {throw new IllegalArgumentException();}
    }

}
