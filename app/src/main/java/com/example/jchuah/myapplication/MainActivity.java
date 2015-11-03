package com.example.jchuah.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Bundle sendBundle = new Bundle();
    static String tag = "com.example.jchuah.myapplication.MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onNextClick(View source){
        //Toast.makeText(this, "Howdy Honda",Toast.LENGTH_LONG).show();
        Log.i(tag , "next button click");
        Intent colorActivityIntent = new Intent(this, color.class);
        EditText e = (EditText)findViewById(R.id.username);
        sendBundle.putString("name", e.getText().toString());
        colorActivityIntent.putExtra("groceries", sendBundle);
        startActivity(colorActivityIntent);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
