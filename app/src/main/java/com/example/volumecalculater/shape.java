package com.example.volumecalculater;


public class shape  {

    private int pricturesource;
    private String name;

    public shape(int pricturesource, String name) {
        this.pricturesource = pricturesource;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPricturesource() {
        return pricturesource;
    }

    public void setPricturesource(int pricturesource) {
        this.pricturesource = pricturesource;
    }
}
