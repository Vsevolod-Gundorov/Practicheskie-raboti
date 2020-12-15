package com.company;

import java.util.Scanner;

public class ComplexDigit implements Complex
{
    ComplexDigit() {
        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        System.out.println("You made complex " + a);
    }
}
