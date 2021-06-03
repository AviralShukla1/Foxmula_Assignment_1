package com.foxmula.Assignment3;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner (System.in);

        // Answer 2
        System.out.println("Enter a number");
        int n=s.nextInt();
        InvalidExc ob = new InvalidExc();
        ob.process(n);
        s.close();
    }

}
