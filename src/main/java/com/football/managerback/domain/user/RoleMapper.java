package com.football.managerback.domain.user;

import com.football.managerback.manager.userrole.dto.RoleInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface RoleMapper {

    @Mapping(source = "id", target = "roleId")
    @Mapping(source = "name", target = "roleName")
    RoleInfo toRoleInfo(Role role);

    List<RoleInfo> toRoleInfos(List<Role> roles);

}