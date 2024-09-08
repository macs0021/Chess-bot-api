package macs0021.Chess.bot.chess.application.mapper;

import macs0021.Chess.bot.chess.domain.entity.ChessGameEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessGameEntityJpa;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class ChessGameMapperJpa {

    public abstract ChessGameEntityJpa entityToJpa(ChessGameEntity dto);

    public abstract ChessGameEntity jpaToEntity(ChessGameEntityJpa jpa);

}
