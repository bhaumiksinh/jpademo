package com.chavda.jpademo.bhaumik.handlers;

import com.chavda.jpademo.bhaumik.domain.User;
import com.chavda.jpademo.bhaumik.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserHandler {

    @Autowired
    UserService userService;

    @GetMapping("get/{id}")
    public User getData(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

    @PostMapping("user")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("get")
    public List<User> getData() {
        return userService.getAllUser();
    }

    @DeleteMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable("id") String id) {
             userService.deleteUser(id);
    }
}
