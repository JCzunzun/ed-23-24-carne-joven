package com.iesam.carnejoven.features.user.domain;

public interface UserRepository {
    void saveUser(User user);

    User obtainUser(String id);
}
