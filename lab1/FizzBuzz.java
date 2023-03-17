public class FizzBuzz {
    public static String fizzbuzz(int from, int to){
        String result = "";
        for(int i = from; i <= to; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result += "FizzBuzz";
            } else if(i % 3 == 0){
                result += "Fizz";
            } else if(i % 5 == 0){
                result += "Buzz";
            } else {
                result += i;
            }
            result += ", ";
        }
        //strip last two characters
        result = result.substring(0, result.length() - 2);
        return result;
    }
}