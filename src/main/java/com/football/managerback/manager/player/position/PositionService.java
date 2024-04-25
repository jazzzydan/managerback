package com.football.managerback.manager.player.position;

import com.football.managerback.domain.player.position.Position;
import com.football.managerback.domain.player.position.PositionMapper;
import com.football.managerback.domain.player.position.PositionRepository;
import com.football.managerback.manager.player.position.dto.PositionInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PositionService {
    private final PositionRepository positionRepository;
    private final PositionMapper positionMapper;

    public List<PositionInfo> getPositions() {
        List<Position> positions = positionRepository.findAll();
        List<PositionInfo> positionInfos = positionMapper.toPositionInfos(positions);
        return positionInfos;
    }

}
