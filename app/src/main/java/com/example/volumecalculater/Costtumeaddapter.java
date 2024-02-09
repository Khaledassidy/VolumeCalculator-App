package com.example.volumecalculater;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Costtumeaddapter extends ArrayAdapter<shape> {
    private Context context;
    private ArrayList<shape> arrayofshape;

    public Costtumeaddapter(Context context,ArrayList<shape> arrayofshape) {
        super(context,R.layout.template,arrayofshape);
        this.context=context;
        this.arrayofshape=arrayofshape;

    }




    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Viewholder viewholder;
        shape shape1=getItem(position);
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.template,parent,false);
            viewholder=new Viewholder();
            viewholder.imageView=convertView.findViewById(R.id.image);
            viewholder.textView=convertView.findViewById(R.id.name);
            convertView.setTag(viewholder);
        }
        else{
            viewholder=(Viewholder) convertView.getTag();
        }

        viewholder.imageView.setImageResource(shape1.getPricturesource());
        viewholder.textView.setText(shape1.getName());

        return convertView;
    }

    public static class Viewholder{
        ImageView imageView;
        TextView textView;
    }


}