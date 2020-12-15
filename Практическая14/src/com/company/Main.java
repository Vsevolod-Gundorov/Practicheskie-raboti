package com.company;

public class Main {

    public static void main(String[] args) {
	Person obj = new Person();
        long startTime, estimatedTime;
        startTime = System.nanoTime();
        System.out.println("Что мы знаем о данном человеке " + obj.toString());
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("С учётом времени, затраченного на ввод данных, программа выполняется за " + estimatedTime/1000000000 + " секунд");
    }
}
