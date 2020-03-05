/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartester;

/**
 *
 * @author antho6229
 */
public class Car {

    //variables
    private String make, model, hornSound, colour;
    private int year;
    private double price;

    //default constructor - makes random car
    public Car() {
        make = Math.round(Math.random() * 3) == 0 ? "Ford" : Math.round(Math.random() * 2) == 0 ? "Toyota" : "GMC";
        switch (make) {
            case "Ford":
                model = "F150";
                break;
            case "Toyota":
                model = "Camry";
                break;
            case "GMC":
                model = "Acadia";
                break;
        }
        
        colour = "Red";
        year = (int)Math.round((Math.random()*10)+2010);
        hornSound = "beep beep";
        price = Math.random()*15000+1000;
    }
    
    //all variables are parameters
    public Car(String clr, int yr, String mk, String mdl, String hrnSnd, int prc) {
        colour = clr;
        year = yr;
        make = mk;
        model = mdl;
        hornSound = hrnSnd;
        price = prc;
    }
    
    public Car(int yr, String mk, String mdl) {
        colour = "Yellow";
        year = yr;
        make = mk;
        model = mdl;
        hornSound = "awooga";
        price = 12500;
    }

    public String toString() {
        String output = "";
        output += colour + " " + year + " " + make + " " + model;

        return output;
    }

    public String honkHorn() {
        return hornSound.toUpperCase();
    }
    
    public String getPrice(){
        price = Math.round(price*100)/100;
        return ("$" + price);
    }
}
