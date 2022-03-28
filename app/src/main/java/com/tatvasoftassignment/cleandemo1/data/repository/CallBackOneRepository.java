package com.tatvasoftassignment.cleandemo1.data.repository;

import android.content.Context;

import androidx.lifecycle.MutableLiveData;

import com.tatvasoftassignment.cleandemo1.R;
import com.tatvasoftassignment.cleandemo1.domain.CallBackOne;

public class CallBackOneRepository {

    private final MutableLiveData<String> stringMutableLiveData = new MutableLiveData<>();
    Context context;

    public CallBackOneRepository(Context context) {
        this.context = context;
    }

    public void getData(final String name, final CallBackOne callBackOne) {
        if (name.equals(context.getString(R.string.call))) {
            stringMutableLiveData.setValue(context.getString(R.string.massage2));
            callBackOne.success(stringMutableLiveData);
        } else {
            stringMutableLiveData.setValue(context.getString(R.string.error));
            callBackOne.success(stringMutableLiveData);
        }
    }
}
