package com.football.managerback.manager.club.confederation;

import com.football.managerback.domain.club.confederation.Confederation;
import com.football.managerback.domain.club.confederation.ConfederationMapper;
import com.football.managerback.domain.club.confederation.ConfederationRepository;
import com.football.managerback.manager.club.confederation.dto.ConfederationInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ConfederationService {

    private final ConfederationRepository confederationRepository;
    private final ConfederationMapper confederationMapper;

    public List<ConfederationInfo> getAllConfederations() {
        List<Confederation> confederations = confederationRepository.findAll();
        List<ConfederationInfo> confederationInfos = confederationMapper.toConfederationInfos(confederations);
        return confederationInfos;

    }
}
