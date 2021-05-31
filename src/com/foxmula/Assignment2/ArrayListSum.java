package com.foxmula.Assignment2;
import java.util.*;

public class ArrayListSum {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.add(30);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'k' value: ");
        int k = sc.nextInt();

        boolean flag = false;
        int low = 0, high = arr.size()-1;
        while(low < high) {
            if(arr.get(low) + arr.get(high) == k) {
                System.out.println("Pair: (" +arr.get(low)+ "," +arr.get(high)+ ")");
                flag = true;
            }
            if(arr.get(low) + arr.get(high) > k) {
                high--;
            }
            else {
                low++;
            }
        }
        if(!flag) {
            System.out.println("No pair possible");
        }
    }
}