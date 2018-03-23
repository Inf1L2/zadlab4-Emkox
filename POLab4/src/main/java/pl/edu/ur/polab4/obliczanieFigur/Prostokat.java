/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Emek
 */
public class Prostokat {
    double a,b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double liczPole(){
        double pole;
        pole = a*b;
        return pole;    
    }
    public double liczObwod(){
        double obwod;
        obwod = ((2*a)+(2*b));
        return obwod;
    }
    public double liczPrzekatna(){
        double przekatna;
        double ab = (a*a)+(b*b);
        przekatna = Math.sqrt(ab);
        return przekatna;
    }
    public void wyswietlDane(){
        System.out.println("/==============/");
        System.out.println("      KOŁO      ");
        System.out.println("/==============/");
        System.out.println("Bok a: "+a);
        System.out.println("Bok b: "+b);
        System.out.println("Przekątna: "+liczPrzekatna());
        System.out.println("Pole: "+liczPole());
        System.out.println("Obwód: "+liczObwod());
        System.out.println("/==============/");
    }
    
}
