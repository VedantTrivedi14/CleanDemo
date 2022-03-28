package com.tatvasoftassignment.cleandemo1.presentation.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tatvasoftassignment.cleandemo1.data.model.User;
import com.tatvasoftassignment.cleandemo1.data.repository.UserRepository;

public class UserViewModel extends ViewModel {

    private MutableLiveData<User> MutableLiveData;
    private UserRepository userRepository;
    Context context;

    public UserViewModel(Context context) {
        this.context = context;
        userRepository = new UserRepository(context);
        MutableLiveData = userRepository.getUserMutableLiveData();

    }

    public MutableLiveData<User> getMutableLiveData() {
        return MutableLiveData;
    }

    public void callData() {
        userRepository = new UserRepository(context);
        MutableLiveData = userRepository.getUserMutableLiveData();
    }
}
