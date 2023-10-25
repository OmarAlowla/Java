package pgui;

public class Pizzen {
    
    private double preis;
    private String name;
    private Groesse groesse;
    private Extras extra;
    public Pizzen(String name, double preis,Groesse groesse,Extras extra) {
        this.name = name;
        this.preis = preis;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPreis() {
        return preis;
    }

	public Groesse getGroesse() {
		return groesse;
	}

	public Extras getExtra() {
		return extra;
	}


    

}
