package macs0021.Chess.bot.chess.infrastructure.jpa;

import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessGameEntityJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChessGameRepositoryJpa extends JpaRepository<ChessGameEntityJpa, Integer> {
}
