package com.databindingex.aromal.databindingexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.databindingex.aromal.databindingexample.databinding.JavaActivityBinding;
import com.databindingex.aromal.databindingexample.models.viewmodels.JavaViewModel;

public class JavaActivity extends AppCompatActivity {


    Button submitButton;

    JavaViewModel javaViewModel = new JavaViewModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        final JavaActivityBinding mainActivityBinding = DataBindingUtil.setContentView(this, R.layout.activity_java);
        mainActivityBinding.setJavaVM(javaViewModel);


        submitButton = (Button) findViewById(R.id.buttonSubmit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Log.e("username", "username is " + javaViewModel.getUsername());


            }
        });



    }
}
