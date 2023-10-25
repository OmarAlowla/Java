package pgui;

public class Warenkorb {
	
	private Pizzen pizza;
    private Groesse groesse;
    private Extras extra;
    
    public Warenkorb( Pizzen pizza,Groesse groesse,Extras extra)
    {
    	this.pizza = pizza;
    	this.groesse = groesse ;
    	this.extra = extra;
    }

	public Pizzen getPizza() {
		return pizza;
	}

	public Groesse getGroesse() {
		return groesse;
	}

	public Extras getExtra() {
		return extra;
	}
	
    @Override
    public String toString() {
        return this.pizza.getName() + " + " + this.groesse.getName() +" + "+ this.extra.getName(); 
    }

}
