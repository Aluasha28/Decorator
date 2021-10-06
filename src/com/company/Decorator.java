package com.company;

abstract class Decorator implements Information {
    protected Information decoratedInformation;

    public Decorator(Information decoratedInformation) {
        this.decoratedInformation = decoratedInformation;
    }
}

