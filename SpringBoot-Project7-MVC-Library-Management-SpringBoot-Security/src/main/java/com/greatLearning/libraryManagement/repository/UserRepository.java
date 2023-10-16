package com.greatLearning.libraryManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.greatLearning.libraryManagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
    @Query("SELECT u FROM User u WHERE u.username = ?1")
    public User getUserByUsername(String username);
}