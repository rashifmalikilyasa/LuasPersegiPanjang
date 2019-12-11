package com.example.javamenghitungluas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtP, edtL;
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Hitung luas persegi panjang");

        edtP = (EditText) findViewById(R.id.edt_panjang);
        edtL = (EditText) findViewById(R.id.edt_lebar);
        button = (Button) findViewById(R.id.btn_hitung);
        textView = (TextView) findViewById(R.id.txt_luas);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = edtP.getText().toString().trim();
                String lebar = edtL.getText().toString().trim();

                double p = Double.parseDouble(panjang);
                double l = Double.parseDouble(lebar);

                double luas = p * l;

                textView.setText("Luas : " + luas);
            }
        });
    }
}
