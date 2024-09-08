package macs0021.Chess.bot.chess.application;

import macs0021.Chess.bot.chess.domain.entity.ChessGameEntity;

public interface ReadChessGameService {

    public ChessGameEntity readById(Integer id);
}
