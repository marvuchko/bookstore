package org.cecko.bookstore.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@Table(name = "author")
@NoArgsConstructor
@AllArgsConstructor
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String fullName;
  private LocalDate dateOfBirth;

  @Builder.Default
  @OneToMany(mappedBy = "author")
  private List<Book> books = new ArrayList<>(0);
}
