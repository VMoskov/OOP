public class FreeTextQuestion extends FixedScoreQuestion {
    private String correctAnswer;

    public FreeTextQuestion(String text, String correctAnswer, int maxScore) {
        super(text, maxScore);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int evaluate(String answer) {
        if (answer.equals(correctAnswer)) {
            return getMaxScore();
        } else {
            return 0;
        }
    }
}