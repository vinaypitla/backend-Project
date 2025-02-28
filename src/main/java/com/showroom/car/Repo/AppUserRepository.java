package com.showroom.car.Repo;

import com.showroom.car.Entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, String> {
    @Query("SELECT u FROM AppUser u WHERE u.email = :email AND u.password = :password")
    Optional<AppUser> findByEmailAndPassword(@Param("email") String email, @Param("password") String password);
}
