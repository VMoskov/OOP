public class RightTriangle implements CalculateAreaAndBand{
    private double a;
    private double b;
    private double c;

    public RightTriangle(double a, double b) {
        this.a = a > 0 ? a : Math.abs(a);
        this.b = b > 0 ? b : Math.abs(b);
        this.c = Math.sqrt(a * a + b * b);
    }

    @Override
    public double calculateArea() {
        return a * b / 2;
    }

    @Override
    public double calculateBand() {
        return a + b + c;
    }
}
