package org.cecko.bookstore.controller.dto;

import java.time.LocalDate;

public record CreateBookDto(
    String title,
    String authorFullName,
    LocalDate dateOfBirth
) {
}
