package com.iesam.carnejoven.features.user.data;

import com.iesam.carnejoven.features.user.domain.User;
import com.iesam.carnejoven.features.user.domain.UserRepository;

public class UserDataRepository implements UserRepository {
    private static UserDataRepository instanceUser=null;
    public static UserDataRepository newUserInstance(){
        if(instanceUser==null){
            instanceUser= new UserDataRepository();
        }
        return instanceUser;
    }
    @Override
    public void saveUser(User user) {

    }

    @Override
    public User obtainUser(String id) {
        return null;
    }
}
