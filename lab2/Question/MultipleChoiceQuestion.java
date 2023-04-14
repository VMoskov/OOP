public class MultipleChoiceQuestion extends Question {
    private int scorePerCorrect;
    private String[] choices;
    private int[] correctAnswers;

    public MultipleChoiceQuestion(String text, String[] choices, int[] correctAnswers,  int scorePerCorrect) {
        super(text);
        this.choices = choices;
        this.scorePerCorrect = scorePerCorrect;
        this.correctAnswers = correctAnswers;
    }

    @Override
    public int evaluate(String answer) {
        int score = 0;
        String[] answers = answer.split(",");
        for(String ans : answers) {
            for(int i = 0; i < correctAnswers.length; i++) {
                if(correctAnswers[i] == ans.charAt(0) - 'a'){
                    score += scorePerCorrect;
                }
            }
        }
        return score;
    }


    public int getMaxScore() {
        return correctAnswers.length * scorePerCorrect;
    }
}