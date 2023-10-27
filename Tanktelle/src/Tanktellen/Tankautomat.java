package Tanktellen;

public class Tankautomat {

	private double preis;
	private double gasPreis;
	private double liter;
	public Tankautomat(double preis,double gasPreis, double liter) {
		this.preis = preis;
		this.gasPreis = gasPreis;
		this.liter = liter;
	}
	
	public double getPreis()
	{
		return preis;
	}
	public double getGasPreis()
	{
		return gasPreis;
	}
	public void setGasPreis(double gasPreis)
	{
		this.gasPreis = gasPreis;
	}

	public double getLiter()
	{
		return liter;
	}
	

	
}
