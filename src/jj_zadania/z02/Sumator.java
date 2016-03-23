package jj_zadania.z02;

/**
 * Zadanie: napisać program, kótry dodaje dwie liczby podane jako argumenty
 * programu (wariant dla chętnych: kalkulator w notacji operator liczba liczba)
 *
 * @author Arkadiusz Zychewicz
 */
public class Sumator {

    public static void main(String[] args) {

        double suma = 0;
        for (String arg : args) {
            suma += Double.valueOf(arg);
        }
        System.out.println("suma = " + suma);
   }
}
