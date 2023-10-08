package com.ext.jpa.repo.embed;

import com.ext.jpa.model.embated.EUser;
import com.ext.jpa.model.embated.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<EUser, Long> {
    EUser findByEmail(String email);

    List<EUser> findByName(Name name);

    List<EUser> findByNameFirstName(String firstName);

    List<EUser> findByAddressCountry(String country);
}
