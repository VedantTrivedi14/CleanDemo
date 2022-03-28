package com.tatvasoftassignment.cleandemo1.domain;

import androidx.lifecycle.MutableLiveData;

public interface CallBackOne {

    void success(MutableLiveData<String> data);
    void Failure(MutableLiveData<String> error);

}
