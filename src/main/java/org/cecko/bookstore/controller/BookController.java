package org.cecko.bookstore.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.cecko.bookstore.controller.dto.BookResponseDto;
import org.cecko.bookstore.controller.dto.CreateBookDto;
import org.cecko.bookstore.mapper.BookMapper;
import org.cecko.bookstore.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

  private final BookService bookService;
  private final BookMapper bookMapper;

  @GetMapping
  public List<BookResponseDto> getAll() {
    return bookService.findAll().stream()
        .map(bookMapper::toDto)
        .toList();
  }

  @PostMapping
  public BookResponseDto createBook(@RequestBody CreateBookDto dto) {
    var book =
        bookService.createBookWithAuthor(dto.title(), dto.authorFullName(), dto.dateOfBirth());

    return bookMapper.toDto(book);
  }

}
