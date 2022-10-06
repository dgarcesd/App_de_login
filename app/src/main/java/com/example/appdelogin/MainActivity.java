package com.example.appdelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.example.appdelogin.Clases.Usuario;
import com.example.appdelogin.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private EditText mail;
    private EditText password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mail = binding.email;
        password = binding.email;

        binding.entrarButton.setOnClickListener(view -> {
            cambiar_vista();
        });
    }


        public boolean validarEmail() {

            String email = mail.getText().toString();

            if (!email.isEmpty()) {
                Log.i("infoEmail", "Email correcto");
                return true;
            } else {
                Log.i("infoEmail", "Email incorrecto");
                return false;
            }
        }

        public boolean validarContraseña() {

            String contraseña = password.getText().toString();

            if (!contraseña.isEmpty()) {
                Log.i("infoContraseña", "Contraseña correcta");
                return true;
            } else {
                Log.i("infoContraseña", "Contraseña incorrecta");
                return false;
            }

        }

    private void cambiar_vista() {

        if (validarEmail() == true && validarContraseña() == true) {
            Usuario usuario = new Usuario (binding.email.getText().toString(), binding.contraseA.getText().toString());
            Intent goDetail = new Intent(this, View.class);
            goDetail.putExtra("usuario", usuario);
            startActivity(goDetail);
        }

    }


}
