package com.foxmula.Assignment3;

import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner (System.in);

        int arr[] = {10,20,10,10,20,5,5,5,5,5,5,5};
        int size = arr.length;
        SortofFreq ob1 = new SortofFreq();
        System.out.println("\n"+"\n"+"\n");
        ob1.frequencyNumber(arr,size);

        s.close();
        }

        }