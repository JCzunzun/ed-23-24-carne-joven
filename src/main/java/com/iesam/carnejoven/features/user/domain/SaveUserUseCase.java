package com.iesam.carnejoven.features.user.domain;

import com.iesam.carnejoven.features.user.data.UserDataRepository;

public class SaveUserUseCase {
    private final UserDataRepository userDataRepository;

    public SaveUserUseCase(UserDataRepository userDataRepositoryç) {
        this.userDataRepository = userDataRepositoryç;
    }
    public void execute(User user){
        userDataRepository.saveUser(user);
    }
}
