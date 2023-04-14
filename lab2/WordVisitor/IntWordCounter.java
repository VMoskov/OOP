public class IntWordCounter implements IntWordVisitor{
    private int intCount;
    private int wordCount;

    public IntWordCounter() {
        intCount = 0;
        wordCount = 0;
    }

    public int getIntCount() {
        return intCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    @Override
    public void foundInt(int i) {
        intCount++;
    }

    @Override
    public void foundWord(String word) {
        wordCount++;
    }
}