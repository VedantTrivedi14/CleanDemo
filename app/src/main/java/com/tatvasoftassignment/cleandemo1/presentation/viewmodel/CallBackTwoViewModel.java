package com.tatvasoftassignment.cleandemo1.presentation.viewmodel;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tatvasoftassignment.cleandemo1.domain.CallBackTwoImpl;

public class CallBackTwoViewModel extends ViewModel {

    private final CallBackTwoImpl callBackTwo;
    public MutableLiveData<String> data;
    Context context;

    public CallBackTwoViewModel(Context context) {
        this.context = context;
        callBackTwo = new CallBackTwoImpl(context);
        data = callBackTwo.getData();
    }

    public MutableLiveData<String> getData() {
        data = callBackTwo.getData();
        return data;
    }
}
