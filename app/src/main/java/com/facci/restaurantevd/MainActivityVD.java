package com.facci.restaurantevd;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

///DOMINGUEZ ALVIA VICTOR ARMANDO

public class MainActivityVD extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_vd);
    }

    public void Click1(View v){
        Toast.makeText(MainActivityVD.this, "Pizza", Toast.LENGTH_SHORT).show();
    }

    public void Click2(View v){
        Toast.makeText(MainActivityVD.this,"Viche de Pescado",Toast.LENGTH_SHORT).show();
    }

    public void Click3(View v){
        Toast.makeText(MainActivityVD.this,"Ceviche",Toast.LENGTH_SHORT).show();
    }

    public void Click4(View v){
        Toast.makeText(MainActivityVD.this,"Arroz con Pollo",Toast.LENGTH_SHORT).show();
    }

    public void Click5(View v){
        Toast.makeText(MainActivityVD.this,"Mariscos",Toast.LENGTH_SHORT).show();
    }

    public void Click6(View v){
        Toast.makeText(MainActivityVD.this,"Tacos",Toast.LENGTH_SHORT).show();
    }

    public void Click7(View v){
        Toast.makeText(MainActivityVD.this,"Pescado",Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_vd, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
