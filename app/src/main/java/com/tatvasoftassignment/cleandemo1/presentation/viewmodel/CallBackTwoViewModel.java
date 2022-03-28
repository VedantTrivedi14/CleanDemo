package com.tatvasoftassignment.cleandemo1.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tatvasoftassignment.cleandemo1.domain.CallBackTwo;
import com.tatvasoftassignment.cleandemo1.domain.CallBackTwoImpl;

public class CallBackTwoViewModel extends ViewModel {

    private final CallBackTwoImpl callBackTwo;
    public MutableLiveData<String> data;
    public CallBackTwoViewModel() {
        callBackTwo = new CallBackTwoImpl();
        data = callBackTwo.getData();
    }

    public MutableLiveData<String> getData() {
        data = callBackTwo.getData();
        return data;
    }
}
