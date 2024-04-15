package com.football.managerback.manager.user.userrole.dto;

import com.football.managerback.domain.user.role.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Role}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleInfo implements Serializable {
    private Integer roleId;
    private String roleName;
}