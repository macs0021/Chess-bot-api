package macs0021.Chess.bot.chess.domain.entity;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessGameEntityJpa;
import macs0021.Chess.bot.chess.infrastructure.jpa.entity.ChessPieceEntityJpa;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChessPositionEntity {

    private Integer id;

    //private List<ChessPieceEntity> pieces;

    private ChessGameEntity game;

}
