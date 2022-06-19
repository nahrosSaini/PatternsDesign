package com.Creational.Factory;

public class FactoryMainDemo {

    public static void main(String args[]){

        Website website=WebsiteFactory.getWebsite("shop");

        System.out.println(website.getPages());

        Website website1=WebsiteFactory.getWebsite("blog");

        System.out.println(website1.getPages());
    }
}
