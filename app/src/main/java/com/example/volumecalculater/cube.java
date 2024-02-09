package com.example.volumecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class cube extends AppCompatActivity {
    ImageView imagecube;
    EditText lengthcube;
    TextView Resultcube;
    Button calculatecube;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);
        imagecube=findViewById(R.id.imagecube);
        lengthcube=findViewById(R.id.lengcube);
        Resultcube=findViewById(R.id.resultvolumecube);
        calculatecube=findViewById(R.id.calculatecube);
        int cubeimage=pudata();
        imagecube.setBackgroundResource(cubeimage);
        calculatecube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=calculatevolume();
                String resultvolume=calculatevolume();
                Resultcube.setText("V= "+resultvolume+" cm^3");
            }
        });
    }

    public int pudata(){
        Intent intent=getIntent();
        int img=intent.getIntExtra("picture1",0);
        return img;
    }

    public String calculatevolume(){
        String x= lengthcube.getText().toString();
        double  y=Double.parseDouble(x);
        double result=Math.pow(y,3);
        String stri_result=String.valueOf(result);
        return stri_result;
    }
}