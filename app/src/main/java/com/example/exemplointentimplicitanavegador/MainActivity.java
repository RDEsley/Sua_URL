package com.example.exemplointentimplicitanavegador;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtUrl;
    Button btnAbrirNavegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        edtUrl = (EditText) findViewById(R.id.txtUrl);

        btnAbrirNavegador = (Button) findViewById(R.id.cmdAbrirNavegador);

        btnAbrirNavegador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = edtUrl.getText().toString();
                Intent intencao = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intencao);

            }
        });


    }
}