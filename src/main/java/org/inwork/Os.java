package org.inwork;

public class Os {
    private static Os instance;

    public String name;

    protected Os(String name) {
        this.name = name;
    }

    public static Os getInstance(String name) {
        if (instance == null) {
            instance = new Os(name);
            System.out.println("run " + name +" on device " + Laptop.model);

        }
        return instance;
    }
}
