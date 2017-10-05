package com.example.user.pm2aplikasipesan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowMessage extends AppCompatActivity {

    TextView ztv_showPesan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_message);

        ztv_showPesan = (TextView) findViewById(R.id.tv_showPesan);
        Intent intent = getIntent();
        String pesan = intent.getStringExtra("main.pesan");
        ztv_showPesan.setText(pesan);
    }


}
