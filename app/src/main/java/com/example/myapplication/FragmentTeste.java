package com.example.myapplication;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentTeste extends Fragment {
    private TextView textView1;
    private TextView textView2;
    private AlertDialog alerta;


    public FragmentTeste() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_teste, container, false);
        Button buttonFrag = view.findViewById(R.id.buttonFragment);
        buttonFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        textView1 = view.findViewById(R.id.textView21);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertaVisual();
            }
        });
        textView2 = view.findViewById(R.id.textView22);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertaVisual();
            }
        });
        return view;
    }
    private void alertaVisual(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle("titulo");
        builder.setMessage("campo de mensagem");
        builder.setPositiveButton("botao positivo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(),"positivou", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("botao negativo", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getContext(),"Negativou", Toast.LENGTH_SHORT).show();
            }
        });
        alerta = builder.create();
        alerta.show();
    }
}