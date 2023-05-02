package com.example.questoes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Quest1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest1);

        EditText quant = findViewById(R.id.quant);
        EditText valor = findViewById(R.id.valorP);
        TextView resulT = findViewById(R.id.valorT);
        Button btCalcular = findViewById(R.id.btCal);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int quantidade = Integer.parseInt(quant.getText().toString());
                double valorP = Double.parseDouble(valor.getText().toString());
                double resul = quantidade * valorP;

                String valorFormatado= new DecimalFormat("#,##0.00").format(resul);
                resulT.setText(valorFormatado);

            }
        });


    }
}