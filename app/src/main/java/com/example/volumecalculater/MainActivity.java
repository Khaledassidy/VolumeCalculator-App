package com.example.volumecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    TextView Title;
    Costtumeaddapter costtumeaddapter;
    ArrayList<shape> Arrayofshape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.grid);
        Title=findViewById(R.id.Title);
        data();
        costtumeaddapter = new Costtumeaddapter(this, Arrayofshape);
        gridView.setAdapter(costtumeaddapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int i=position;
                shape sh=costtumeaddapter.getItem(position);
                if(i==0){
                    Intent intent=new Intent(getApplicationContext(), sphere.class);
                    intent.putExtra("picture",sh.getPricturesource());
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent=new Intent(getApplicationContext(), cylinder.class);
                    intent.putExtra("picture0",sh.getPricturesource());
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent=new Intent(getApplicationContext(), cube.class);
                    intent.putExtra("picture1",sh.getPricturesource());
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent=new Intent(getApplicationContext(), cone.class);
                    intent.putExtra("picture2",sh.getPricturesource());
                    startActivity(intent);
                }

                if(i==4){
                    Intent intent=new Intent(getApplicationContext(), prism.class);
                    intent.putExtra("picture3",sh.getPricturesource());
                    startActivity(intent);
                }

                if(i==5){
                    Intent intent=new Intent(getApplicationContext(), hexagonal.class);
                    intent.putExtra("picture4",sh.getPricturesource());
                    startActivity(intent);
                }

            }
        });
    }
    public void data(){
        Arrayofshape=new ArrayList<>();
        shape shape1 = new shape(R.drawable.sphere, "Sphere");
        shape shape2 = new shape(R.drawable.cylender, "Cylinder");
        shape shape3 = new shape(R.drawable.cube, "Cube");
        shape shape4 = new shape(R.drawable.cone, "Cone");
        shape shape5 = new shape(R.drawable.prism, "Prism");
        shape shape6 = new shape(R.drawable.hexagonalprism, "Hexagonal_prism");
        Arrayofshape.add(shape1);
        Arrayofshape.add(shape2);
        Arrayofshape.add(shape3);
        Arrayofshape.add(shape4);
        Arrayofshape.add(shape5);
        Arrayofshape.add(shape6);
    }


}