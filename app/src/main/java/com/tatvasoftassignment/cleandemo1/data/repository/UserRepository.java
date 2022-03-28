package com.tatvasoftassignment.cleandemo1.data.repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.tatvasoftassignment.cleandemo1.R;
import com.tatvasoftassignment.cleandemo1.data.model.User;

public class UserRepository {

    MutableLiveData<User> userMutableLiveData = new MutableLiveData<>();
    Context context;

    public UserRepository(Context context) {
        this.context = context;
    }

    public MutableLiveData<User> getUserMutableLiveData() {

        User user = new User(context.getString(R.string.vedant));
        userMutableLiveData.setValue(user);
        return userMutableLiveData;
    }
}
