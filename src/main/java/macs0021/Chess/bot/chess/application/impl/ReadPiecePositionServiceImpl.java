package macs0021.Chess.bot.chess.application.impl;

import lombok.RequiredArgsConstructor;
import macs0021.Chess.bot.chess.application.ReadPiecePositionService;
import macs0021.Chess.bot.chess.domain.entity.ChessPiecePositionEntity;
import macs0021.Chess.bot.chess.infrastructure.jpa.repository.ChessPiecePositionRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReadPiecePositionServiceImpl implements ReadPiecePositionService {

    private final ChessPiecePositionRepository chessPiecePositionRepository;

    @Override
    public Boolean existsByPosition(String position) {
        return chessPiecePositionRepository.existsByPosition(position);
    }

    @Override
    public ChessPiecePositionEntity readByPosition(String position) {
        return chessPiecePositionRepository.readByPosition(position);
    }
}
