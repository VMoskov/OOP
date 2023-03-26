
public class MorseDecoder {
    public static void main(String[] args) {
        System.out.println(morseDecoder("....-...--..---.----"));
    }
    public static String morseDecoder(String s){
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i=i+5){
            String s1 = s.substring(i, i+5);
            int a=0;
            if (i%2!=0){
                a+=1;
            }
            if(s1.equals(".----")){
                sb.append(Integer.toString(1+a));
            }
            if(s1.equals("..---")){
                sb.append(Integer.toString(2+a));
            }
            if(s1.equals("...--")){
                sb.append(Integer.toString(3+a));
            }
            if(s1.equals("....-")){
                sb.append(Integer.toString(4+a));
            }
            if(s1.equals(".....")){
                sb.append(Integer.toString(5+a));
            }
            if(s1.equals("-....")){
                sb.append(Integer.toString(6+a));
            }
            if(s1.equals("--...")){
                sb.append(Integer.toString(7+a));
            }
            if(s1.equals("---..")){
                sb.append(Integer.toString(8+a));
            }
            if(s1.equals("----.")){
                if (9+a==10){
                    sb.append("0");
                }
                else{
                    sb.append("9");
                }
            }
            if(s1.equals("-----")){
                sb.append(Integer.toString(a));
            }
        }
        return sb.toString();
    }
}
