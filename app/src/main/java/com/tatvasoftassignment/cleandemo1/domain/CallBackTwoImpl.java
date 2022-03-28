package com.tatvasoftassignment.cleandemo1.domain;


import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.tatvasoftassignment.cleandemo1.data.repository.CallBackTwoRepository;

public class CallBackTwoImpl implements CallBackTwo {

    private final CallBackTwoRepository callBackTwoRepository;

    Context context;

    public CallBackTwoImpl(Context context) {
        this.context = context;
        callBackTwoRepository = new CallBackTwoRepository(context);
    }

    @Override
    public MutableLiveData<String> getData() {

        return callBackTwoRepository.getData();
    }


}
