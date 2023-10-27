package Tanktellen;

import java.awt.EventQueue;

import pgui.PizzaController;
import pgui.PizzaModel;
import pgui.PizzaView;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
                Model model = new Model();
                View view = new View();
                Contoller controller = new Contoller(model, view);
                
                view.setVisible(true);

			}
		});
	}

}
