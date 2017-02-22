package com.databindingex.aromal.databindingexample.models.viewmodels;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.databindingex.aromal.databindingexample.BR;


public class JavaViewModel extends BaseObservable {
    private String username;

    @Bindable
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyPropertyChanged(BR.username);
    }



}
