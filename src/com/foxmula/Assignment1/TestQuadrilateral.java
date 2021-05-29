package com.foxmula.Assignment1;

class TestQuadrilateral
{
    public static void main(String []args)
    {
        Square sq=new Square(13,13,21,13,21,21,13,21);
        Rectangle r=new Rectangle(13,13,34,13,34,21,13,21);
        Parallelogram para=new Parallelogram(13,13,34,13,21,21,0,21,8);
        Trapezoid trap=new Trapezoid(13,13,34,13,45,21,0,21,8);
        System.out.println("Area Of The Sq is " + sq.area());
        System.out.println("Area Of The Rec is " + r.area());
        System.out.println("Area Of The Parallelogram is " + para.area());
        System.out.println("Area Of The Trapezoid is " + trap.area());
    }
}

