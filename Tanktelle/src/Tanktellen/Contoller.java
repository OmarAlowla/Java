package Tanktellen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contoller {
	private Model model;
	private View gui;
	private double preis = 0.0;
	private double gasPreis = Double.valueOf(gui.textField_Gaspreis.getText());
	private double liter =Double.valueOf(gui.textField_Liter.getText());
	Tankautomat tankautomat;
	public Contoller(Model model,View gui) 
	{
		this.model = model;
		this.gui = gui;
	}
	
	public void ini()
	{
		tankautomat= new Tankautomat(preis,gasPreis, liter);
	}
	public void Tanken(double gasPreis, double liter)
	{
		
		preis = liter * gasPreis;
	}
	public void rechnerEvent()
	{
		Tanken(tankautomat.getGasPreis(),tankautomat.getLiter());
		gui.Label_Preis.setText(Double.toString(preis));
	}
	public void PreisRechnen()
	{
		gui.btn_rechnen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rechnerEvent();
			}
		});
	}
	
}
