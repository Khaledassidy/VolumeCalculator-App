package com.example.volumecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class sphere extends AppCompatActivity {
    ImageView imagesphere;
    EditText RediusSphere;
    TextView ResultSphere;
    Button calculatesphere;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sphere);
        imagesphere=findViewById(R.id.imagesphere);
        RediusSphere=findViewById(R.id.redsphere);
        ResultSphere=findViewById(R.id.resultsphere);
        calculatesphere=findViewById(R.id.calVolumeshphere);
        int sphereimage=pudata();
        imagesphere.setBackgroundResource(sphereimage
        );


        calculatesphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=calculatevolume();
                String resultvolume=calculatevolume();
                ResultSphere.setText("V= "+resultvolume+" m^3");


            }
        });



    }

    public int pudata(){
        Intent intent=getIntent();
        int img=intent.getIntExtra("picture",0);
        return img;
    }

    public String calculatevolume(){
        String x= RediusSphere.getText().toString();
        double  y=Double.parseDouble(x);
        double result=4/3*Math.PI*Math.pow(y,3);
        String stri_result=String.valueOf(result);
        return stri_result;
        }





    }
