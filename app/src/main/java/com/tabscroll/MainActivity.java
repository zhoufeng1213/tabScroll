package com.tabscroll;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * @author tx
 * @date 2018/7/30
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnScroll;
    private Button btnRecycler;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnScroll = findViewById(R.id.scroll);
        btnRecycler = findViewById(R.id.recycler);
        btnScroll.setOnClickListener(this);
        btnRecycler.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.scroll:
                Intent intent1 = new Intent(this, TabScrollActivity.class);
                startActivity(intent1);
                break;
            case R.id.recycler:
                Intent intent2 = new Intent(this, TabRecyclerActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
