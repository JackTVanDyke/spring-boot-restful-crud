package com.vandyke.springbootrestfulcrud.Repo;

import com.vandyke.springbootrestfulcrud.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
