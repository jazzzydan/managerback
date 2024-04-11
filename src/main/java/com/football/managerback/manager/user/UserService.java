package com.football.managerback.manager.user;

import com.football.managerback.domain.user.User;
import com.football.managerback.domain.user.UserMapper;
import com.football.managerback.domain.user.UserRepository;
import com.football.managerback.manager.Status;
import com.football.managerback.manager.user.dto.UserInfo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public List<UserInfo> getUsers() {
        List<User> users = userRepository.findUsersBy(Status.ACTIVE);
        return userMapper.toUserInfos(users);
    }

}
