package com.tatvasoftassignment.cleandemo1.presentation.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.util.Log;

import com.tatvasoftassignment.cleandemo1.R;
import com.tatvasoftassignment.cleandemo1.data.model.User;
import com.tatvasoftassignment.cleandemo1.databinding.ActivityMainBinding;
import com.tatvasoftassignment.cleandemo1.presentation.presenter.UserPresenter;
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


        callBackOneViewModel = new CallBackOneViewModel();
        callBackTwoViewModel = new CallBackTwoViewModel();



        UserViewModel = new UserViewModel();
        UserViewModel.getMutableLiveData().observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
//                binding.textView.setText(user.getName());
                Log.i("user name",user.getName());
            }
        });

        binding.setPresenter(new UserPresenter() {
            @Override
            public void onClick() {
                UserViewModel.callData();
                UserViewModel.getMutableLiveData().observe(MainActivity.this, new Observer<User>() {
                    @Override
                    public void onChanged(User user) {
                       binding.textView.setText(user.getName());
                    }
                });


                callBackOneViewModel.stringMutableLiveData.observe(MainActivity.this, new Observer<String>() {
                    @Override
                    public void onChanged(String s) {
                        Log.i("value is ", s);
                    }
                });


                callBackTwoViewModel.data.observe(MainActivity.this, new Observer<String>() {
                    @Override
                    public void onChanged(String s) {
                        Log.i("value is ", s);
                    }
                });

            }
        });
    }
}