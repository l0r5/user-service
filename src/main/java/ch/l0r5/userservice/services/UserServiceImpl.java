package ch.l0r5.userservice.services;

import org.springframework.stereotype.Service;

import java.util.List;

import ch.l0r5.userservice.models.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("UserService")
public class UserServiceImpl implements UserService {

    @Override
    public List<User> getAllUsers() {
        log.info("Getting all Users");
        return null;
    }

    @Override
    public void addUser(long id) {
        log.info("Adding user {}", id);
    }

    @Override
    public void removeUser(long id) {
        log.info("Removing user {}", id);
    }
}
