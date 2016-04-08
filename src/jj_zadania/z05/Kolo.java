/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jj_zadania.z05;


/**
 * Klasa kolo reprezentujaca figurę (dziedziczy po kalsie Fig) drigą figure
 * poza klasa prost
 * @author arkadiusz
 */
public class Kolo extends AFigura {
  double r;
  static int licznik =0;
  final int nr;
  
  public Kolo(){
      super("kolo");
      r = 0;
      Kolo.licznik++;
      this.nr = Kolo.licznik;
  }
  
  public Kolo(double r){
    this();
    this.r = r;
  }
  
  @Override
  public double pole() {      
    return Math.PI * r * r;
  }

    @Override
    public String toString() {
        return "Koło \t\t nr=" + this.nr + "Figura nr " + super.nr
                + "; licznik=" + Kolo.licznik //poprawniej byłoby Prostokat.licznik
                + "; super.licznik= " + AFigura.licznik;  //poprawniej byłoby Figura.licznik
    }
    @Override
    public double obwód() {
        return 2* Math.PI * r;
    }


}
