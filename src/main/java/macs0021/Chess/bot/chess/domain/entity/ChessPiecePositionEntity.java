package macs0021.Chess.bot.chess.domain.entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessPieceEntityJpa;
import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessPositionEntityJpa;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChessPiecePositionEntity {

    private Integer id;

    private ChessPositionEntity position;

    private ChessPieceEntity piece;

    private String tile;

}
