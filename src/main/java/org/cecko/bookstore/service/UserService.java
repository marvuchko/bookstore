package org.cecko.bookstore.service;

import java.util.UUID;
import org.cecko.bookstore.entity.User;
import org.cecko.bookstore.repository.UserRepository;
import org.cecko.bookstore.service.base.AbstractCrudService;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractCrudService<User, Long, UserRepository> {

  public UserService(UserRepository repository) {
    super(repository);
  }
}
