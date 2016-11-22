package com.example.m2stri.projet_cantal_hernandez;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by guill on 21/11/2016.
 */

public class Liste extends Fragment {
    ListView liste;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        liste = (ListView) view.findViewById(R.id.liste1);
        List<Element> elements = genererElements();

        ElementAdapter adapter = new ElementAdapter(super.getContext(),elements);
        liste.setAdapter(adapter);

        super.onViewCreated(view, savedInstanceState);

        getActivity().setTitle("Accueil");
    }

    private List<Element> genererElements(){
        List<Element> elements = new ArrayList<Element>();
        elements.add(new Element(R.drawable.acdc, "ACDC", "back in black"));
        elements.add(new Element(R.drawable.acdc, "ACDC", "back in black"));
        elements.add(new Element(R.drawable.acdc, "ACDC", "back in black"));
        elements.add(new Element(R.drawable.acdc, "ACDC", "back in black"));
        elements.add(new Element(R.drawable.acdc, "ACDC", "back in black"));

        return elements;
    }

}
