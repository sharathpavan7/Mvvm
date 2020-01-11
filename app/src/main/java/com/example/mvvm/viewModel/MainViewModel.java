package com.example.mvvm.viewModel;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm.model.User;

public class MainViewModel extends ViewModel {

    private static final String TAG = "MainViewModel";
    public MutableLiveData<String> email = new MutableLiveData<>();
    public MutableLiveData<User> userMutableLiveData;

    public MainViewModel() {}

    public void onButtonTap() {
        Log.i(TAG, "Button is clicked email is : "+email.getValue());

        User user = new User(email.getValue(), "");
        userMutableLiveData.setValue(user);
    }

    public LiveData<User> getUser() {
        if (userMutableLiveData == null)
            userMutableLiveData = new MutableLiveData<>();
        return userMutableLiveData;
    }
}
