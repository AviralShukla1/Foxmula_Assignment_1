package com.foxmula.Assignment1;
import java.util.*;
class Stack
{
    // A linked list node
    private class Node
    {
        int Data; // integer data
        Node Link; // reference variable Node type
    }

    Node Top; 	// create global top reference variable global
    Node Head;

    Stack() 	// Default Constructor
    {
        this.Top = null;
    }

    public void Push(int x) // Utility function to add an element x in the stack
    {
        Node temp = new Node();

        temp.Data = x;    // initialize data into temp data field
        temp.Link = Top;  // put top reference into temp link

        Top = temp;		// update top reference
    }

    public void pop() // Utility function to pop top element from the stack
    {
        if (Top == null)      // check for stack underflow
        {
            System.out.print("\nStack Underflow");
            return;
        }
        else
        {
            System.out.println("Poped element : "+ Top.Data);
            Top = Top.Link;    // update the top pointer to point to the next node
        }
    }

    public boolean isEmpty() // Utility function to check if the stack is empty or not
    {
        return Top == null;
    }

    public int count()      //Utility function for count the number of elements in stack
    {
        int count = 0;
        Node temp=Top;
        while(temp!=null)
        {
            temp=temp.Link;
            count++;
        }
        return count;
    }
}