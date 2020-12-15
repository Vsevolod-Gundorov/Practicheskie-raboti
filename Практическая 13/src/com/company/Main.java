package com.company;

public class Main {

    public static void main(String[] args) {
        ArabianDigitsOperations obj = new ArabianDigitsOperations();
        BinaryDigitsOperations obj1 = new BinaryDigitsOperations();
        System.out.println("Result of arabian digits countings");
        System.out.println(obj.Add(obj.Substract(obj.Multiply(obj.Variable(), obj.Variable()), obj.Multiply(obj.Const(2), obj.Variable())), obj.Const(1)));
        System.out.println("Result of binary digits countings");
        System.out.println(obj1.Add(obj1.Substract(obj1.Multiply(obj1.Variable(), obj1.Variable()), obj1.Multiply(obj1.Const(2), obj1.Variable())), obj1.Const(1)));
    }
}
