package com.databindingex.aromal.databindingexample

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.databindingex.aromal.databindingexample.databinding.KotlinActivityBinding
import com.databindingex.aromal.databindingexample.models.viewmodels.KotlinVM
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {


    val vm = KotlinVM()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: KotlinActivityBinding = DataBindingUtil.setContentView<KotlinActivityBinding>(this, R.layout.activity_kotlin)
        binding.kotlinVM = vm

        buttonSubmit2?.setOnClickListener {


            Log.e("username", "username is " + vm.username1)
//            userVM.notifyChange()

        }

    }
}
