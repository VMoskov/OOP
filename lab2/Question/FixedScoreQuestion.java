public abstract class FixedScoreQuestion extends Question {
    private int maxScore;

    public FixedScoreQuestion(String text, int maxScore) {
        super(text);
        this.maxScore = maxScore;
    }

    public int getMaxScore() {
        return maxScore;
    }

    @Override
    public int evaluate(String answer) {
        return 0;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }
}