package jj_zadania.z05;

/**
 *
 * @author azychew
 */
public abstract class AFigura {

    /**
     * licznik obiektow. Pole statyczne dostepne poprzez
     * wywolanie AFigura.licznik;
     */
    static int licznik = 0;
    /**
     * pole 'nr' mozna tylko raz zdefinowac. Kolejne definicje
     * spowoduje blad.
     */
    final int nr;

    String nazwa = "";
    /**
     * Konstuktor domyslny, ktory zwieksza licznik
     * i numeruje obiekty.
     */
    private AFigura() {
        AFigura.licznik++; //tu można też: licznik++;
        this.nr = AFigura.licznik;
       // this.nr = AFigura.licznik;
    }
    
    public AFigura(String nazwa){
        this();
        this.nazwa = nazwa;
    }

    /**
     * rodzaj atrapy napisanej po to by mozna bylo miec mozliwosc
     * dostepu na poziome najbardziej ogolnym.
     * @return zwraca -1.0 by informowac, ze nie powinna byc
     * wywolywana.
     */
    public abstract double pole();
    public abstract double obwód();

    /**
     * Przeciążenie z klasy Object
     * @return napis indentyfikujący obiekt
     */
    @Override
    public String toString() {
        return "Figura nr=" + this.nr + "; pole = " + pole()
                + "; licznik=" + AFigura.licznik;
    }
    
    public AFigura newI(){
      return this;
    }
}
