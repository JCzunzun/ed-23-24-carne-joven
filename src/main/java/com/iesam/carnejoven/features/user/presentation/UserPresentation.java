package com.iesam.carnejoven.features.user.presentation;

import com.iesam.carnejoven.features.user.data.UserDataRepository;
import com.iesam.carnejoven.features.user.domain.GetUserUseCase;
import com.iesam.carnejoven.features.user.domain.SaveUserUseCase;
import com.iesam.carnejoven.features.user.domain.User;

public class UserPresentation {
    public static void ObtainUSer(String id){
        GetUserUseCase userUseCase= new GetUserUseCase(UserDataRepository.newUserInstance());
        User user=userUseCase.execute(id);
        System.out.println(user.toString());
    }
    public static void saveUser(User user){
        SaveUserUseCase saveUserUseCase= new SaveUserUseCase(UserDataRepository.newUserInstance());
        saveUserUseCase.execute(user);
    }
}
