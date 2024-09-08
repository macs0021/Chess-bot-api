package macs0021.Chess.bot.chess.application.impl;

import lombok.RequiredArgsConstructor;
import macs0021.Chess.bot.chess.application.UpdateChessGameService;
import macs0021.Chess.bot.chess.domain.entity.ChessGameEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.repository.ChessGameRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateChessGameServiceImpl implements UpdateChessGameService {

    private final ChessGameRepository chessGameRepository;

    @Override
    public ChessGameEntity update(Integer id, ChessGameEntity chessGameEntity) {

        ChessGameEntity gameToUpdate = chessGameRepository.readById(id);

        return chessGameRepository.update(chessGameEntity);
    }
}
