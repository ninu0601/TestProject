package com.ZoomoneyApp.android.Zoomoneyt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.ZoomoneyApp.android.Zoomoney.R;


public class ZoomainActivity extends Activity{
    String password;
    String correctpassword = "01026395138";


   protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.zoomain);
    }

    public void onClick_Login(View v) {

        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        password = passwordEditText.getText().toString();
        if(password.equals(correctpassword)) {
            Toast.makeText(getApplicationContext(), "로그인 되었습니다.", Toast.LENGTH_LONG).show();
            Intent intent_01 = new Intent(getApplicationContext(), com.ZoomoneyApp.android.Zoomoney.BluetoothZoomain.class);
            startActivity (intent_01);
        }else{
            Toast.makeText(getApplicationContext(),"다시 입력해 주세요.",Toast.LENGTH_LONG).show();
        }

    }
   /* protected void onCreate(Bundle savedInstanceState) {

    }*/


}
