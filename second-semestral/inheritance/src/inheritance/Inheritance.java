/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

import java.util.ArrayList;

/**
 *
 * @author jana.vitvarova
 */
public class Inheritance {
    static ArrayList<Shape>shapes;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        shapes = new ArrayList();
        shapes.add(new Circle(1));
        shapes.add(new Rectangle(2,3));

        double sum = 0;
        for (Shape shape : shapes) {
            sum = sum + shape.area();
        }
        System.out.println(sum);

        double sum1 = 0;
        for (Shape shape : shapes) {
            sum1 = sum1 + shape.circum();
        }

        System.out.println(sum1);
    }

}