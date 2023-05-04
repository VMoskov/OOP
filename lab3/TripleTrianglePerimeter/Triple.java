package TripleTrianglePerimeter;

public class Triple <T>{
    T a;
    T b;
    T c ;

    Triple(T a, T b, T c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    T getElement(int i) {
        if (i == 1) return a;
        if (i == 2) return b;
        if (i == 3) return c;
        throw new IllegalArgumentException();
    }

    void setElement(int i, T value){
        if(i == 1) this.a = value;
        if(i == 2) this.b = value;
        if(i == 3) this.c = value;
        throw new IllegalArgumentException();
    }


}
