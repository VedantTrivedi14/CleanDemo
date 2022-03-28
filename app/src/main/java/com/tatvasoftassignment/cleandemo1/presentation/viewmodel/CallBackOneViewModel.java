package com.tatvasoftassignment.cleandemo1.presentation.viewmodel;


import android.content.Context;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.tatvasoftassignment.cleandemo1.R;
import com.tatvasoftassignment.cleandemo1.data.repository.CallBackOneRepository;
import com.tatvasoftassignment.cleandemo1.domain.CallBackOne;

public class CallBackOneViewModel extends ViewModel {

    public MutableLiveData<String> stringMutableLiveData;


    Context context;

    public CallBackOneViewModel(Context context) {
        this.context = context;
        CallBackOneRepository callBackOneRepository = new CallBackOneRepository(context);

        callBackOneRepository.getData(context.getString(R.string.call), new CallBackOne() {
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
