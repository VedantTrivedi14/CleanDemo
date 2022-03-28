package com.tatvasoftassignment.cleandemo1.data.repository;

import androidx.lifecycle.MutableLiveData;

public class CallBackTwoRepository {

    private MutableLiveData<String> data = new MutableLiveData<>();
    public CallBackTwoRepository(){}

    public MutableLiveData<String> getData() {
        data.setValue("this is second approach");
        return data;
    }
}
