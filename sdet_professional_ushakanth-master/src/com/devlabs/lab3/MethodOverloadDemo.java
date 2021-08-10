package com.devlabs.lab3;

public class MethodOverloadDemo{

        int calPerimeter(int num1)
        {
            return 4*num1;
        }
        
        double calPerimeter(double num1)
        {
            return 2*3.14*num1;
        }
        
        double calPerimeter(double num1, double num2)
        {
            return 2*(num1+num2);
        }
        double calPerimeter(double num1, double num2, double num3)
        {
            return num1+num2+num3;
        }
        double calPerimeter(double num1, double num2, double num3,double num4)
        {
            return num1+num2+num3+num4;
        }
        
        public static void main(String[] args) 
        {    
            MethodOverloadDemo obj = new MethodOverloadDemo();
            
            double a=5.25, b=6.25, c=7.26, d=8.45;
            int e=9;
            
            System.out.println("---  Method Overloading example ------------");
            System.out.println("Perimeter of Cirlce with radius "+a+" is: "+obj.calPerimeter(a));
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Perimeter of Rectangle of dimensions: "+a+"," +b+" is: "+obj.calPerimeter(a,b));
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Perimeter of Triangle of dimensions: "+a+"," +b+","+c+" is: "+obj.calPerimeter(a,b,c));
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Perimeter of Quadrilateral of dimensions: "+a+"," +b+","+c+","+d+" is: "+obj.calPerimeter(a,b,c,d));
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Perimeter of square with side "+e+" is: "+obj.calPerimeter(e));
            System.out.println("--------------------------------------------------------------------------------");
            
        }	
}		


