package macs0021.Chess.bot.chess.application.mapper;

import macs0021.Chess.bot.chess.domain.entity.ChessPiecePositionEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessPiecePositionEntityJpa;

public abstract class ChessPiecePositionMapperJpa {

    public abstract ChessPiecePositionEntityJpa entityToJpa(ChessPiecePositionEntity dto);

    public abstract ChessPiecePositionEntity jpaToEntity(ChessPiecePositionEntityJpa jpa);
}
