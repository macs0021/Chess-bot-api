package macs0021.Chess.bot.chess.application;

import macs0021.Chess.bot.chess.domain.entity.ChessPiecePositionEntity;

public interface UpdatePiecePositionService {

    ChessPiecePositionEntity updatePiecePosition(String oldPosition, String newPosition);

}
