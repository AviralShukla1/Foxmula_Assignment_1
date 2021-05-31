package com.foxmula.Assignment2;
import java.util.*;
public class SetContains {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Scanner SC = new Scanner(System.in);

        while (true) {
            System.out.println("Press 1 if you want to add ");
            int choice = SC.nextInt();
            if (choice == 1) {
                System.out.println("Enter the element you want to add: ");
                int num = SC.nextInt();
                set.add(num);
            } else {
                break;
            }
        }

        for (int setEle : set) {
            System.out.print(setEle + " ");
        }

        System.out.println();
        System.out.println("Enter the element which you want to check whether it is present or not: ");
        int check = SC.nextInt();
        if (set.contains(check)) {
            System.out.println(check + " is present in the Set");
        } else {
            System.out.println("Element is not present in the Set");
        }
    }
}

