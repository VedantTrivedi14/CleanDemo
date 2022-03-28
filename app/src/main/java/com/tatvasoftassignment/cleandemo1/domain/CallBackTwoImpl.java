package com.tatvasoftassignment.cleandemo1.domain;

import androidx.lifecycle.MutableLiveData;

import com.tatvasoftassignment.cleandemo1.data.repository.CallBackTwoRepository;

public class CallBackTwoImpl implements  CallBackTwo{

    private CallBackTwoRepository callBackTwoRepository;
    private MutableLiveData<String> data;
    public CallBackTwoImpl(){
        callBackTwoRepository = new CallBackTwoRepository();
    }
    @Override
    public MutableLiveData<String> getData() {

       data = callBackTwoRepository.getData();
        return data;
    }
}
