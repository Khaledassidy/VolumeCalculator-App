package com.example.volumecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class cylinder extends AppCompatActivity {
    ImageView imagecylinder;
    EditText rediuscylinder,heightcylinder;
    TextView resultcylinder;
    Button calculatevolumecylinder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);
        imagecylinder=findViewById(R.id.imagecylinder);
        rediuscylinder=findViewById(R.id.rediuscylinder);
        heightcylinder=findViewById(R.id.heightcylinder);
        calculatevolumecylinder=findViewById(R.id.calculateVcylinder);
        resultcylinder=findViewById(R.id.resultvolumecylinder);
        int cylinderimage=pudata();
        imagecylinder.setBackgroundResource(cylinderimage);

        calculatevolumecylinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=calculatevolume();
                String resultvolume=calculatevolume();
                resultcylinder.setText("V= "+resultvolume+" cm^3");
            }
        });
    }

    public int pudata(){
        Intent intent=getIntent();
        int img=intent.getIntExtra("picture0",0);
        return img;
    }

    public String calculatevolume(){
        String x= rediuscylinder.getText().toString();
        String t= heightcylinder.getText().toString();
        double  y=Double.parseDouble(x);
        double  f=Double.parseDouble(t);
        double result=Math.PI*Math.pow(y,2)*f;
        String stri_result=String.valueOf(result);
        return stri_result;
    }
}