package macs0021.Chess.bot.chess.infrastructure.controller.dto.input;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MoveInputDto {

    private String fromPosition;

    private String toPosition;

}
