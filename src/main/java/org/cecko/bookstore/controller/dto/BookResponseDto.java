package org.cecko.bookstore.controller.dto;

public record BookResponseDto(
    Long id,
    String title,
    String authorName
) {
}
