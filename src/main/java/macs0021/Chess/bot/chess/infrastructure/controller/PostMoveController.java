package macs0021.Chess.bot.chess.infrastructure.controller;

import lombok.RequiredArgsConstructor;
import macs0021.Chess.bot.chess.application.CreatePositionService;
import macs0021.Chess.bot.chess.infrastructure.controller.dto.input.MoveInputDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chess/move")
@RequiredArgsConstructor
public class PostMoveController {

    private final CreatePositionService createPositionService;

    @PostMapping("/game_id")
    public void move(@PathVariable(name = "game_id") Integer gameId, @RequestBody MoveInputDto moveInputDto){




    }

}
