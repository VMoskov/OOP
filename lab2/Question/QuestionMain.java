public class QuestionMain {
    public static void main(String[] args) {
        Question freeTextQuestion = new FreeTextQuestion("Koliko je 2+2?", "4", 2);
        System.out.println(freeTextQuestion.evaluate("4"));

        FixedScoreQuestion ftQuestion = new FreeTextQuestion("Kako si?", "Dobro!", 1);
        ftQuestion.setMaxScore(5);
        System.out.println(ftQuestion.evaluate("Nije Dobro"));
        System.out.println(ftQuestion.evaluate("Dobro!"));

        Question mcQuestion = new MultipleChoiceQuestion("00P se slusa u: ",
                new String[] { "1. semestru", "2. semestru", "Ljetnom semestru", "Zimskom semestru"},
                new int[] {1, 2}, 4);
        System.out.format ("Odgovor: 'a,c', broj bodova: %d\n", mcQuestion.evaluate("a,c"));
        System.out.format ("Odgovor: 'b,c', broj bodova: %d\n", mcQuestion.evaluate ("b,c")) ;
        System.out.println("Max bodova: " + mcQuestion.getMaxScore());
    }
}
