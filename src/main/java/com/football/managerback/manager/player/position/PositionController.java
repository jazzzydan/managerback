package com.football.managerback.manager.player.position;

import com.football.managerback.manager.player.position.dto.PositionInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PositionController {

    private PositionService positionService;

    @GetMapping("/positions")
    @Operation(summary = "", description = "")
    public List<PositionInfo> getPositions() {
        List<PositionInfo> positionInfos = positionService.getPositions();
        return positionInfos;
    }
}
