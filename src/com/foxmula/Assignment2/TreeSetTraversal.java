package com.foxmula.Assignment2;
import java.util.*;
public class TreeSetTraversal {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
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
    }
}
