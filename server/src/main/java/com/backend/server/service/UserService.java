package com.backend.server.service;

import com.backend.server.Model.Inventory;
import com.backend.server.Model.User;

import java.util.Optional;


public interface UserService {
    public User addUser(User user);
    public Optional<User> getUser(String email);

    User updateUser(User user);

    String deleteUser(String mobileNumber);
    public Optional<User> getAllUser();

//    Inventory addItemToCart(Inventory inventory);
}
