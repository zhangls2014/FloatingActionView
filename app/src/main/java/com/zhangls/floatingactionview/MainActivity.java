package com.zhangls.floatingactionview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionView floatingActionView = (FloatingActionView) findViewById(R.id.floating_action_view);
        floatingActionView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "you clicked floating action view", Toast.LENGTH_SHORT).show();
            }
        });
        floatingActionView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(MainActivity.this, "you long clicked floating action view", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}
