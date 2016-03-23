package jj_zadania.z01;

public class PierwszyProgram {

    public static void main(String[] args) {
        System.out.println("Dowolny tekst ;->");
        
//tak:
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
//albo tak:
        for (String s : args){ 
            System.out.println(s);
        }
        
    }
}











