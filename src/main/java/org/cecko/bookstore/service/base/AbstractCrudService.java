package org.cecko.bookstore.service.base;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Transactional(readOnly = true)
public abstract class AbstractCrudService<T, K extends Serializable, R extends JpaRepository<T, K>> {

  private final R repository;

  public List<T> findAll() {
    return repository.findAll();
  }

  public Optional<T> findById(K id) {
    return repository.findById(id);
  }

  @Transactional
  public T createOrUpdate(T entity) {
    return repository.save(entity);
  }

  @Transactional
  public void delete(K id) {
    repository.deleteById(id);
  }
}
