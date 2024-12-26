package com.example.bai_tap_thay_cop;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView ekq; //bien dùng chung cho cả class
    EditText tensv,sotuoi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ekq = (TextView) this.findViewById(R.id.txtKQ);
        tensv=(EditText) this.findViewById(R.id.txtTen);
        sotuoi=(EditText) this.findViewById(R.id.txtTuoi);

        tensv.requestFocus();
    }

    public void Ket_qua(View view) {


        String ten=tensv.getText().toString();
        Float  tien=Float.parseFloat  (sotuoi.getText().toString());

        bai_toan bt = new bai_toan(this);
        bt.ten= Float.parseFloat(ten);
        bt.tuoi=tien;
        String html = bt.Boi_ngay();


        ekq.setMovementMethod(LinkMovementMethod.getInstance());
        ekq.setText(Html.fromHtml(html, Html.FROM_HTML_MODE_LEGACY));
    }



    public void go_web(View view) {
        // Tạo Intent để mở Activity 2
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        //truyen tham so

        //gọi nó len
        startActivity(intent); // Bắt đầu Activity 2
    }
}