package com.football.managerback.manager.login;

import com.football.managerback.infrastructure.error.ApiError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class LoginController {

    private LoginService loginService;

    @GetMapping("/login")
    @Operation(summary = "Login functionality. Returns userId ja roleName",
            description = """
                    The system searches for a user who's account is active using username and password.
                    If no match is found, an error with errorCode 111 is thrown""")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = " OK"),
            @ApiResponse(responseCode = "403", description = "Wrong username or password", content = @Content(schema = @Schema(implementation = ApiError.class)))
    })
    public void login() {

    }
}
