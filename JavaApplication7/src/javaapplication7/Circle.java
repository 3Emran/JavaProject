/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication7;

/**
 *
 * @author User
 */
public class Circle implements Shape{
    public double getArea(){
        double pi=3.14159;
        double r = 4;
        double area = pi*r*r;
        System.out.println(area);
        return 0;
    }
}
