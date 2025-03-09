/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author User
 */
public class Rectangle implements Shape{
    
    @Override
    public double getArea(){
        double a=10;
        double b=11;
        double area = a*b;
        System.out.println(area);
        return 0;
    }
}
