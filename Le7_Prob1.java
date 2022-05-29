package com.example.a201b035_sharedpreferancescomplex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    SharedPreferences sharedPreferences;
    String[]winnersArray={"Rahul","Rohan","Priya"};
    public void storePreference(View view){
        sharedPreferences.edit().putString("players",new Gson().toJson(winnersArray)).apply();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        sharedPreferences=this.getSharedPreferences( "com.example.a201b035_sharedpreferancescomplex", Context.MODE_PRIVATE);
        String[] temp=new Gson().fromJson(sharedPreferences.getString("players",null),winnersArray.getClass());
        textView.setText(Arrays.toString(temp));
    }
}
