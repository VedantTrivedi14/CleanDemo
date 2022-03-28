package com.tatvasoftassignment.cleandemo1.data.repository;


import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.tatvasoftassignment.cleandemo1.R;


public class CallBackTwoRepository {

    private final MutableLiveData<String> data = new MutableLiveData<>();
    Context context;

    public CallBackTwoRepository(Context context) {
        this.context = context;
    }


    public MutableLiveData<String> getData() {
        data.setValue(context.getString(R.string.massage));
        return data;
    }
}
