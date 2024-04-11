package com.football.managerback.manager.user;

import com.football.managerback.manager.user.dto.UserInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping("/users")
    @Operation(
            summary = "Finds all users data whos status is ACTIVE.",
            description = "Returns all user data excluding userId and password")
    public List<UserInfo> getUsers() {
        return userService.getUsers();
    }
}
