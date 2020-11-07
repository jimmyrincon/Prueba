package com.edwinpaezalonso.girardothistorico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.config) {
            lanzarVisitarActivity(null);
            return true;

        }

        if (id == R.id.menu_buscar) {
            lanzarMapaActivity(null);
            return true;
        }

        return super.onOptionsItemSelected(item);


    }

    public void lanzarVisitarActivity(View view) {

        Intent i = new Intent(MainActivity.this, ListaUnoActivity.class);
        startActivity(i);

        Toast toasti =
                Toast.makeText(MainActivity.this, "Seleccione el Lugar", Toast.LENGTH_LONG);
        toasti.show();
    }

    public void lanzarMapaActivity(View view) {

       Toast toastj =
                Toast.makeText(MainActivity.this, "Busque en el Mapa", Toast.LENGTH_LONG);
        toastj.show();
    }
}