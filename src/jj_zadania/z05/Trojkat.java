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
public class Trojkat extends AFigura{
    double a, b, c, h;
    static int licznik =0;
    final int nr;


public Trojkat(){
super("trojkat");
this.a = 0;
this.b = 0;
this.c = 0;
this.h = 0;
Trojkat.licznik++;
this.nr = Trojkat.licznik;
}

public Trojkat(double a, double b, double c, double h){
this();
this.a = a;
this.b = b;
this.c = c;
this.h = h;
}
@Override
public double pole(){
return this.a * 0.5 * this.h;
}
 @Override
    public String toString() {
        return "Trojakt \t nr=" + this.nr + "Figura nr " + super.nr
                + "; licznik=" + Trojkat.licznik //poprawniej byłoby Prostokat.licznik
                + "; super.licznik= " + AFigura.licznik;  //poprawniej byłoby Figura.licznik
    }

    @Override
    public double obwód() {
        return this.a + this.b + this.c;
    }



}




