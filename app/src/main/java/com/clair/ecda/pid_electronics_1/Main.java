package com.clair.ecda.pid_electronics_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    TextView tvPrincial;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPrincial = findViewById(R.id.tv_principal);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);

        tvPrincial.setText("");

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view){
                tvPrincial.setText("Boton uno presionado");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvPrincial.setText("Boton dos presionado");
            }
        });
    }
}
