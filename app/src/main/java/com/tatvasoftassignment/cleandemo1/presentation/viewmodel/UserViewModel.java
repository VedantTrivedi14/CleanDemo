package com.tatvasoftassignment.cleandemo1.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tatvasoftassignment.cleandemo1.data.model.User;
import com.tatvasoftassignment.cleandemo1.data.repository.UserRepository;

public class UserViewModel extends ViewModel {

   private MutableLiveData<User> MutableLiveData;
   private UserRepository userRepository;
    public UserViewModel() {
        userRepository = new UserRepository();
        MutableLiveData = userRepository.getUserMutableLiveData();

    }

    public MutableLiveData<User> getMutableLiveData() {
        return MutableLiveData;
    }

    public void callData(){
        userRepository = new UserRepository();
        MutableLiveData = userRepository.getUserMutableLiveData();
    }
}
