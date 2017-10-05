package com.example.user.pm2aplikasipesan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void showMessage(View view)
    {
        EditText zet_pesanan = (EditText) findViewById(R.id.et_pesanan);
        TextView ztv_pesanan = (TextView) findViewById(R.id.tv_pesanan);

        String pesan = zet_pesanan.getText().toString();
/*        ztv_pesanan.setText(pesan);
        Toast.makeText(this, pesan, Toast.LENGTH_SHORT).show();
        Log.d("show.pesan", pesan);
*/
        Intent intent = new Intent(this, ShowMessage.class);
        intent.putExtra("main.pesan", pesan); //opsional
        startActivity(intent);
    }

    public void callPhone(View view)
    {
        EditText zet_telfon = (EditText) findViewById(R.id.et_telfon);

        String telp = zet_telfon.getText().toString();
        Uri uri = Uri.parse("tel:"+telp); //identifikasi untuk secara umum
        Intent intent = new Intent(Intent.ACTION_DIAL, uri);
        startActivity(intent);
    }
}
