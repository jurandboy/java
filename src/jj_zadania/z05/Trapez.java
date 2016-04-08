/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jj_zadania.z05;

/**
 *
 * @author gregor
 */
public class Trapez extends AFigura {
    double a, b, h;
    static int licznik = 0;
    final int nr;
    
    public Trapez(){
        super("trapez");
        a =0;
        b=0;
        h=0;
        Trapez.licznik++;
        this.nr=Trapez.licznik;
    }
    
    public Trapez(double a, double b, double h){
        this();
        this.a = a;
        this.b = b;
        this.h = h;
    }
    
    @Override
    public double pole(){
        return (a+b)*h *0.5;
    }
    
    @Override
    public double obwód(){
        return 5;
    }
    
    @Override
    public String toString(){
     return "Trapez \t\t nr=" + this.nr + "Figura nr " + super.nr
                + "; licznik=" + Trapez.licznik //poprawniej byłoby Prostokat.licznik
                + "; super.licznik= " + AFigura.licznik;  //poprawniej byłoby Figura.licznik
    }
    
}
