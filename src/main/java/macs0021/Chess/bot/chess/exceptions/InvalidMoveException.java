package macs0021.Chess.bot.chess.exceptions;

public class InvalidMoveException extends RuntimeException {
    public InvalidMoveException(String from, String to, String cause) {
        super(String.format("can`t move from '%s' to '%s': %s", from, to, cause));

    }
}
