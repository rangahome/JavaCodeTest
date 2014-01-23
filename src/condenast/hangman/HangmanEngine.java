package condenast.hangman;

import java.util.Set;
import java.util.HashSet;
import java.util.regex.Pattern;

/**
 * A simple stateful hangman engine that implements the Hangman interface.
 *
 * This class manages the rules of the game but does not communicate directly with the player.
 */
public class HangmanEngine implements Hangman {

    private String word;
    private int numberOfIncorrectGuesses;

    /**
     * Constructor
     *
     * @param word - the word to be guessed
     * @param numberOfIncorrectGuesses - number of incorrect guesses allowed
     */
    public HangmanEngine(String word, int numberOfIncorrectGuesses) {
        this.word = word;
        this.numberOfIncorrectGuesses = numberOfIncorrectGuesses;
    }

    /**
     * @see condenast.hangman.Hangman#guessLetter(java.lang.String)
     */
    public boolean guessLetter(String letter) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @see condenast.hangman.Hangman#getLettersGuessed
     */
    public String getLettersGuessed() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @see condenast.hangman.Hangman#getGameStatus
     */
    public GameStatus getGameStatus() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @see condenast.hangman.Hangman#getWord
     */
    public String getWord() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @see condenast.hangman.Hangman#getMaskedWord
     */
    public String getMaskedWord() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @see condenast.hangman.Hangman#getNumberOfIncorrectGuessesRemaining
     */
    public int getNumberOfIncorrectGuessesRemaining() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
