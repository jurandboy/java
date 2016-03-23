package jj_zadania.z02;

import java.util.Arrays;

/**
 * kalkulator w notacji odwrotnej polskiej. 
 * czyli: Liczba Liczba operator
 * przykład 2 3 5 + *  
 * to: (3+5) * 2 = 16
 *  
 * @author arkadiusz
 */
public class Kalkulator {

    public static void main(String[] args) {
        // prymitywnie ale chyba bardziej zrozumiałe, gdy sotos realizowany jest za pomocą tablicy
        double[] stos = new double[10]; 
        int nr = 0;
        String[] operatory = {
            "+", "-", "/", "x"
        };
        Arrays.sort(operatory); //binarySearch oczekuje posortowanej tablicy.

  
        for (String s : args) {
            if (Arrays.binarySearch(operatory, s) < 0) {// s nie jest opratorem
                stos[nr++] = Double.parseDouble(s);
            } else {
                double a = stos[--nr];
                double b = stos[--nr];
                if ("+".equals(s)) {
                    stos[nr++] = b + a;
                }
                if ("-".equals(s)) {
                    stos[nr++] = b - a;
                }
                if ("/".equals(s)) {
                    stos[nr++] = b / a;
                }
                if ("*".equals(s)) {
                    stos[nr++] = b * a;
                }

            }
        }
        System.out.println("wynik = " + stos[0]);

    }
}
