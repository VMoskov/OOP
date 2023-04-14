public class ParserMain{
    public static void main(String[] args) {
        IntWordCounter counter = new IntWordCounter();

        Parser.parse("Perica koji ima 15 godina će krenuti u školu sa 7 godina", counter);

        System.out.println("int: " + counter.getIntCount());
        System.out.println("word: " + counter.getWordCount());
    }
}
