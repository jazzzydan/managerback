package com.football.managerback.manager.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.user.User}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserInfo implements Serializable {
    private String roleName;
    private String username;
    private String email;
}