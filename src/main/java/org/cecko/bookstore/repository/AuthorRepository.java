package org.cecko.bookstore.repository;

import java.util.Optional;
import org.cecko.bookstore.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

  Optional<Author> findByFullName(String bookAuthorFullName);
}
