package org.cecko.bookstore.repository;

import java.util.UUID;
import org.cecko.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
