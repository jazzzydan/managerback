package com.football.managerback.manager.user.user;

import com.football.managerback.infrastructure.error.ApiError;
import com.football.managerback.manager.user.user.dto.UserFullInfo;
import com.football.managerback.manager.user.user.dto.UserInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;


    @PostMapping("/users")
    @Operation(summary = "Adding new user to the system", description = "All fields are mandatory")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Username or e-mail not unique",
                    content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void addUser(@RequestBody @Valid UserFullInfo userFullInfo) {
        userService.addUser(userFullInfo);
    }

    @GetMapping("/users")
    @Operation(
            summary = "Finds all users data whos status is ACTIVE.",
            description = "Returns all user data excluding userId and password")
    public List<UserInfo> getUsers() {
        return userService.getUsers();
    }

    @DeleteMapping("/users/{userId}")
    @Operation(summary = "User removal by userId",
            description = "user status change to D in DB")
    public void removeUser(@PathVariable Integer userId) {
        userService.removeUser(userId);
    }

}

