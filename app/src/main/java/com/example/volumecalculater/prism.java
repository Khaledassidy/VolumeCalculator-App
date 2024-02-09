package com.example.volumecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class prism extends AppCompatActivity {
    ImageView imageprism;
    EditText lengthprism,widthprism,heightprism;
    TextView resultprism;
    Button calculatevolume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prism);
        imageprism=findViewById(R.id.imageprism);
        lengthprism=findViewById(R.id.lengthprism);
        widthprism=findViewById(R.id.widthprism);
        heightprism=findViewById(R.id.heghtprism);
        resultprism=findViewById(R.id.resultprism);
        calculatevolume=findViewById(R.id.calculatevolume);
        int prismimage=pudata();
        imageprism.setImageResource(prismimage);
        calculatevolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=calculatevolume();
                String resultvolume=calculatevolume();
                resultprism.setText("V= "+resultvolume+" cm^3");
            }
        });
    }
    public int pudata(){
        Intent intent=getIntent();
        int img=intent.getIntExtra("picture3",0);
        return img;
    }

    public String calculatevolume(){
        String x= lengthprism.getText().toString();
        String t= widthprism.getText().toString();
        String j= heightprism.getText().toString();
        double  y=Double.parseDouble(x);
        double  f=Double.parseDouble(t);
        double  a=Double.parseDouble(j);
        double result=y*f*a;
        String stri_result=String.valueOf(result);
        return stri_result;
    }
}