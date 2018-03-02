package com.example.jzavala.pruebarepo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
Button save,clan;
EditText etNombre,etAp,etSex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        save = findViewById(R.id.btnSave);
        clan = findViewById(R.id.btnClear);
        etNombre= findViewById(R.id.etNOmbre);
        etAp= findViewById(R.id.etApellido);
        etSex= findViewById(R.id.etSexo);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"SAVe",Toast.LENGTH_LONG).show();
            }
        });

        clan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNombre.setVisibility(View.GONE);
                etAp.setVisibility(View.GONE);
                etSex.setVisibility(View.GONE);



            }
        });
    }
}
