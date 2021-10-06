package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

class DateInformation extends Decorator {

    public DateInformation(
            Information decoratedInformation) {
        super(decoratedInformation);
    }

    @Override
    public void print() {
        decoratedInformation.print();
        System.out.println(getInformation());
    }

    @Override
    public String getInformation() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(
                "yyyy-MM-dd");
        return "Date: " + simpleDateFormat.format(new Date()) + "\n";
    }
}
