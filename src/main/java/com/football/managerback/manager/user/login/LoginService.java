package com.football.managerback.manager.user.login;

import com.football.managerback.domain.user.User;
import com.football.managerback.domain.user.UserMapper;
import com.football.managerback.domain.user.UserRepository;
import com.football.managerback.infrastructure.validation.ValidationService;
import com.football.managerback.manager.Status;
import com.football.managerback.manager.user.login.dto.LoginResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class LoginService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public LoginResponse login(String username, String password) {
        Optional<User> optionalUser = userRepository.findUserBy(username, password, Status.ACTIVE);
        User user = ValidationService.getValidExistingUser(optionalUser);
        return userMapper.toLoginResponse(user);
    }
}
