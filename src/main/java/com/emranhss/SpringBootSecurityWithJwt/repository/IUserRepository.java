package com.emranhss.SpringBootSecurityWithJwt.repository;

import com.emranhss.SpringBootSecurityWithJwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String username);

}
