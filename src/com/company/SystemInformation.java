package com.company;

class SystemInformation extends Decorator {

    public SystemInformation(
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
        return "Java: "
                + System.getProperty("java.version")
                + "\nSystem: "
                + System.getProperty("os.name")
                + "\n";
    }
}
