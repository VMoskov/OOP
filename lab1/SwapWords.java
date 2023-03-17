public class SwapWords {
    public static String swapWords(String text, String from, String to) {
        return text.replace(from, to);
//        String newText = "";
//        int i = 0;
//        while (i < text.length()) {
//            if (text.substring(i, Math.min(i + fromStr.length(), text.length())).equals(fromStr)) {
//                newText += toStr;
//                i += fromStr.length();
//            } else {
//                newText += text.charAt(i);
//                i++;
//            }
//        }
//        return newText;
    }
}