package com.foxmula.Assignment1;

class Quadrilateral
{
    protected double x1,x2,x3,x4,y1,y2,y3,y4,height;
    protected void Quadrilateral(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4)
    {
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.x4=x4;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
        this.y4=y4;
    }

    protected void Quadrilateral(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4, double height)
    {
        this.x1=x1;
        this.x2=x2;
        this.x3=x3;
        this.x4=x4;
        this.y1=y1;
        this.y2=y2;
        this.y3=y3;
        this.y4=y4;
        this.height=height;
    }
}






