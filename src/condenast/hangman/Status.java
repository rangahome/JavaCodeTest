package condenast.hangman;

/**
 * A representation of the statuses exposed to the hangman game.
 */
public enum Status {

    IN_PROGRESS("This game is still in progress..."),
    WON("You've won!"),
    LOST("Sorry, you'vs lost!");

    private String prettyStatus;

    /**
     * Constructor Status creates a new Status instance.
     *
     * @param prettyStatus of type String
     */
    private Status(String prettyStatus) {
        this.prettyStatus = prettyStatus;
    }

    /**
     * @return the prettyStatus (type String) of this Status object.
     */
    public String getPrettyStatus() {
        return this.prettyStatus;
    }

}
