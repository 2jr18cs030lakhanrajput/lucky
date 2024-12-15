package com.zoho.zoho.Repository;

import com.zoho.zoho.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}