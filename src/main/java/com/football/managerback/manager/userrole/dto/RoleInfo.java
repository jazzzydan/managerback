package com.football.managerback.manager.userrole.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.user.Role}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleInfo implements Serializable {
    private Integer roleId;
    private String roleName;
}