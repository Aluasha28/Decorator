package com.company;


public class Main {

    public static void main(String[] args) {

        Information basic
                = new BasicInformation();
        print("BASIC", basic);
        Information date
                = new DateInformation(basic);
        print("DATE", date);
        Information system
                = new SystemInformation(basic);
        print("SYSTEM", system);
        Information all
                = new SystemInformation(date);
        print("ALL", all);

    }

    private static void print(String type, Information information) {

        System.out.println("****** " + type + " ******");
        information.print();
        System.out.println();
    }
}



