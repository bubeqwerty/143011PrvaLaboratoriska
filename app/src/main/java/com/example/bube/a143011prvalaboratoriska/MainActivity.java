package com.example.bube.a143011prvalaboratoriska;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.textViewOnMain);
//        TextView tv = (TextView) findViewById(R.id.textViewOnMain);
//
//        Intent intent = getIntent();
//        if(intent.hasExtra("editText_value")){
//            if(!getIntent().getExtras().getString("editText_value").equals(null)){
//                tv.setText(getIntent().getExtras().getString("editText_value"));
//            }
//
//        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {

            if (resultCode == RESULT_OK) {
                TextView tv = (TextView) findViewById(R.id.textViewOnMain);
                // Intent intent = getIntent();
                // if(!getIntent().getExtras().getString("editText_value").equals(null)){
                String result = data.getStringExtra("result");
                tv.setText(result);
                // tv.setText(getIntent().getExtras().getString("editText_value"));
                // }
            }
            if (resultCode == MainActivity.RESULT_CANCELED) {
                //  Same as back button pressed ( Old data on text view )
            }
        }
    }//onActivityResult



    public void toExplicitActivity(View v){
        Intent i = new Intent(this, ExplicitActivity.class);
        startActivityForResult(i,1);
    }

    public void ToImplicitActivity(View view) {
        Intent i = new Intent();
        i.setAction("mk.ukim.finki.mpip.IMPLICIT_ACTION");
        startActivity(i);
    }

    public void tretoKopce(View v){

        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_SUBJECT, " MPiP Send Title ");
        sendIntent.putExtra(Intent.EXTRA_TEXT, " send from MainActivity ");
        sendIntent.setType("text/plain");
        startActivity(sendIntent);
    }

    public void openPhotos(View v){
//        Intent intent = new Intent();
//        intent.setType("image/*");
//        intent.setAction(Intent.ACTION_GET_CONTENT);//
//        startActivity(intent);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(
                "content://media/internal/images/media"));
        startActivity(intent);
    }


}
