package com.octavio.ruber.miscontactos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Contacto> contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactos=new ArrayList<Contacto>();

        contactos.add(new Contacto("Laura Rachel","99445540","rachelitaxd@gmail.com"));
        contactos.add(new Contacto("Octavio Palomino","99423440","octavio@hotmail.com"));
        contactos.add(new Contacto("Mama","99445330","mama@gmail.com"));
        contactos.add(new Contacto("Papa","99235540","papa@gmail.com"));
        contactos.add(new Contacto("Tio","99476540","tio@gmailcom"));

        ArrayList<String>nombresContacto=new ArrayList<String>();
        for (Contacto contacto:contactos) {
            nombresContacto.add(contacto.getNombre());
            
        }

        ListView lstContactos=(ListView) findViewById(R.id.lstContactos);
        lstContactos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, nombresContacto));

        lstContactos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this,DetalleContacto.class);
                Intent.putExtra(getResources().getString(R.string.pnombre),contactos.get(position).getNombre());
                Intent.putExtra(getResources().getString(R.string.ptelefono),contactos.get(position).getTelefono());
                Intent.putExtra(getResources().getString(R.string.pemail),contactos.get(position).getEmail());
                

                startActivity(intent);

            }
        })
    }
}
