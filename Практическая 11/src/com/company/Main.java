package com.company;

public class Main {

    public static void main(String[] args) {
        ChairFactory obj = new ChairFactory();
        obj.createFunctionalChair().created();
        obj.createFunctionalChair().sum(993, 7);
        System.out.println();
        obj.createMagicChair().created();
        obj.createMagicChair().doMagic();
        System.out.println();
        obj.createVictorianChair();
    }
}
