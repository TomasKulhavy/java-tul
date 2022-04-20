/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package inheritance;

/**
 *
 * @author tomaskulhavy
 */
public class Circle extends Shape{
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double area(){
        return Math.PI*r*r;
    }

    @Override
    public double circum() {
        return 2*Math.PI * r;
    }
}