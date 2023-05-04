package TripleTrianglePerimeter;

public class Triangle extends Triple<Number>{
    Triangle(Number a, Number b, Number c) throws IllegalArgumentException{
        super(a, b, c);
        if (a.doubleValue() + b.doubleValue() <= c.doubleValue() || a.doubleValue() + c.doubleValue() <= b.doubleValue() || b.doubleValue() + c.doubleValue() <= a.doubleValue()) {
            throw new IllegalArgumentException();
        }
        //throw illegal argument exception if the triangle is not valid
    }

    public double perimeter(){
        return super.getElement(1).doubleValue() + super.getElement(2).doubleValue() + super.getElement(3).doubleValue();
    }
}
