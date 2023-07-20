package org.cecko.bookstore.repository;

import java.util.UUID;
import org.cecko.bookstore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
