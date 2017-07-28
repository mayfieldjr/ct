package com.example.ct;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    public static final String RESULT_EXTRA = "com.example.ct.RESULT_EXTRA";

    EditText messageET;
    EditText messageET1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        messageET = (EditText) findViewById(R.id.et_message);
        messageET1 = (EditText) findViewById(R.id.et1_message);
    }
    public void sendResult (View view) {
        String message = messageET.getText().toString();
        String message1 = messageET.getText().toString();
        Intent data = new Intent();
        data.putExtra(RESULT_EXTRA, message);
        setResult(MainActivity.REQUEST_CODE, data);
        finish();
    }

}