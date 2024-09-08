package macs0021.Chess.bot.chess.application;

import macs0021.Chess.bot.chess.domain.entity.ChessPiecePositionEntity;

public interface ReadPiecePositionService {

    Boolean existsByPosition(String position);
    ChessPiecePositionEntity readByPosition(String position);

}
