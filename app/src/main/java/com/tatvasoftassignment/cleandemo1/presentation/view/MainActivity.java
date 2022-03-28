package com.tatvasoftassignment.cleandemo1.presentation.view;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.tatvasoftassignment.cleandemo1.R;
import com.tatvasoftassignment.cleandemo1.databinding.ActivityMainBinding;
import com.tatvasoftassignment.cleandemo1.presentation.viewmodel.CallBackOneViewModel;
import com.tatvasoftassignment.cleandemo1.presentation.viewmodel.CallBackTwoViewModel;
import com.tatvasoftassignment.cleandemo1.presentation.viewmodel.UserViewModel;

public class MainActivity extends AppCompatActivity {


    private UserViewModel UserViewModel;
    private ActivityMainBinding binding;
    private CallBackOneViewModel callBackOneViewModel;
    private CallBackTwoViewModel callBackTwoViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);


        callBackOneViewModel = new CallBackOneViewModel(this);
        callBackTwoViewModel = new CallBackTwoViewModel(this);


        UserViewModel = new UserViewModel(this);
        UserViewModel.getMutableLiveData().observe(this, user -> {
//                binding.textView.setText(user.getName());
            Log.i(getString(R.string.user_name), user.getName());
        });

        binding.setPresenter(() -> {
            UserViewModel.callData();
            UserViewModel.getMutableLiveData().observe(MainActivity.this, user -> binding.textView.setText(user.getName()));


            callBackOneViewModel.stringMutableLiveData.observe(MainActivity.this, s -> Log.i(getString(R.string.value_is), s));


            callBackTwoViewModel.data.observe(MainActivity.this, s -> Log.i(getString(R.string.value_is), s));

        });
    }
}