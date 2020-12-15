package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class BinaryDigitsOperations extends OperationsOnDigits{
    Scanner console = new Scanner(System.in);
    String c = console.nextLine();
    @Override
    public int Const(int a) {
        return a;
    }

    @Override
    public int Variable() {
        return Integer.parseInt(c);
    }

    @Override
    public int Add(int a, int b) {
        return a | b;
    }

    @Override
    public int Substract(int a, int b) {
        return a ^ b;
    }

    @Override
    public int Multiply(int a, int b) {
        return a & b;
    }

    @Override
    public int Divide(int a, int b) {
        return a & (~b);
    }
}
