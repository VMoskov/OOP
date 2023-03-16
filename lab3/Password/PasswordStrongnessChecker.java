class PasswordStrongnessChecker{
    int minimalNumberOfSmallLetters;
    int minimalNumberOfBigLetters;
    int minimalNumberOfDigits;
    int minimalNumberOfSpecialCharacters;

    public PasswordStrongnessChecker(int minimalNumberOfSmallLetters, int minimalNumberOfBigLetters, int minimalNumberOfDigits, int minimalNumberOfSpecialCharacters) {
        this.minimalNumberOfSmallLetters = minimalNumberOfSmallLetters;
        this.minimalNumberOfBigLetters = minimalNumberOfBigLetters;
        this.minimalNumberOfDigits = minimalNumberOfDigits;
        this.minimalNumberOfSpecialCharacters = minimalNumberOfSpecialCharacters;
    }

    public int[] analyzePassword(String password) throws WeakPasswordException {
        int[] analyzationResults = new int[4];

        int numberOfSmallLetters = 0;
        int numberOfBigLetters = 0;
        int numberOfNumbers = 0;    //lol, number of numbers hahahaha
        int numberOfSpecialChars = 0;

        for (int i = 0; i < password.length(); i++){
            char c = password.charAt(i);

            if (Character.isUpperCase(c))
                numberOfBigLetters++;
            else if (Character.isLowerCase(c))
                numberOfSmallLetters++;
            else if (Character.isDigit(c))
                numberOfNumbers++;
            else
                numberOfSpecialChars++;
        }

        if (numberOfSmallLetters < minimalNumberOfSmallLetters)
            throw new WeakPasswordException("Password is too weak");
        if (numberOfBigLetters < minimalNumberOfBigLetters)
            throw new WeakPasswordException("Password is too weak");
        if (numberOfNumbers < minimalNumberOfDigits)
            throw new WeakPasswordException("Password is too weak");
        if (numberOfSpecialChars < minimalNumberOfSpecialCharacters)
            throw new WeakPasswordException("Password is too weak");

        analyzationResults[0] = numberOfSmallLetters;
        analyzationResults[1] = numberOfBigLetters;
        analyzationResults[2] = numberOfNumbers;
        analyzationResults[3] = numberOfSpecialChars;

        return analyzationResults;
    }
}