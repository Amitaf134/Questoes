package com.example.questoes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class Quest4 extends AppCompatActivity {
    private EditText salarioFixo ;
    private EditText totalVendas ;
    private EditText taxaVendas ;
    private TextView salaTotal;
    private Button btCalc;
    DecimalFormat formato = new DecimalFormat("#0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest4);

        salarioFixo = findViewById(R.id.salaFixo);
        totalVendas = findViewById(R.id.totalVendas);
        taxaVendas = findViewById(R.id.taxaVendas);
        salaTotal = findViewById(R.id.salaTotal);
        btCalc = findViewById(R.id.btCalS);

        btCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double salFixo = Double.parseDouble(salarioFixo.getText().toString());
                double totVendas = Double.parseDouble(totalVendas.getText().toString());
                double txVendas = Double.parseDouble(taxaVendas.getText().toString());
                double salTotal = 0;

                salTotal = salFixo + (totVendas*(txVendas/100));

                String formatado = formato.format(salTotal);

                salaTotal.setText(formatado);

            }
        });

    }
}
