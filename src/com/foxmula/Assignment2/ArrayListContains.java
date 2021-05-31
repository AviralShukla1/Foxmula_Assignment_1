package com.foxmula.Assignment2;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListContains {

    public static void main(String[] args) {

        ArrayList<Integer> elements = new ArrayList<>();
        Scanner SC = new Scanner(System.in);

        while(true) {
            System.out.println("Press 1 if you want to add ");
            int choice = SC.nextInt();
            if(choice == 1) {
                System.out.println("Enter the element you want to add: ");
                int num = SC.nextInt();
                elements.add(num);
            }
            else
                {
                break;
            }
        }

        for(int elem: elements) {
            System.out.print(elem + " ");
        }

        System.out.println();
        System.out.println("Enter the element which you want to check whether it is present or not: ");
        int check = SC.nextInt();
        if(elements.contains(check)) {
            System.out.println(check + " is present in the arraylist...");
        }
        else {
            System.out.println("Element is not present in the arraylist");
        }

    }

}