package com.tatvasoftassignment.cleandemo1.data.repository;

import androidx.lifecycle.MutableLiveData;

import com.tatvasoftassignment.cleandemo1.domain.CallBackOne;

public class CallBackOneRepository {

    private MutableLiveData<String> stringMutableLiveData = new MutableLiveData<>();

    public CallBackOneRepository() {

    }
    public void getData(final String name, final CallBackOne callBackOne){
        if(name.equals("call")){
            stringMutableLiveData.setValue("This is callback");
            callBackOne.success(stringMutableLiveData);
        }else{
            stringMutableLiveData.setValue("error");
            callBackOne.success(stringMutableLiveData);
        }
    }
}
