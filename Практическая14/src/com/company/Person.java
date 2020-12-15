package com.company;
import java.util.Scanner;

public class Person
{
    public String toString() {

        Scanner console = new Scanner(System.in);
        System.out.print("If person has surname write surname: ");
        String surName = console.nextLine();
        System.out.print("If person has name write name: ");
        String name = console.nextLine();
        System.out.print("If person has midname write midname: ");
        String midName = console.nextLine();
        if(midName == null )
        {
            return surName + " " + name;
        }
        else if(name == null && midName == null)
        {
            return surName;
        }
        else if(name == null )
        {
            return surName + midName;
        }
        else
            {
            return surName + " " + name + " " + midName;
        }
    }
}
