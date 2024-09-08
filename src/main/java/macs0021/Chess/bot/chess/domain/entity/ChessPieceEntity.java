package macs0021.Chess.bot.chess.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChessPieceEntity {

    private String type;

    private String color;

    private Float value;

}
