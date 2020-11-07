package com.edwinpaezalonso.girardothistorico;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListaUnoActivity extends Activity {

    private ListView listView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Display a indeterminate progress bar on title bar
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);

        this.setContentView(R.layout.menu_uno);

        this.listView1 = (ListView) findViewById(R.id.listView1);


        List items = new ArrayList();
        items.add(new ListaUno(R.drawable.ic_arquitectonico, "Catedral Inmaculado Corazón de María",
                ""));
        items.add(new ListaUno(R.drawable.ic_ubicacion, "Hotel Unión",
                ""));
        items.add(new ListaUno(R.drawable.ic_cultural, "Monumento Jorge Eliécer Gaitán",
                ""));
        items.add(new ListaUno(R.drawable.ic_ubicacion, "La Locomotora",
                ""));
        items.add(new ListaUno(R.drawable.ic_arquitectonico, "Puente Férreo",
                ""));
        items.add(new ListaUno(R.drawable.ic_arquitectonico, "Estación del Tren",
                ""));
        items.add(new ListaUno(R.drawable.ic_ubicacion, "", "Gran Hotel"));

        items.add(new ListaUno(R.drawable.ic_cultural, "Camellón del Comercio", ""));

        items.add(new ListaUno(R.drawable.ic_ubicacion, "Parque Bolívar", ""));


        // Sets the data behind this ListView
        this.listView1.setAdapter(new ListaUnoAdapter(this, items));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String s = listView1.getItemAtPosition(position).toString();


                switch (position) {
                    case 0:
                        Intent intent1 = new Intent(ListaUnoActivity.this, CatedralActivity.class);
                        startActivity(intent1);
                        break;
                    case 1:
                        Intent intent2 = new Intent(ListaUnoActivity.this, ClubUnionActivity.class);
                        startActivity(intent2);
                        break;
                    case 2:
                        Intent intent12 = new Intent(ListaUnoActivity.this, ParqueJegActivity.class);
                        startActivity(intent12);
                        /*Toast toast3 =
                                Toast.makeText(ListaUnoActivity.this, "Atractivos Naturales de Girardot", Toast.LENGTH_LONG);
                        toast3.show();*/
                        break;
                    case 3:
                        Intent intent13 = new Intent(ListaUnoActivity.this, LocomotoraActivity.class);
                        startActivity(intent13);
                        /*Toast toast4 =
                                Toast.makeText(ListaUnoActivity.this, "Turismo Recreativo en Girardot", Toast.LENGTH_LONG);
                        toast4.show();*/
                        break;

                    case 4:
                        Intent intent14 = new Intent(ListaUnoActivity.this, PuenteFerreoActivity.class);
                        startActivity(intent14);
                        /*Toast toast5 =
                                Toast.makeText(ListaUnoActivity.this, "Restaurantes y Comidas en Girardot", Toast.LENGTH_LONG);
                        toast5.show();*/
                        break;
                    case 5:
                        Intent intent15 = new Intent(ListaUnoActivity.this, EstacionActivity.class);
                        startActivity(intent15);
                        /*Toast toast6 =
                                Toast.makeText(ListaUnoActivity.this, "Hospedaje en Girardot", Toast.LENGTH_LONG);
                        toast6.show();*/
                        break;
                    case 6:
                        Intent intent16 = new Intent(ListaUnoActivity.this, GranHotelActivity.class);
                        startActivity(intent16);
                        /*Toast toast7 =
                                Toast.makeText(ListaUnoActivity.this, "Transporte en Girardot", Toast.LENGTH_LONG);
                        toast7.show();*/
                        break;
                    case 7:
                        Intent intent17 = new Intent(ListaUnoActivity.this, CamellonActivity.class);
                        startActivity(intent17);
                        /*Toast toast8 =
                                Toast.makeText(ListaUnoActivity.this, "Servicios Médicos en Girardot", Toast.LENGTH_LONG);
                        toast8.show();*/
                        break;
                    case 8:
                        Intent intent18 = new Intent(ListaUnoActivity.this, ParqueBolivarActivity.class);
                        startActivity(intent18);
                        /*Toast toast9 =
                                Toast.makeText(ListaUnoActivity.this, "Atención Emergencias en Girardot", Toast.LENGTH_LONG);
                        toast9.show();*/
                        break;
                    //case 9:
                    //   Intent intent19 = new Intent(MenuUnoActivity.this, ListaPastaActivity.class);
                    //    startActivity(intent19);
                    //    break;
                    // case 10:
                    //    Intent intent20 = new Intent(MenuUnoActivity.this, ListaPerroActivity.class);
                    //    startActivity(intent20);
                    //   break;
                    // case 11:
                    //    Intent intent21 = new Intent(MenuUnoActivity.this, ListaChileActivity.class);
                    //     startActivity(intent21);
                    //    break;
                }
            }



        });
    }

}