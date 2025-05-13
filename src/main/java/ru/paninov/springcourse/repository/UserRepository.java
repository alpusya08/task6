package ru.paninov.springcourse.repository;

import ru.paninov.springcourse.model.User;
import java.util.List;

public interface UserRepository {
    List<User> getAll();
    User getById(int id);
    void save(User user);
    void update(User updatedUser);
    void delete(int id);
}
