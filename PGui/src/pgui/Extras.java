package pgui;

public class Extras {
    
    private double preis;
    private String name;
    
    public Extras(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPreis() {
        return preis;
    }
}
