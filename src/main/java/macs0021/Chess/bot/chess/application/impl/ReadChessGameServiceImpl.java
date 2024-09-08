package macs0021.Chess.bot.chess.application.impl;

import lombok.RequiredArgsConstructor;
import macs0021.Chess.bot.chess.application.ReadChessGameService;
import macs0021.Chess.bot.chess.domain.entity.ChessGameEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.repository.ChessGameRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReadChessGameServiceImpl implements ReadChessGameService {

    private final ChessGameRepository chessGameRepository;

    public ChessGameEntity readById(Integer id) {

        return chessGameRepository.readById(id);

    }


}
