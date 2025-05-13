package ru.paninov.springcourse.service;

import ru.paninov.springcourse.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(User updatedUser);
    void deleteUser(int id);
}