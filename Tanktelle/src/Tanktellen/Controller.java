package Tanktellen;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractButton;

public class Controller {
    private Model model;
    private View gui = new View(); 
    private Tankautomat tankautomat;
    private double preis = 0.0;
    
    public Controller(Model model, final View gui) {
        this.model = model;
        this.gui = gui;
        gui.addEvents(new RechnerEvent());
        
        // Assuming you have a button named 'btn_rechnen' in your View class
        // You can pass the component name to the Events method
        Events("btn_rechnen");
    }

    public void Tanken(double gasPreis, double liter) {
        preis = liter * gasPreis;
    }

    public void rechnerEvent() {
        double gasPreis = Double.valueOf(gui.textField_Gaspreis.getText());
        double liter = Double.valueOf(gui.textField_Liter.getText());
        tankautomat = new Tankautomat(0.0, gasPreis, liter); 
        Tanken(tankautomat.getGasPreis(), tankautomat.getLiter());
        gui.Label_Preis.setText(Double.toString(preis));
    }
    
    class RechnerEvent implements ActionListener
    {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			rechnerEvent();
		}
    	
    }

    public void Events(String componentName) {
        // This method can be used with any component that supports ActionListener
        // For example, you can use it with JButton, JTextField, etc.
        Component[] components = gui.getContentPane().getComponents();
        
        for (Component component : components) {
            if (component instanceof AbstractButton && componentName.equals(((AbstractButton) component).getName())) {
                ((AbstractButton) component).addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        rechnerEvent();
                    }
                });
            }
        }
    }
}
