package com.example.bill.jkfavorbutton;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by bill on 2017/10/16.
 */

public class FavorActivity extends AppCompatActivity {

    private FavorButton favorTextView1;
    private FavorButton favorTextView2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favor);

        favorTextView1 = (FavorButton) findViewById(R.id.favor1);
        favorTextView2 = (FavorButton) findViewById(R.id.favor2);


        findViewById(R.id.up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favorTextView1.setNumber(favorTextView1.getNumber() + 1);
            }
        });

        findViewById(R.id.down).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                favorTextView1.setNumber(favorTextView1.getNumber() - 1);
            }
        });
    }
}
