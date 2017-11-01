package com.example.bube.a143011prvalaboratoriska;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;


public class ExplicitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicitactivity);
    }
    public void toMainActivity(View v){
//        Intent i = new Intent(this, MainActivity.class);
//        startActivity(i);

        Intent returnIntent = new Intent();
        setResult(RESULT_CANCELED,returnIntent);
        finish();
    }

    public void toMainActivityPlusExtra(View v){
        EditText et = (EditText) findViewById(R.id.editText);

//        Intent i = new Intent(this, MainActivity.class);
//        i.putExtra("editText_value",et.getText().toString());
//        startActivity(i);

        Intent returnIntent = new Intent();
        //returnIntent.putExtra("editText_value",et.getText().toString());
        returnIntent.putExtra("result",et.getText().toString());
        setResult(RESULT_OK,returnIntent);
        finish();
    }

}
