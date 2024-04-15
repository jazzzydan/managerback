package com.football.managerback.manager.user.userrole;

import com.football.managerback.manager.user.userrole.dto.RoleInfo;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserRoleController {
    private UserRoleService userRoleService;

    @GetMapping("/roles")
    @Operation(
            summary = "Finds all user roles from database",
            description = "Returns userId and UserRole")
    public List<RoleInfo> getRoles() {
        return userRoleService.getRoles();
    }
}
