package jj_zadania.z05;

/**
 *
 * @author azychew
 */
public class Prostokat extends AFigura {

    double a;
    double b;
    static int licznik = 0;
    final int nr;

    public Prostokat() {
        super("prostoka");// jak się nie napisze super() to i tak zostanie wywołany.
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

    @Override
    public double pole() {
        return this.a * this.b;
    }

    @Override
    public String toString() {
        return "Prostokąt \t nr=" + this.nr + "Figura nr " + super.nr
                + "; licznik=" + Prostokat.licznik //poprawniej byłoby Prostokat.licznik
                + "; super.licznik= " + AFigura.licznik;  //poprawniej byłoby Figura.licznik
    }

    @Override
    public double obwód() {
        return 2 * (a + b);
    }
}
