package com.example.questoes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button quest1;
    Button quest2;
    Button quest3;
    Button quest4;
    Button quest5;
    Button quest6;
    Button quest7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quest1 = findViewById(R.id.quest1);
        quest2 = findViewById(R.id.quest2);
        quest3 = findViewById(R.id.quest3);
        quest4 = findViewById(R.id.quest4);
        quest5 = findViewById(R.id.quest5);
        quest6 = findViewById(R.id.quest6);
        quest7 = findViewById(R.id.quest7);

        btn_q1();
        // ação do botão 2
        btn_q2();
        btn_q3();
        btn_q4();
        btn_q5();
        btn_q6();





        quest7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuest7 = new Intent(MainActivity.this,Quest7.class);
                startActivity(intentQuest7);
            }
        });
    }

    private void btn_q6() {
        quest6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuest6 = new Intent(MainActivity.this,Quest6.class);
                startActivity(intentQuest6);
            }
        });
    }

    private void btn_q5() {
        quest5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuest5 = new Intent(MainActivity.this,Quest5.class);
                startActivity(intentQuest5);
            }
        });
    }

    private void btn_q4() {
        quest4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuest4 = new Intent(MainActivity.this,Quest4.class);
                startActivity(intentQuest4);
            }
        });
    }

    private void btn_q3() {
        quest3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuest3 = new Intent(MainActivity.this,Quest3.class);
                startActivity(intentQuest3);
            }
        });
    }

    private void btn_q2() {
        quest2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuest2 = new Intent(MainActivity.this,Quest2.class);
                startActivity(intentQuest2);
            }
        });
    }

    private void btn_q1() {
        quest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentQuest1 = new Intent(MainActivity.this,Quest1.class);
                startActivity(intentQuest1);
            }
        });
    }
}