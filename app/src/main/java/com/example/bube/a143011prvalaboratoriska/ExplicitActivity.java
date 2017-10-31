package com.example.bube.a143011prvalaboratoriska;

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
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void toMainActivityPlusExtra(View v){
        EditText et = (EditText) findViewById(R.id.editText);

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("editText_value",et.getText().toString());
        startActivity(i);
    }

}
