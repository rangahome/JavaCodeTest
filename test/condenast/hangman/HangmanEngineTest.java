package condenast.hangman;

/**
 * Unit tests for the hangman engine
 */
public class HangmanEngineTest extends AbstractHangmanTest {
    
    /**
     * @throws Exception when things go badly  
     */
    public void testGameWinning() throws Exception {
        HangmanEngine hangman = new HangmanEngine("CondeNast", 2);
        assertEquals("_ _ _ _ _ _ _ _ _", hangman.getMaskedWord());
        super.testNonGameEndingGuess(hangman, "c");
        super.testNonGameEndingGuess(hangman, "o");
        super.testNonGameEndingGuess(hangman, "n");
        super.testNonGameEndingGuess(hangman, "d");
        super.testNonGameEndingGuess(hangman, "f");
        super.testNonGameEndingGuess(hangman, "e");
        super.testNonGameEndingGuess(hangman, "a");
        super.testNonGameEndingGuess(hangman, "s");
        super.testGameWinningGuess(hangman, "t");
    }

}
