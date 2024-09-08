package macs0021.Chess.bot.chess.application.mapper;

import macs0021.Chess.bot.chess.domain.entity.ChessPositionEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessPositionEntityJpa;

public abstract class ChessPositionMapperJpa {

    public abstract ChessPositionEntityJpa entityToJpa(ChessPositionEntity dto);

    public abstract ChessPositionEntity jpaToEntity(ChessPositionEntityJpa jpa);
}
