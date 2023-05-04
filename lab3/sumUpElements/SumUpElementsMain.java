package sumUpElements;

public class SumUpElementsMain {
    public static void main(String[] args) throws NoNumericElementsException {
        Double [] doubleArry = {1.0,3.0};
        String [] stringArry = {"as3", "3.1", "3.9"};

        System.out.println(Utils.sumUpElementsPreparation(stringArry)); //prints 7.0
        System.out.println(Utils.sumUpElements(doubleArry)); //prints 4.0
    }
}
