package macs0021.Chess.bot.chess.application;

import macs0021.Chess.bot.chess.domain.entity.ChessGameEntity;

public interface UpdateChessGameService {

    ChessGameEntity update(Integer id, ChessGameEntity chessGameEntity);

}
