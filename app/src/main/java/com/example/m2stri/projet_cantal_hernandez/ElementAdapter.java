package com.example.m2stri.projet_cantal_hernandez;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by guill on 21/11/2016.
 */
public class ElementAdapter extends ArrayAdapter<Element> {

    public ElementAdapter(Context context, List<Element> elements) {
        super(context, 0, elements);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.element_list_layout,parent, false);
        }

        ElementViewHolder elementViewHolder = (ElementViewHolder) convertView.getTag();
        if(elementViewHolder == null){
            elementViewHolder = new ElementViewHolder();
            elementViewHolder.nom = (TextView) convertView.findViewById(R.id.nom);
            elementViewHolder.album = (TextView) convertView.findViewById(R.id.album);
            elementViewHolder.image = (ImageView) convertView.findViewById(R.id.image);
            convertView.setTag(elementViewHolder);
        }

        Element element = getItem(position);

        elementViewHolder.nom.setText(element.getNom());
        elementViewHolder.album.setText(element.getAlbum());
        elementViewHolder.image.setImageResource(element.getImage());

        return convertView;
    }

    /**
     * un element est composé d'un album, nom et image
     */
    private class ElementViewHolder{
        public TextView album;
        public TextView nom;
        public ImageView image;
    }
}