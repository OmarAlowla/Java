// PizzaModel.java
package pgui;

public class PizzaModel {
	Warenkorb WkItem[]; 
    public void initializeWkItem() {
        WkItem = new Warenkorb[3]; 
        Extras ananas = new Extras("ananas", 5.0);
        Groesse klein = new Groesse("klein", 1.0);
        Pizzen salami = new Pizzen("Salami", 7.50, klein, ananas);
        Extras mushroom = new Extras("mushroom", 3.0);
        Groesse medium = new Groesse("medium", 1.5);
        Pizzen margherita = new Pizzen("Margherita", 6.50, medium, mushroom);
        Extras oliven = new Extras("oliven", 2.0);
        Groesse groß = new Groesse("groß", 2.0);
        Pizzen quattroFormaggi = new Pizzen("Quattro Formaggi", 9.50, groß, oliven);
        
        WkItem[0] = new Warenkorb(salami, klein, mushroom);
        WkItem[1] = new Warenkorb(margherita, medium, ananas);
        WkItem[2] = new Warenkorb(quattroFormaggi, groß, oliven);

    }

}
