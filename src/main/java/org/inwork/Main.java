package org.inwork;

public class Main {
    public static void main(String[] args) {
        SingleTon.getInstance();
        System.out.println();
        // пробуем создать экземпляр класс еще раз
        SingleTon.getInstance();


        Laptop laptop = new Laptop();
        laptop.run("Linux");
        // пробуем создать экземпляр класс еще раз
        Laptop laptop1 = new Laptop();
        laptop1.run("Window");

    }
}