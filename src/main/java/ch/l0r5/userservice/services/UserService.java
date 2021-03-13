package ch.l0r5.userservice.services;

import java.util.List;

import ch.l0r5.userservice.models.User;

public interface UserService {

    List<User> getAllUsers();

    void addUser(int id);

    void removeUser(int id);

}
