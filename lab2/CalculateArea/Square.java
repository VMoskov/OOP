public class Square implements CalculateAreaAndBand{
    private double a;

    public Square(double a) {
        this.a = a > 0 ? a : Math.abs(a);
    }

    @Override
    public double calculateArea() {
        return a * a;
    }

    @Override
    public double calculateBand() {
        return 4 * a;
    }
}
