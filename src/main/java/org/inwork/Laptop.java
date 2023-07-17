package org.inwork;

public class Laptop {
    public Os os;
    public static final String model = "Hp";

    public void run(String osName) {
        os = Os.getInstance(osName);

    }
}
