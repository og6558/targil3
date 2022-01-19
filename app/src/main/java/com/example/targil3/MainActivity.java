package com.example.targil3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int mona=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =findViewById(R.id.btn);
    }

    public void batz(View view) {
        mona=mona+1;
        btn.setText("This is a click number:"+mona);
        if(mona==6){
            btn.setText("Enough to click. Go to new start!");
            mona=0;

        }

    }
}