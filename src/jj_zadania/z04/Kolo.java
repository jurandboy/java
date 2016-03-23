package jj_zadania.z04;
/**
 * Klasa kolo reprezentujaca figure. (dziedziczy po kalsie Figura)
 * Obiekty tej klasy sa zliczane jako figury.
 */
public final class Kolo extends Figura {
  double r;
  double kolor = 1;
  public Kolo(){
      super("K");
      r = 0;
  }
  
  public Kolo(final double r){
    this();
    this.r = r;
  }
  
  @Override
  public final double pole() {
      //System.out.println("" + nazwa); 
    return Math.PI * r * r;
  }

  
  /**
   * Nie mozna nadpisac metody metodaFinal bo jest oznaczona jako final :)
   */
  //public void metodaFinal(){}

}
