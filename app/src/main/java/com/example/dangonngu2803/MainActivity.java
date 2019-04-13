package com.example.dangonngu2803;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edtTk,edtMk;
    Button btnDangnhap;
    TextView txtNoidung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMk = findViewById(R.id.edittextPassword);
        edtTk = findViewById(R.id.edittextTaikhoan);
        btnDangnhap = findViewById(R.id.buttonDangnhap);
        txtNoidung = findViewById(R.id.textNoidung);

        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String taikhoan = edtTk.getText().toString();
                String matkhau = edtMk.getText().toString();

                String tk = getResources().getString(R.string.text_tai_khoan);
                String mk = getResources().getString(R.string.text_mat_khau);

                txtNoidung.setText(tk  + taikhoan + "\n" + mk + matkhau);
            }
        });
    }
}
