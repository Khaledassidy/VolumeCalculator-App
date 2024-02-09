package com.example.volumecalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class hexagonal extends AppCompatActivity {
    ImageView imagehexa;
    EditText lengthhexa,widthhexa,heighthexa;
    TextView resulthexa;
    Button calculatevolume;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hexagonal);
        imagehexa=findViewById(R.id.imagehexagonal);
        lengthhexa=findViewById(R.id.lengthhexa);
        widthhexa=findViewById(R.id.widthhexa);
        heighthexa=findViewById(R.id.heghthexa);
        resulthexa=findViewById(R.id.resultvolumehexa);
        calculatevolume=findViewById(R.id.calculatehexa);
        int hexaimage=pudata();
        imagehexa.setBackgroundResource(hexaimage);

        calculatevolume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x=calculatevolume();
                String resultvolume=calculatevolume();
                resulthexa.setText("V= "+resultvolume+" cm^3");
            }
        });
    }

    public int pudata(){
        Intent intent=getIntent();
        int img=intent.getIntExtra("picture4",0);
        return img;
    }

    public String calculatevolume(){
        String x= lengthhexa.getText().toString();
        String t= widthhexa.getText().toString();
        String j= heighthexa.getText().toString();
        double  y=Double.parseDouble(x);
        double  f=Double.parseDouble(t);
        double  a=Double.parseDouble(j);
        double result=Math.pow((y*f),2)*a*(5.19615242/2);
        String stri_result=String.valueOf(result);
        return stri_result;
    }
}