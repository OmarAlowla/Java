package Autohaus;

public class Auto {
	private Farbe farbe;
	private PS ps;
	private Extras extras; 
	private Modell modell;
	
	public Auto (Modell modell,Farbe farbe,Extras extras,PS ps)
	{
		this.modell = modell;
		this.ps = ps;
		this.farbe= farbe;
		this.extras = extras;
	}

	public Farbe getFarbe() {
		return farbe;
	}


	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}


	public PS getPs() {
		return ps;
	}


	public void setPs(PS ps) {
		this.ps = ps;
	}


	public Extras getExtras() {
		return extras;
	}


	public void setExtras(Extras extras) {
		this.extras = extras;
	}


	public Modell getModel() {
		return modell;
	}


	public void setModel(Modell modell) {
		this.modell = modell;
	}
	
	
}

