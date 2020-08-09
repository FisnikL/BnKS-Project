package com.finki.bnks.project.server.repository;

import com.finki.bnks.project.server.domain.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
