package com.football.managerback.manager.user.dto;

import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link com.football.managerback.domain.user.User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserFullInfo implements Serializable {
    private String roleName;
    private String username;
    private String email;
    private String password;
    private String status;
}