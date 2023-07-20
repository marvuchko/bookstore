package org.cecko.bookstore.service;

import java.time.LocalDate;
import org.cecko.bookstore.entity.Author;
import org.cecko.bookstore.entity.Book;
import org.cecko.bookstore.repository.AuthorRepository;
import org.cecko.bookstore.repository.BookRepository;
import org.cecko.bookstore.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService extends AbstractCrudService<Book, Long, BookRepository> {

  private final AuthorRepository authorRepository;

  public BookService(BookRepository repository, AuthorRepository authorRepository) {
    super(repository);
    this.authorRepository = authorRepository;
  }

  @Transactional
  public Book createBookWithAuthor(String bookTitle, String bookAuthorFullName, LocalDate dateOfBirth) {
    var book = Book.builder()
        .title(bookTitle)
        .build();

    var author = authorRepository.findByFullName(bookAuthorFullName)
        .orElse(Author.builder()
            .fullName(bookAuthorFullName)
            .dateOfBirth(dateOfBirth)
            .build());

    book.setAuthor(author);
    author.getBooks().add(book);

    return createOrUpdate(book);
  }
}
