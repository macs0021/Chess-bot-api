package macs0021.Chess.bot.chess.exceptions;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String entityType, Integer id) {
        super(String.format("Entity '%s' with id '%d' not found", entityType, id));
    }
}
