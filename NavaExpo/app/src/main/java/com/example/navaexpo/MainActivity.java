package com.example.navaexpo;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String deportesList[] ={"futbol","basquet","rugby"};
    int deportesImagenes[]= {R.drawable.images, R.drawable.images2, R.drawable.images3};

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.custumListView);
        Adaptador adaptador = new Adaptador( getApplicationContext(),deportesList,deportesImagenes);
        listView.setAdapter(adaptador);

            }
}