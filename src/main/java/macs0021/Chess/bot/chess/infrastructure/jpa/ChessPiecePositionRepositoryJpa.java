package macs0021.Chess.bot.chess.infrastructure.jpa;

import macs0021.Chess.bot.chess.domain.entity.ChessPiecePositionEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessPiecePositionEntityJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChessPiecePositionRepositoryJpa extends JpaRepository<ChessPiecePositionEntityJpa, Integer> {

    Boolean existsByPosition(String position);

    ChessPiecePositionEntityJpa readByPosition(String position);
}
