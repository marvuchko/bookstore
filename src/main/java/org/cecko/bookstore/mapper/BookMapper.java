package org.cecko.bookstore.mapper;

import org.cecko.bookstore.controller.dto.BookResponseDto;
import org.cecko.bookstore.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(
    componentModel = MappingConstants.ComponentModel.SPRING,
    unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public interface BookMapper {

  @Mapping(source = "author.fullName", target = "authorName")
  BookResponseDto toDto(Book book);

}
