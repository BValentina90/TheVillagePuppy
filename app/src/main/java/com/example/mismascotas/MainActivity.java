package com.example.mismascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);
        iniciarListaMascotas();
        iniciarAdaptador();
    }

    public void iniciarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void iniciarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota("Lenin", R.drawable.perro1, "0"));
        mascotas.add(new Mascota("Remolina", R.drawable.perro2, "0"));
        mascotas.add(new Mascota("Katuski", R.drawable.perro3, "0"));
        mascotas.add(new Mascota("Natal", R.drawable.perro4, "0"));
        mascotas.add(new Mascota("Noche", R.drawable.perro5, "0"));
    }
}