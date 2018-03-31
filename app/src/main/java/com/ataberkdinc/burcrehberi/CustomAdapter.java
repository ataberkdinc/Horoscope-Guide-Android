package com.ataberkdinc.burcrehberi;

/**
 * Created by ataberkdinc on 15.01.2018.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomAdapter extends ArrayAdapter<String> {

    Context c;
    String[] burclar;
    int[] images;
    LayoutInflater inflater;


    public CustomAdapter(Context context, String[] burclar,int[] images){
        super(context, R.layout.rowmodel, burclar);

        this.c=context;
        this.burclar=burclar;
        this.images=images;
    }

    public class ViewHolder
    {
        TextView burcTv;
        ImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        if(convertView==null)
        {
            inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.rowmodel,null);
        }
        ViewHolder holder = new ViewHolder();
        holder.burcTv=(TextView)convertView.findViewById(R.id.tv1);
        holder.img=(ImageView)convertView.findViewById(R.id.iv1);
        holder.burcTv.setText(burclar[position]);
        holder.img.setImageResource(images[position]);

        return convertView;
    }
}
