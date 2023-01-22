package com.chavda.jpademo.bhaumik.services;


import com.chavda.jpademo.bhaumik.domain.User;
import com.chavda.jpademo.bhaumik.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User getUser(final String id) {
        return  userRepo.getReferenceById(Long.valueOf(id));
    }

    public User addUser(final User user) {
        return userRepo.save(user);
    }

    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    public void deleteUser(final String id) {
        userRepo.deleteById(Long.valueOf(id));
    }

}
