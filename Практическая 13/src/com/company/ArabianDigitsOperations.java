package com.company;

import java.util.Scanner;

public class ArabianDigitsOperations extends OperationsOnDigits{
    Scanner console = new Scanner(System.in);
    public String c = console.nextLine();
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
        return a + b;
    }

    @Override
    public int Substract(int a, int b) {
        return a - b;
    }

    @Override
    public int Multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int Divide(int a, int b) {
        return a/b;
    }
}
