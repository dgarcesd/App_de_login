package com.example.appdelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.appdelogin.Clases.Usuario;
import com.example.appdelogin.databinding.ViewBinding;

public class View extends AppCompatActivity {

    private ViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view);
        Bundle extras = getIntent().getExtras();
        Usuario usuario = extras.getParcelable("User");
        binding.resultado.append(usuario.getEmail());
    }
}