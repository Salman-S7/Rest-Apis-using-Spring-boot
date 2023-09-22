package com.restApis.learning.REST.APIs.socialmediaapplocationapi;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDao {
    private static List<User> userList = new ArrayList<>();
    private static int id = 0;

    static {
        userList.add(new User(++id, "imran", LocalDate.now().minusYears(24)));
        userList.add(new User(++id, "salman", LocalDate.now().minusYears(22)));
        userList.add(new User(++id, "arman", LocalDate.now().minusYears(20)));
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User findUserById(int id) {
        Predicate<? super User> prdicate = user -> user.getId() == id;
        return userList.stream().filter(prdicate).findFirst().orElse(null);


    }

    public void saveUser(User user) {
        user.setId(++id);
        userList.add(user);
    }

    public void deleteUser(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        userList.removeIf(predicate);
    }
}
