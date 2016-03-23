package jj_zadania.z03;

/**
 * @author azychew
 */
public class Student {

    private int x; 
    protected String imie;
    int wiek;
    public String nazwisko;
    
    static String nazwaSzkoły;

    /**
     * Pusty konstruktor. Generowany automatycznie
     * w razie braku jakegokolwiek konstuktora.
     */
    public Student() {
        wiek = 0;
        nazwisko ="brak nazwiska";
        this.imie ="brak imienia";
        Student.nazwaSzkoły = "WIT";   
    }

    /**
     * Tworzy obiekt typu studen przypisując
     * wiek.
     * @param wiek wiek studenta.
     */
    public Student(int wiek) {
        this();
        this.wiek = wiek;
    }

    /**
     * Tworzy obiekt typu studen przypisując
     * wiek i nazwisko
     * @param w wiek studenta
     * @param n nazwisko studenta
     */
    public Student(String i, String n, int w) {        
        this(w);
        nazwisko = n;
        imie = i;
    }

    /**
     * zwraca wiek.
     * @return wiek jako wartość int.
     */
    public int ileLat() {
        return wiek;
    }

    /**
     * umożliwia wypisywanie obiektu na ekran. Wypisuje
     * podstawowe informacje.
     * @return tekst w formacie "imie naziwsko wiek"
     */
    @Override
    public String toString() {
        return this.nazwisko + " " + this.imie + " " + wiek + " " + Student.nazwaSzkoły;
    }

}
