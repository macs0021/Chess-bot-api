package macs0021.Chess.bot.chess.infrastructure.jpa.repository;

import lombok.RequiredArgsConstructor;
import macs0021.Chess.bot.chess.domain.entity.ChessGameEntity;
import macs0021.Chess.bot.chess.domain.entity.ChessPositionEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.ChessPositionRepositoryJpa;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ChessPositionRepository {

    private final ChessPositionRepositoryJpa chessPositionRepositoryJpa;

    public ChessPositionEntity create(ChessPositionEntity chessPositionEntity){

        

    }

}
