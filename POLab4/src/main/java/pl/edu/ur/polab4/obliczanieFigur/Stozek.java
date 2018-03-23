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
public class Stozek {
    double r,h,l;
    

    public Stozek(double r, double h,int opcja) {
        if(opcja==1){
            this.r = r;
            this.h = h;
            liczTworzaca();
        }else{
            this.r = r;
            this.l = h;
            liczPromien();
        }
    }

    public double liczPolePodstawy(){
        double pole;
        pole = Math.PI*r*r;
        return pole;
    }
    public double liczObjetosc(){
        double obj;
        obj = 1.0/3.0*Math.PI*r*r*h;
        return obj;
    }
    public double liczPoleBoczne(){
        double pb;
        pb = Math.PI*r*l;
        return pb;
    }
    private void liczTworzaca(){
        l = Math.sqrt(r*r+h*h);
    }
    private void liczPromien(){
        r = Math.sqrt((l*l)-(h*h));
    }
    public double liczPoleCalkowite(){
        double pc;
        pc =((Math.PI*r*r)+(Math.PI*r*l));
        return pc;
    }
    public void wyswietlDane(){
        System.out.println("/==============/");
        System.out.println("     STOŻEK     ");
        System.out.println("/==============/");
        System.out.println("Promień: "+r);
        System.out.println("Wysokość: "+h);
        System.out.println("Tworząca: "+l);
        System.out.println("Pole boczne: "+liczPoleBoczne());
        System.out.println("Pole całkowite: "+liczPoleCalkowite());
        System.out.println("Objętość: "+liczObjetosc());
        System.out.println("Pole podstawy: "+liczPolePodstawy());
        System.out.println("/==============/");    
    }
    
    
}
