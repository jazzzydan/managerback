package com.football.managerback.domain.user;

import com.football.managerback.manager.Status;
import com.football.managerback.manager.user.login.dto.LoginResponse;
import com.football.managerback.manager.user.user.dto.UserFullInfo;
import com.football.managerback.manager.user.user.dto.UserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.name", target = "roleName")
    LoginResponse toLoginResponse(User user);

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.name", target = "roleName")
    @Mapping(source = "username", target = "username")
    @Mapping(source = "email", target = "email")
    UserInfo toUserInfo(User user);

    List<UserInfo> toUserInfos(List<User> users);

    @Mapping(source = "username", target = "username")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(constant = Status.ACTIVE, target = "status")
    User toUser(UserFullInfo userFullInfo);
}