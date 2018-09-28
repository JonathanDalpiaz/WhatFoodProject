package br.edu.unoesc.pdm.whatfood.ui;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.edu.unoesc.pdm.whatfood.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void mostrarReceita(View v){

        Intent intent = new Intent(this, ReceitaActivity.class);
        startActivity(intent);
        finish();

    }

    public void mostrarAlimento(View v){

        Intent intent = new Intent(this, AlimentosCadastradosActivity.class);
        startActivity(intent);
        finish();

    }

    public void cadastrarAlimento(View v){

        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
        finish();

    }

}
