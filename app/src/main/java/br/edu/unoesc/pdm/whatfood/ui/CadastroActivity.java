package br.edu.unoesc.pdm.whatfood.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;


public class CadastroActivity extends AppCompatActivity {

    private Spinner medidaQtd;
    private EditText edtQuantidade;
    private EditText edtAlimento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

    }

    public Spinner getMedidaQtd() {
        return medidaQtd;
    }

    public void setMedidaQtd(Spinner medidaQtd) {
        this.medidaQtd = medidaQtd;
    }

    public EditText getEdtQuantidade() {
        return edtQuantidade;
    }

    public void setEdtQuantidade(EditText edtQuantidade) {
        this.edtQuantidade = edtQuantidade;
    }

    public EditText getEdtAlimento() {
        return edtAlimento;
    }

    public void setEdtAlimento(EditText edtAlimento) {
        this.edtAlimento = edtAlimento;
    }

    public void gravarDados(View v){

    }

    public void limpar(View v){

        edtQuantidade.setText("");
        edtAlimento.setText("");

    }

    public void voltar(View v){

        edtQuantidade.setText("");
        edtAlimento.setText("");
        Intent intent = new Intent(CadastroActivity.this,MainActivity.class);
        startActivity(intent);

    }

}
