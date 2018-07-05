package com.clair.ecda.pid_electronics_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TextoEditable extends AppCompatActivity {

    EditText etTexto;
    Button btnmostrar;
    TextView tvMostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text);

        etTexto = (EditText)findViewById(R.id.et_texto);
        btnmostrar = (Button)findViewById(R.id.btn_mostrar);
        tvMostrar = (TextView)findViewById(R.id.tv_mostrar);

        btnmostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String texto = etTexto.getText().toString();

                if (texto.isEmpty()){
                    tvMostrar.setText("No ha escrito su nombre");
                } else {
                    tvMostrar.setText("Su nombre es: " + texto);
                }
            }
        });
    }
}
