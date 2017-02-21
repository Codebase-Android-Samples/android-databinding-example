package com.databindingex.aromal.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.databindingex.aromal.databindingexample.databinding.MainActivityBinding;
import com.databindingex.aromal.databindingexample.models.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {


    Button submitButton;

    MainViewModel mainViewModel = new MainViewModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final MainActivityBinding mainActivityBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainActivityBinding.setMainVM(mainViewModel);


        submitButton = (Button) findViewById(R.id.buttonSubmit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mainViewModel.getUsername();
                Log.e("username","username is "+mainViewModel.getUsername());


            }
        });



    }
}
