public class RealRoots {
    public static void main(String[] args) {

    }

    public static double[] realRoots(int a, int b, int c){
        double[] polje;
        double det = Math.pow(b, 2) - 4*a*c;
        if(det < 0 || a == 0){
            polje = new double[0];
        }else{
            polje = new double[2];
            polje[0] = (-1*b + Math.sqrt(det))/ (2 * a);
            polje[1] = (-1*b - Math.sqrt(det)) / (2 * a);
        }
        return polje;
    }
}
