package jj_zadania.z04;

public class Prostokat extends Figura {
    double a;
    double b;
    
    double w = 2;
    /**
     * Zlicza prostokaty. analogiczne pole jak w klasie Figura. 
     * @see Figura.licznik
     */
    static int licznik = 0;
    /**
     * Numer prostokatu. analogiczne pole jak w klasie Figura.
     * @see Figura.nr
     */
    final int nr;
    /**
     * konstruktor domylsny.
     */
    public Prostokat() {
        //wywolanie konstruktora klasy po ktorej jest
        //czyli konstruktora   Figura(String)
        super("P");
        this.a = 0;
        this.b = 0;
        Prostokat.licznik++;
        this.nr = Prostokat.licznik;
    }

    public Prostokat(double a, double b) {
        this();
        this.a = a;
        this.b = b;
    }
    /**
     * Nadpisujemy medode pole z kalsy Figura. nie nadpisanie
     * grozi tym, ze funkcja ta bedze zwracala -1.0.
     * @return pole powierzchni prostokata
     */
    @Override
    public double pole(){ return this.a * this.b;}
      /**
     * Nadpisujemy medode pole z kalsy Object.
     * @return opis prostokata
     */  
    @Override
    public String toString() {
        int nr=0;
        //tu 'nr' ma az 3 znaczenia:
        // 1. zmienna (nr)
        // 2. pole w klasie prostokat (this.nr)
        // 3. pole odziedziczone z figura (super.nr)
        
        return super.toString() + "Prostokąt"+nr+" nr=" 
                + this.nr + "Figura nr "+ super.nr
                + "; licznik=" + Prostokat.licznik //poprawniej byłoby Prostokat.licznik
                + "; super.licznik= " + Figura.licznik;  //poprawniej byłoby Figura.licznik
}
   

}//klasa






