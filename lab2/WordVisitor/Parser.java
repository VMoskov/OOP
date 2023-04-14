public class Parser {
    public static void parse(String line, IntWordVisitor visitor) {
        char[] chars = line.toCharArray();

        for(int i = 0; i < chars.length - 1; i++) {
            if(Character.isDigit(chars[i])){
                int len = 1;
                while(i + len < chars.length && Character.isDigit(chars[i+len])){
                    len++;
                }
                visitor.foundInt(Integer.parseInt(String.valueOf(chars, i, len)));
                i += len - 1;
            }
        }
        String[] strings = line.split("\\s+");
        for(int i = 0; i < strings.length; i++) {
            if (!(strings[i].contains("0") || strings[i].contains("1") || strings[i].contains("2") || strings[i].contains("3")
                    || strings[i].contains("4")|| strings[i].contains("5")|| strings[i].contains("6") || strings[i].contains("7") || strings[i].contains("8")
                    || strings[i].contains("9"))) {
                visitor.foundWord(strings[i]);
            }
        }
    }
}