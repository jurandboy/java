package jj_zadania.z04;

/**
 *
 * @author azychew
 */
public abstract class Figura {

    /**
     * licznik obiektow. Pole statyczne dostepne poprzez
     * wywolanie Figura.licznik;
     */
    protected static int licznik = 0;
    /**
     * numer kolejnego obiektu.
     * pole 'nr' mozna tylko raz zdefinowac. Kolejne definicje
     * spowoduje blad.
     */
    protected final int nr;
    protected String nazwa;
    double kolor = 0;
    /**
     * Konstuktor domylsny. zliczajacy obiekty.
     */
    private Figura (){
        this.nr = Figura.licznik++;
    }
    /**
     * Konstuktor nadajacy nazwe. i zliczajacy obiekyt
     * @param nazwa 
     */
    public Figura(String nazwa) { 
        this(); // tu zliczamy figury
        this.nazwa = nazwa;
    }

    /**
     * oblicza pole powierzchi. Kazda figura ma pole ale tylko konkretne figury
     * (kola, prostokaty) wiedza jak je policzyc, wiec tu tylko deklarujemy
     * medode.
     */
    public abstract double pole();

    
    
    public final void metodaFinal(final int x){}
    /**
     * Przeciążenie z klasy Object
     * @return napis indentyfikujący obiekt
     */
    @Override
    public String toString() {
        return "Figura nr=" + this.nr
                + "; licznik=" + Figura.licznik;
    }
    
    
}
