package com.octavio.ruber.miscontactos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetalleContacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contacto);

        Bundle parametros=getIntent().getExtras();
        String nombre=parametros.getString(getResources().getString(R.string.pnombre));//equivale a si solo tengo el texto nombre
        String telefono=parametros.getString(getResources().getString(R.string.ptelefono));//telefono
        String email=parametros.getString(getResources().getString(R.string.pemail));//email

    }
}
