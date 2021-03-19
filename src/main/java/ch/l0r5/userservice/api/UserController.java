package ch.l0r5.userservice.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import ch.l0r5.userservice.models.User;
import ch.l0r5.userservice.services.UserService;

@RestController
@RequestMapping("users/")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> allUsers = userService.getAllUsers();
        return ResponseEntity.ok(allUsers);
    }

    @PostMapping("add/{id}")
    public ResponseEntity<String> addUser(@PathVariable long id) {
        userService.addUser(id);
        return ResponseEntity.ok("Added user " + id);
    }

    @PostMapping("remove/{id}")
    public ResponseEntity<String> removeUser(@PathVariable long id) {
        userService.removeUser(id);
        return ResponseEntity.ok("Removed user " + id);
    }

}
