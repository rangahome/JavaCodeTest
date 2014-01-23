package condenast.hangman;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * A command line hangman game runner.
 *
 * This class accepts game inputs for the length of the hangman game and the word to be guessed.
 *
 * It messages the user on the command line regarding the state of the game and prompts for
 * letters to guess.
 *
 * The length and rules of the game are soley determined by the Hangman engine.  This class simply
 * formats the results of the engine for the user on the command line.
 */
public class HangmanConsole {

    Hangman game;

    /**
     * Constructor
     *
     * @param game of type Hangman
     */
    public HangmanConsole(Hangman game) {
        this.game = game;
    }

    /**
     * Runs the game.  When this method completes, the user will have either won or lost the game.
     */
    public void runGame() {
        // feed me code please
    }

    /**
     * Message the user based on the state of the game
     */
    private void displayCurrentStatus() {

        // let the user know where they stand
        this.communicate("The word or phrase to guess is " + game.getMaskedWord() + ".\n");

        // announce which letters have been guessed
        if (game.getLettersGuessed().length() > 0) {
            this.communicate("So far, you've guessed : " + game.getLettersGuessed() + "\n");
        }

        this.communicate("You have " + game.getNumberOfIncorrectGuessesRemaining() + " guesses remaining. \n");

    }

    /**
     * @param s of type String to be messaged to the user
     */
    private void communicate(String s) {
        System.out.println(s);
    }

    /**
     * Public static main
     * Allows the game to be run from the command line
     *
     * @param args word and # of guesses
     */
    public static void main(String[] args) {
        if (args.length < 2) {
            throw new RuntimeException("\n\n Usage: Hangman.class word numberOfWrongGuesses \n         where word may only contain letters, hyphens and spaces. \n\n");
        }
        String word = args[0];
        int numberOfIncorrectGuesses = Integer.parseInt(args[1]);
        HangmanConsole console = new HangmanConsole(new HangmanEngine(word, numberOfIncorrectGuesses));
        console.runGame();
    }

}
