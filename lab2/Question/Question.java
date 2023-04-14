public abstract class Question {
    private String text;

    protected Question(String text) {
        this.text = text;
    }

    public abstract int getMaxScore();
    public abstract int evaluate(String answer);

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
