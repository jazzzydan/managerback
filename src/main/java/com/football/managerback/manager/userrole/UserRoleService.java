package com.football.managerback.manager.userrole;

import com.football.managerback.domain.user.Role;
import com.football.managerback.domain.user.RoleMapper;
import com.football.managerback.domain.user.RoleRepository;
import com.football.managerback.manager.userrole.dto.RoleInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserRoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;

    public List<RoleInfo> getRoles() {
        List<Role> roles = roleRepository.findAll();
        return roleMapper.toRoleInfos(roles);
    }

}
