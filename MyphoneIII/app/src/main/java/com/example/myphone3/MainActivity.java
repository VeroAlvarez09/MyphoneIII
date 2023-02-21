package com.example.myphone3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String TAG = "Depuración";
    EditText sideone, sideTwo;
    TextView resultado;
    Button Calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy en onCreate: ");
        sideone =findViewById(R.id.sideone);
        sideTwo =findViewById(R.id.sideTwo);
        resultado =findViewById(R.id.Resultado);
        Calcular =findViewById(R.id.Calcular);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entre a onStart: ");
        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float ladouno = Float.parseFloat(sideone.getText().toString());
                float ladodos = Float.parseFloat(sideTwo.getText().toString());
                float Resultado = ladouno*ladodos;
                resultado.setText(String.valueOf(Resultado));
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entre a onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entre a onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entre a onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entre a onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entre a onDestroy: ");
    }
}


