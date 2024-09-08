package macs0021.Chess.bot.chess.infrastructure.jpa.repository;

import lombok.RequiredArgsConstructor;
import macs0021.Chess.bot.chess.application.mapper.ChessPiecePositionMapperJpa;
import macs0021.Chess.bot.chess.domain.entity.ChessPiecePositionEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.ChessPiecePositionRepositoryJpa;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ChessPiecePositionRepository {

    private final ChessPiecePositionRepositoryJpa chessPiecePositionRepositoryJpa;

    private final ChessPiecePositionMapperJpa chessPiecePositionMapperJpa;

    public ChessPiecePositionEntity create(ChessPiecePositionEntity chessPiecePositionEntity) {
        return chessPiecePositionMapperJpa.jpaToEntity(
                chessPiecePositionRepositoryJpa.save(
                        chessPiecePositionMapperJpa.entityToJpa(chessPiecePositionEntity)
                )
        );
    }

    public Boolean existsByPosition(String position) {

        return chessPiecePositionRepositoryJpa.existsByPosition(position);

    }


    public ChessPiecePositionEntity readByPosition(String position) {

        return chessPiecePositionMapperJpa.jpaToEntity(
                chessPiecePositionRepositoryJpa.readByPosition(position)
        );

    }
}
