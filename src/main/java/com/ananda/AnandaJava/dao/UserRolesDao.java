package com.ananda.AnandaJava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ananda.AnandaJava.model.UserRoles;

public interface UserRolesDao extends JpaRepository<UserRoles, Integer> {

}