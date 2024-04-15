package com.football.managerback.manager.user.userrole;

import com.football.managerback.domain.user.role.Role;
import com.football.managerback.domain.user.role.RoleMapper;
import com.football.managerback.domain.user.role.RoleRepository;
import com.football.managerback.manager.user.userrole.dto.RoleInfo;
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
