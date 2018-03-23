package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Emek
 */
public class Kolo {
    float r;

    public Kolo(float r) {
        this.r = r;
    }
    
    public double liczPole(){
        double pole;
        pole = Math.PI*r*r;
        return pole;
    }
    
    public double liczObwod(){
        double obwod;
        obwod = 2*Math.PI*r;
        return obwod;
    }
    public void wyswietlDane(){
        System.out.println("/==============/");
        System.out.println("      KOŁO      ");
        System.out.println("/==============/");
        System.out.println("Promień: "+r);
        System.out.println("Średniaca: "+2*r);
        System.out.println("Pole: "+liczPole());
        System.out.println("Obwód: "+liczObwod());
        System.out.println("/==============/");
    }
    
}
