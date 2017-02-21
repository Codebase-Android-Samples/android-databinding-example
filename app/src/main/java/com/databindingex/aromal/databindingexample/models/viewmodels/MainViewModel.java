package com.databindingex.aromal.databindingexample.models.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.databindingex.aromal.databindingexample.BR;

/**
 * Created by aromal on 2/21/17.
 */

public class MainViewModel extends BaseObservable {
    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.username);
    }

    private String username;



}
