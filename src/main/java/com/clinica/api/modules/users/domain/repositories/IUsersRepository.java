package com.clinica.api.modules.users.domain.repositories;

import com.clinica.api.modules.users.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface IUsersRepository extends JpaRepository<User, Long> {
    UserDetails findByUsername(String username);
}
