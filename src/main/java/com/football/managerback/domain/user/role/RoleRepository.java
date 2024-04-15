package com.football.managerback.domain.user.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Integer> {


    @Query("select r from Role r where r.name = :name")
    Role findRoleBy(String name);
}