package com.example.trianglefx;

public class Triangle {
}
double a, b, c;
        double getPerimeter(){
            return a+b+c;
        }

        double getArea(){
            double p = getPerimeter()*0.5;
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
    }