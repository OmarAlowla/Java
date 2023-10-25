package pgui;

public class Groesse {
    
    private double preis;
    private String name;
    
    public Groesse(String name, double preis) {
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
