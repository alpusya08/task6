package ru.paninov.springcourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.paninov.springcourse.repository.UserRepository;
import ru.paninov.springcourse.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.getById(id);
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User updatedUser) {
        userRepository.update(updatedUser);
    }

    @Override
    public void deleteUser(int id) {
        userRepository.delete(id);
    }
}