package macs0021.Chess.bot.chess.infrastructure.jpa.repository;


import lombok.RequiredArgsConstructor;
import macs0021.Chess.bot.chess.application.mapper.ChessGameMapperJpa;
import macs0021.Chess.bot.chess.domain.entity.ChessGameEntity;
import macs0021.Chess.bot.chess.exceptions.EntityNotFoundException;
import macs0021.Chess.bot.chess.infrastructure.jpa.ChessGameRepositoryJpa;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ChessGameRepository {

    private final ChessGameRepositoryJpa chessGameRepositoryJpa;
    private final ChessGameMapperJpa chessGameMapperJpa;

    public ChessGameEntity create(ChessGameEntity chessGameEntity) {

        return chessGameMapperJpa.jpaToEntity(
                chessGameRepositoryJpa.save(
                        chessGameMapperJpa.entityToJpa(chessGameEntity)
                )
        );

    }

    public ChessGameEntity update(ChessGameEntity chessGameEntity) {

        return chessGameMapperJpa.jpaToEntity(
                chessGameRepositoryJpa.save(
                        chessGameMapperJpa.entityToJpa(chessGameEntity)
                )
        );

    }

    public ChessGameEntity readById(Integer id) {

        return chessGameMapperJpa.jpaToEntity(chessGameRepositoryJpa.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("ChessGameEntity", id)));

    }


}
