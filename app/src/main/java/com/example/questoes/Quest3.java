package com.example.questoes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Quest3 extends AppCompatActivity {

    DecimalFormat formato = new DecimalFormat("#0.00");
    private EditText alt ;
    private TextView pesoId;
    private Button calc ;
    private Spinner menuS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quest3);
        alt = findViewById(R.id.alt);
        pesoId = findViewById(R.id.pesoId);
        calc = findViewById(R.id.btCalc) ;
        menuS = findViewById(R.id.sexo);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double h = Double.parseDouble(alt.getText().toString());
                double resultado = 0;

                if(menuS.getSelectedItemPosition() == 0){
                    resultado = (72.7 * h) - 58;
                }else{
                    resultado = (62.1 * h) - 44.7;
                }
                String formatado = formato.format(resultado);
                pesoId.setText(formatado);
            }
        });
    }
}