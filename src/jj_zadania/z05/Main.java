package jj_zadania.z05;

/**
 * @author Arkadiusz Zychewicz
 */
public class Main {

    public static void main(String[] args) {
        // tak nie można
        //AFigura f1 = new Figura();
        //ale można tak:
        AFigura f1 = new Kolo(1);
        System.out.println(f1.toString());
        System.out.println("obwód" + f1.obwód());
        AFigura f2 = new Trojkat(3,3,3,1);
        System.out.println(f2.toString());
        AFigura f3 = new Trapez(9,4,5);
        System.out.println(f3.toString());

        AFigura[] tab = new AFigura[6];
        tab[0] = new Prostokat(1, 3);
        tab[1] = new Kolo(1);
        tab[2] = new Prostokat(1,1);
        tab[3] = new Kolo(3);
        tab[4] = new Prostokat(1, 2);
        tab[5] = new Trojkat(4,3,2,3);

        double suma = 0;
        for (AFigura f : tab) {     
            System.out.print(f.toString());
            System.out.println(" \t obwód = " + f.obwód() + "pole =" + f.pole());
            suma += f.pole();
        }

        System.out.println("Suma pól: " + suma);
    }
}