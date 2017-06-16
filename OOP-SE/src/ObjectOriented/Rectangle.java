/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectOriented;

/**
 *
 * @author 3rd Year Account
 */
public class Rectangle {
//Attributes
    double length;
    double width;
    //constuctor
    Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("First Constructor Loaded");
    }
    Rectangle(double length){
        setLength(length);
        this.width = 0.0;
        System.out.println("Second Constructor Loaded");
    }
    Rectangle(double length, double width){
        this.width = length;
        this.length = width;
        System.out.println("Third Constructor Loaded");
    }
    //methods
    //getter of length
    double getLength(){
       return this.length;
       
       
    }
    //getter of width
    double getWidth(){
        return this.width;
    }
    //setter of length
    void setLength(double length){
        this.length = length;
    }
    //setter of width
    //method displayArea
    void displayArea(){
   double area = this.length * this.width;
   System.out.println(area);
    }
    //functional method displayArea
    double display_Area(){
        double area = this.length * this.width;
        return area;
    }
}
