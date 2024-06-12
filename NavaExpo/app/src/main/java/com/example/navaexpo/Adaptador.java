package com.example.navaexpo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    Context context;
    String deportesList[];
    int deportesImagenes[];
    LayoutInflater inflater;

    public Adaptador(Context ctx, String[]deportesList, int deportesImagenes[]){
    this.context = ctx;
    this.deportesList = deportesList;
    this.deportesImagenes = deportesImagenes;
    inflater = LayoutInflater.from(ctx);

    }


    @Override
    public int getCount() {
        return deportesList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_costum_list_view, null);
        TextView TxtView = (TextView) convertView.findViewById(R.id.textView);
        ImageView deportesImg= (ImageView)  convertView.findViewById(R.id.imagen1);
        TxtView.setText(deportesList[position]);
        deportesImg.setImageResource(deportesImagenes[position]);
        return convertView;
    }
}
