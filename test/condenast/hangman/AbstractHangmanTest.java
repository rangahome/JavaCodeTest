package condenast.hangman;

import junit.framework.TestCase;

/**
 * Parent class for hangman tests
 *
 * These methods will handle assertions we want to repeat over and over again on our Hangman game
 */
public abstract class AbstractHangmanTest extends TestCase {

    /**
     * @param game of type Hangman
     * @param letter of type String
     * @throws Exception when
     */
    protected void testNonGameEndingGuess(Hangman game, String letter) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param game of type Hangman
     * @param letter of type String
     * @throws Exception when
     */
    protected void testGameLosingGuess(Hangman game, String letter) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @param game of type Hangman
     * @param letter of type String
     * @throws Exception when
     */
    protected void testGameWinningGuess(Hangman game, String letter) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}