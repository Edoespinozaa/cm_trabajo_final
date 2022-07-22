package com.example.final_inicio_registro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegistroActivity extends AppCompatActivity {

    TextView btn;

    private EditText inputUsuario,inputContrase,inputEmail,inputRepContrase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        btn=findViewById(R.id.yaTengoCuenta);
        inputUsuario=findViewById(R.id.usuarioReg;
        inputContrase=findViewById(R.id.contraseReg);
        inputEmail=findViewById(R.id.emailReg);
        inputRepContrase=findViewById(R.id.confirmContraseReg);

        comprobarCredenciales();



        btn.setOnClickListener(new View.OnClickListener() {

            startActivity(new Intent(RegistroActivity.this,LoginActivity.class));
        });
    }

    private void comprobarCredenciales() {
        String usuario=inputUsuario.getText().toString();

    }


}