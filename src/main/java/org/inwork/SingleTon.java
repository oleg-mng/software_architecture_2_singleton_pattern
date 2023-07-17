package org.inwork;

public class SingleTon {
    private static SingleTon instance;
    private SingleTon(){};

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
            System.out.println("создали only 1 Singleton");
        }
        return instance;
    }
}
