package com.example.m2stri.projet_cantal_hernandez;

/**
 * Created by guill on 21/11/2016.
 */

public class Element {
    private int image;
    private String nom;
    private String album;

    public Element(int image, String nom, String album) {
        this.image = image;
        this.nom = nom;
        this.album = album;
    }

    public int getImage() {
        return image;
    }

    public String getNom() {
        return nom;
    }

    public String getAlbum() {
        return album;
    }
}