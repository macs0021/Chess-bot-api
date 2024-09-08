package macs0021.Chess.bot.chess.application;

import macs0021.Chess.bot.chess.infrastructure.controller.dto.input.MoveInputDto;

public interface CreatePositionService {

    void create(Integer gameId, MoveInputDto moveInputDto);


}
