package condenast.hangman;

/**
 * A hangman engine.  This is a stateful game engine that will implement
 * all the rules of hangman.  If the user can guess the word before the
 * max number of incorrect guesses has been reached, then the user will win the game.
 */
public interface Hangman {

    /**
     * Returns true if the letter guessed is found in the word.
     *
     * @param guessedLetter of type String
     * @return boolean
     */ 
    public boolean guessLetter(String guessedLetter);
    
    /**
     * Returns a string with all the letters that have been guessed in order 
     * of their guess attempt.  Duplicate guesses and invalid guesses are NOT 
     * included in this string.  There is no formatting - its is just the letters guessed.
     * For example, if the user guessed "a", "b", "c", this would return "abc"
     *
     * @return String
     */
    public String getLettersGuessed();
    
    
    /**
     * Gets the word the user is trying to guess
     *
     * @return String
     */
    public String getWord();

    /**
     * Returns a string with all the letters the user hasn't already guessed
     * masked with a "_".  So for example, if the word is "DOG" and the user has
     * guessed "ABCD", this will return "D__"
     *
     * @return String
     */
    public String getMaskedWord();
    
    /**
     * Returns the current status of the game
     *
     * @return GameStatus
     */ 
    public GameStatus getGameStatus();
    
    /**
     * Returns the number of incorrect guesses the user has remaining
     *
     * @return int
     */ 
    public int getNumberOfIncorrectGuessesRemaining();

}
