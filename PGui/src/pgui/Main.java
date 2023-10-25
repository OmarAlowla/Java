// Main.java
package pgui;

import java.awt.EventQueue;

public class Main {
    public static void main(String[] args) {
    	
        EventQueue.invokeLater(new Runnable() {
            public void run() {
            	
                PizzaModel model = new PizzaModel();
                PizzaView view = new PizzaView(model);
                PizzaController controller = new PizzaController(model, view);
                
                view.setVisible(true);
            }
        });
    }
}
