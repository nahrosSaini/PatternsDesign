package com.Creational.PrototypeExample;

public abstract class Item implements Cloneable{

    private String title;
    private String url;
    private double price;

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
