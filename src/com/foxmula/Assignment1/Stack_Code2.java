package com.foxmula.Assignment1;

import java.util.Scanner;

class Stack_Code2     //implementation of required class
{
    public void display(Stack St1, Stack St2)   //Function for compare the number of elements in both stack
    {
        if(St1.count()==St2.count())
        {
            System.out.println("Total number of elements in both stack are same: "+St1.count());
        }
    }

    public static void main(String []args)    //main function
    {
        Scanner sc = new Scanner(System.in);
        Stack S1=new Stack();     //Object declaration for Stack 1
        Stack S2=new Stack();	  //Object declaration for Stack 2
        int ch,data;
        Stack_Code2 si=new Stack_Code2();

        while(true)
        {
            System.out.println("\n@@@@@@  Please Enter a valid choice  @@@@@@\n");
            System.out.println("\n1. Push in Stack 1");
            System.out.println("\n2. Pop in Stack 1");
            System.out.println("\n3. Push in Stack 2");
            System.out.println("\n4. Pop in Stack 1");
            System.out.println("\n5. Exit");

            ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    S1.Push(data);
                    si.display(S1,S2);
                    break;

                case 2 :
                    S1.pop();
                    si.display(S1,S2);
                    break;

                case 3:
                    System.out.println("Enter the data");
                    data = sc.nextInt();
                    S2.Push(data);
                    si.display(S1,S2);
                    break;

                case 4 :
                    S2.pop();
                    si.display(S1,S2);
                    break;

                case 5 :
                    System.exit(0);
                    break;
            }
        }
    }
}