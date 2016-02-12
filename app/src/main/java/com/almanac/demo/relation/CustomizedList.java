package com.almanac.demo.relation;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.awt.font.TextAttribute;

/**
 * Created by 1415020 on 11-02-2016.
 */
public class CustomizedList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] names;
    private final String[] relations;
    private final Integer[] ImageIds;
    public CustomizedList(Activity context,String[] names,String[] relations,Integer[] imageIds ){
        super(context,R.layout.row,names);
        this.context=context;
        this.names=names;
        this.relations=relations;
        this.ImageIds=imageIds;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = this.context.getLayoutInflater();
        View rowview;
        rowview = inflater.inflate(R.layout.row,null,true);


        TextView nameoftheperson = (TextView) rowview.findViewById(R.id.nameOfPerson);
        TextView relationships=(TextView) rowview.findViewById(R.id.relationOfPerson);
        ImageView pics = (ImageView) rowview.findViewById(R.id.imageView);

        nameoftheperson.setText(names[position]);
        relationships.setText(relations[position]);
        pics.setImageResource(ImageIds[position]);

        return rowview;



    }
}

