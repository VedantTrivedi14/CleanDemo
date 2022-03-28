package com.tatvasoftassignment.cleandemo1.data.repository;

import androidx.lifecycle.MutableLiveData;

import com.tatvasoftassignment.cleandemo1.data.model.User;

public class UserRepository {

    MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();
    private User user;

    public  UserRepository(){

    }

    public MutableLiveData<User> getUserMutableLiveData() {
      user = new User("vedant");
      userMutableLiveData.setValue(user);
        return userMutableLiveData;
    }
}
