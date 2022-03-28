package com.tatvasoftassignment.cleandemo1.presentation.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tatvasoftassignment.cleandemo1.data.repository.CallBackOneRepository;
import com.tatvasoftassignment.cleandemo1.domain.CallBackOne;

public class CallBackOneViewModel extends ViewModel {

    private CallBackOneRepository callBackOneRepository;
    public MutableLiveData<String> stringMutableLiveData;
    public CallBackOneViewModel(){
            callBackOneRepository = new CallBackOneRepository();
            callBackOneRepository.getData("call", new CallBackOne() {
                @Override
                public void success(MutableLiveData<String> data) {
                    stringMutableLiveData = data;
                }

                @Override
                public void Failure(MutableLiveData<String> error) {
                    stringMutableLiveData = error;
                }
            });
    }
}
