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

public class cone extends AppCompatActivity {
    ImageView imagecone;
    EditText rediuscone,heightcone;
    TextView resultcone;
    Button calculatevolumecone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cone);
        imagecone=findViewById(R.id.imagecone);
        rediuscone=findViewById(R.id.rediuscone);
        heightcone=findViewById(R.id.heghtcone);
        resultcone=findViewById(R.id.resultvolumecone);
        calculatevolumecone=findViewById(R.id.calculatecone);
        int coneimage=pudata();
        imagecone.setBackgroundResource(coneimage);
        calculatevolumecone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=calculatevolume();
                String resultvolume=calculatevolume();
                resultcone.setText("V= "+resultvolume+" cm^3");
            }
        });
    }

    public int pudata(){
        Intent intent=getIntent();
        int img=intent.getIntExtra("picture2",0);
        return img;
    }

    public String calculatevolume(){
        String x= rediuscone.getText().toString();
        String t= heightcone.getText().toString();
        double  y=Double.parseDouble(x);
        double  f=Double.parseDouble(t);
        double result=(Math.PI*f*Math.pow(y,2))/3;

        String stri_result=String.valueOf(result);
        return stri_result;
    }
}