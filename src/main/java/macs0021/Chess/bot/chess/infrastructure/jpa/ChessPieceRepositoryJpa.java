package macs0021.Chess.bot.chess.infrastructure.jpa;

import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessPieceEntityJpa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChessPieceRepositoryJpa extends JpaRepository<ChessPieceEntityJpa, Integer> {
}
