package com.restApis.learning.REST.APIs.socialmediaapplocationapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {
    private UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userDao.getAllUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable int id) {
        User userById = userDao.findUserById(id);
        if (userById == null) {
            throw new UserNotFoundException("id: " + id);
        }
        return userById;
    }

    //to add new user lets send post request
    @PostMapping("/users")
    public ResponseEntity<Object> saveUser(@RequestBody User user) {
        userDao.saveUser(user);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(user.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }

    @DeleteMapping("/users/{id}")
    public void deleteById(@PathVariable int id) {
        userDao.deleteUser(id);
    }
}
