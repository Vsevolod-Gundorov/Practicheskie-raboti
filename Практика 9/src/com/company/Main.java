package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        try {
            try {
                Scanner console = new Scanner(System.in);
                int a = Integer.parseInt(console.nextLine());
                if(a > 100000000)
                {
                    int result = INN.getMyINN(a);
                    System.out.println("Vsevolod, it's your INN " + result + " if you want to buy product press enter");
                }
                else
                {
                    System.out.println("You can write only INN, please try again!");
                }
            }
            catch (NumberFormatException ex)
            {
                System.err.println("You can write only INN, please try again!");
            }
        }
        catch(INNException ex){

            System.out.println(ex.getMessage());
        }
    }
}
