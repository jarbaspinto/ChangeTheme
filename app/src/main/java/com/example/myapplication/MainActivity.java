package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Context context;
    private AlertDialog alerta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.onActivityCreateSetTheme(MainActivity.this);
        setContentView(R.layout.activity_main);

        setContext();
        loadViews();
        clickButton();

    }
    private void clickButton(){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"Click Button",Toast.LENGTH_SHORT).show();
                alertaVisual();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.changeToTheme(MainActivity.this, Utils.THEME_DEFAULT);
                Toast.makeText(context,"Click Purple",Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.changeToTheme(MainActivity.this, Utils.THEME_ORGANGE);
                Toast.makeText(context,"Click Orange",Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utils.changeToTheme(MainActivity.this, Utils.THEME_GREEN);
                Toast.makeText(context,"Click Green",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadViews(){
        button = findViewById(R.id.button);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
    }

    private void setContext(){
        context = getApplicationContext();
    }

    private void alertaVisual(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("titulo");
        builder.setMessage("campo de mensagem");
        builder.setPositiveButton("botao positivo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(context,"positivou", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("botao negativo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(context,"Negativou", Toast.LENGTH_SHORT).show();
                alerta.cancel();
            }
        });
        alerta = builder.create();
        alerta.show();
    }
}