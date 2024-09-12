package com.ananda.AnandaJava.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ananda.AnandaJava.model.UserAuthToken;

public interface UserAuthTokenDao extends JpaRepository<UserAuthToken, Long> {

	List<UserAuthToken> findByUserId(Integer reqBody);
	List<UserAuthToken> findByUserIdOrderByIdDesc(Integer reqBody);
}
