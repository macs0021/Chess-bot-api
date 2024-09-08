package macs0021.Chess.bot.chess.infrastructure.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChessPiecePositionEntityJpa {

    @Id
    private Integer id;

    @OneToMany
    private ChessPositionEntityJpa position;

    @OneToMany
    private ChessPieceEntityJpa piece;

    private String tile;


}
