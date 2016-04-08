package jj_zadania.z02;

/**
 * kalkulator 4 działaniowy w notacji polskiej, czyli: x L1 L2
 * gdzie:
 *    x - jeden z operatorów + - / x
 *   L1, L2 - liczba zmiennopzecinkowa
 * @author arkadiusz
 */
public class KalkulatorProsty {

    public static void main(String[] args) {

        double a = Double.valueOf(args[1]);
        double b = Double.valueOf(args[2]);
        
        //if (args[0] == "+"){};//tak zle
        //if (args[0].equals("+")){}//tak nie za dobrze
        if ("+".equals(args[0])) {
            System.out.println("Wynik: " + a + b);
        }

        if ("-".equals(args[0])) {
            System.out.println("Wynik: " + (a - b));
        }

        if ("/".equals(args[0])) {
            System.out.println("Wynik: " + (a / b));
        }

        if ("x".equals(args[0])) {
            System.out.println("Wynik: " + (a * b));
        }

        double w=0;
        switch(args[0]){
            case "+": w = a+b; break;
            case "-": w = a-b; break;
            case "/": w = a/b; break;
            case "x": w = a*b; break;
        }
        System.out.println("Wynik: " + w);

    }
}
