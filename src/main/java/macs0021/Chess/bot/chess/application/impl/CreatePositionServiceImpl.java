package macs0021.Chess.bot.chess.application.impl;

import lombok.RequiredArgsConstructor;
import macs0021.Chess.bot.chess.application.CreatePositionService;
import macs0021.Chess.bot.chess.application.ReadChessGameService;
import macs0021.Chess.bot.chess.domain.entity.ChessGameEntity;
import macs0021.Chess.bot.chess.domain.entity.ChessPositionEntity;
import macs0021.Chess.bot.chess.infrastructure.controller.dto.input.MoveInputDto;
import macs0021.Chess.bot.chess.infrastructure.jpa.ChessPositionRepositoryJpa;
import macs0021.Chess.bot.chess.infrastructure.jpa.repository.ChessPositionRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreatePositionServiceImpl implements CreatePositionService {

    private final ReadChessGameService readChessGameService;

    private final ChessPositionRepository chessPositionRepository;


    @Override
    public void create(Integer gameId, MoveInputDto moveInputDto) {

        ChessGameEntity chessGameEntity = readChessGameService.readById(gameId);

        ChessPositionEntity chessPositionEntity = new ChessPositionEntity();

        chessPositionEntity.setGame(chessGameEntity);

        chessPositionRepository.create(chessPositionEntity);

    }
}
