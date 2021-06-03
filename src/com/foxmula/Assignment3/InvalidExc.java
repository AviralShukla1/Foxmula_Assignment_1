package com.foxmula.Assignment3;
public class InvalidExc
{
        void process(int n)
        {
            int a=0;
            try
            {
                for(int i=1;i<=n;i++)
                {
                    if(n%i==0)
                        a++;
                }

                if(a==2 && n%2==1)
                {
                    throw new ArithmeticException("Invalid Number");
                }
                else
                {
                    System.out.println("No exception found");
                }
            }

            catch(ArithmeticException e)
            {
                System.out.println(e);
            }
        }
    }

