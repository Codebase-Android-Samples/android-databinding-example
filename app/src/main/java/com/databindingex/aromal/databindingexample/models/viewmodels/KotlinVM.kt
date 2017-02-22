package com.databindingex.aromal.databindingexample.models.viewmodels

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.databindingex.aromal.databindingexample.BR

/**
 * Created by aromal on 2/22/17.
 */
class KotlinVM : BaseObservable() {

    @Bindable
    var username1: String? = null
        set(value) {

            field = value
            notifyPropertyChanged(BR.username1)
        }

}