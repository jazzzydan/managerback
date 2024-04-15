package com.football.managerback.manager.confederation;

import com.football.managerback.manager.confederation.dto.ConfederationInfo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ConfederationController {

    private ConfederationService confederationService;

    @GetMapping("/confederations")
    public List<ConfederationInfo> getAllConfederations() {
        List<ConfederationInfo> allConfederations = confederationService.getAllConfederations();
        return allConfederations;
    }



}
