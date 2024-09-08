package macs0021.Chess.bot.chess.infrastructure.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChessPieceEntityJpa {

    @Id
    private Integer id;

    private String type;

    private String color;

    private Float value;


}
