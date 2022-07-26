package com.user.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
