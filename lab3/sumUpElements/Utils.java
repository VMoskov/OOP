package sumUpElements;

public class Utils {
    public static double sumUpElements(Double[] array) {
        double sum = 0;
        for (Double element : array) {
            if(element != null) sum += element;
        }
        return sum;
    }
    public static double sumUpElements(Float[] array) {
        double sum = 0;
        for (Float element : array) {
            if(element != null) sum += element;
        }
        return sum;
    }
    public static double sumUpElements(Integer[] array) {
        double sum = 0;
        for (Integer element : array) {
            if(element != null) sum += element;
        }
        return sum;
    }

    public static double sumUpElementsPreparation(String[] array) throws NoNumericElementsException {
        Double[] brojevi = new Double[array.length];
        int brojac = 0;
        for(int i = 0; i < array.length; i++){
            try{
                Double broj = Double.valueOf(array[i]);
                brojevi[brojac++] = broj;
            }
            catch(NumberFormatException e){
            }
        }
        if(brojac == 0){
            throw new NoNumericElementsException();
        }
        return sumUpElements(brojevi);
    }
}
