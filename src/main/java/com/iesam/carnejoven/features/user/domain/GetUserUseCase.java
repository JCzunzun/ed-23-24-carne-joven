package com.iesam.carnejoven.features.user.domain;

import com.iesam.carnejoven.features.user.data.UserDataRepository;

public class GetUserUseCase {
    private final UserDataRepository userDataRepository;

    public GetUserUseCase(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    public User execute(String id){
        return userDataRepository.obtainUser(id);
    }
}
