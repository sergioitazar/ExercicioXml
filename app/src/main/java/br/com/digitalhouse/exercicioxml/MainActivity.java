package br.com.digitalhouse.exercicioxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.digitalhouse.exercicioxml.R;

public class MainActivity extends AppCompatActivity {

    private EditText editNome;
    private EditText editEmail;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNome = (EditText) findViewById(R.id.editNome);
        editEmail = (EditText) findViewById(R.id.editMail);
        btnEnviar = (Button) findViewById(R.id.btnEnviar);

        // inclui click no botao
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        // verificar se o nome esta vazio mostra mensagem e coloco o foco no nome ate acertar
              if (editNome.getText().toString().equals("")){
                  Toast.makeText(MainActivity.this, "Preencha o campo nome",Toast.LENGTH_SHORT).show();
                  editNome.requestFocus();
                  return;
              }

              // verificar se o email esta vazio
              if (editEmail.getText().toString().equals("")){
                  Toast.makeText(MainActivity.this,"Preencha o campo e-mail", Toast.LENGTH_SHORT).show();
                  editEmail.requestFocus();
                  return;
              }

              Toast.makeText(MainActivity.this,"Dados OK",Toast.LENGTH_SHORT).show();
            }

        });
    }
}
