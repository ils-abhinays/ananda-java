package com.ananda.AnandaJava.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ananda.AnandaJava.model.Users;

public interface UserDao extends JpaRepository<Users, Integer> {
	
	List<Users> findByFirstName(String name);
	List<Users> findByEmailId(String reqBody);
}
