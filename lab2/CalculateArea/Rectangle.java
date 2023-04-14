public class Rectangle implements CalculateAreaAndBand{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a > 0 ? a : Math.abs(a);
        this.b = b > 0 ? b : Math.abs(b);
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculateBand() {
        return 2 * (a + b);
    }
}
