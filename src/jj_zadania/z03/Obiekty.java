package jj_zadania.z03;

/**
 *
 * @author azychew
 */
public class Obiekty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //stworzenie dwoch obiektow
        Student s1;   
                s1 = new Student(20);
        Student s2 = new Student(25);
        //wypisanie wiku
        System.out.println(s1.ileLat());                         // wypisze 20
        System.out.println(s2.ileLat());                         // wypisze 25
        //lub całego obiektu
        System.out.println(s1);
        System.out.println(s2);        
        // pole statyczne
        s1.nazwaSzkoły = "UW";
        System.out.println(s1);
        System.out.println(s2);        
        //nadpisanie referencji
        s1 = s2;
        s1.wiek = 15;
        System.out.println(s1.ileLat());                                           // wypisze 15
        System.out.println(s2.ileLat());                                           // wypisze 15
        System.out.println(s1);
        
        

    }


}
