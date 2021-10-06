package com.company;

public class BasicInformation implements Information{
    @Override
    public void print() {
        System.out.println(getInformation());
    }

    @Override
    public String getInformation() {
        return "Name: Decorator pattern\n"
                + "Author: Alua\n"
                + "Version: 1.0\n";
    }
}
