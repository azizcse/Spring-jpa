package com.ext.jpa.repo.onetoone;

import com.ext.jpa.model.onetoone.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
