package com.ext.jpa.repo.onetoone;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepo extends JpaRepository<ProfileRepo, Long> {
}
