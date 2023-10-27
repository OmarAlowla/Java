// PizzaController.java


package pgui;
import java.util.Arrays;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PizzaController {
    private PizzaModel model;
    private PizzaView view;
    double gesamtPreis = 0 ;
    public PizzaController(PizzaModel model, PizzaView view) {
        this.model = model;
        this.view = view;
        model.initializeWkItem();
        fuegeEin();
        initController();
    }

    public void fuegeEin()
    {
        for (int i = 0; i < model.WkItem.length; i++) 
        {
            view.comboBox_Pizza.addItem(model.WkItem[i].getPizza().getName());
        }
        for (int i = 0; i < model.WkItem.length; i++) 
        {
        	view.comboBox_Extras.addItem(model.WkItem[i].getExtra().getName());
        }
        for (int i = 0; i < model.WkItem.length; i++) 
        {
            view.comboBox_Groese.addItem(model.WkItem[i].getGroesse().getName());
        }
    }
    private void initController() {
        view.getBtnHinzufuegen().addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) {
                addPizza();
            }
        });
        view.getBtnEntfernen().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	 removePizza();
            }
        });
    }

    private void addPizza() {
        int pizza = view.getComboBox_Pizza().getSelectedIndex();
        int extra = view.getComboBox_Extras().getSelectedIndex();
        int groesse = view.getComboBox_Groese().getSelectedIndex();
        double preis = model.WkItem[pizza].getPizza().getPreis() +
        		model.WkItem[extra].getExtra().getPreis() +
        		model.WkItem[groesse].getGroesse().getPreis();
        
        view.dlm1.addElement(model.WkItem[pizza].getPizza().getName() +
                " / " + model.WkItem[extra].getExtra().getName() +
                " / " + model.WkItem[groesse].getGroesse().getName());
        view.getPreis_Label().setText(Double.toString(preis) + "€");
        gesamtPreis = gesamtPreis  + preis;
        view.getGesamtpreis_Label().setText(Double.toString(gesamtPreis) + "€");
    }
    public int getIndexByExtraName(String extraName) {
        for (int i = 0; i < model.WkItem.length; i++) {
            if (model.WkItem[i].getExtra().getName().equals(extraName)) {
                return i;
            }
        }
        return -1; 
    }
    public int getIndexByPizzaName(String PizzaName) {
        for (int i = 0; i < model.WkItem.length; i++) {
            if (model.WkItem[i].getPizza().getName().equals(PizzaName)) {
                return i;
            }
        }
        return -1;
    }

    public int getIndexByGroesseName(String GroesseName) {
        for (int i = 0; i < model.WkItem.length; i++) {
            if (model.WkItem[i].getGroesse().getName().equals(GroesseName)) {
                return i;
            }
        }
        return -1;
    }
    private void removePizza() {
        int selectedIndex = view.getList().getSelectedIndex();

        if (selectedIndex != -1) { // Check if an item is selected
            String selectedPizza = view.dlm1.getElementAt(selectedIndex).toString();
            String[] pizzaDetails = selectedPizza.split(" / ");

            int pizza = getIndexByPizzaName(pizzaDetails[0]);
            int extra = getIndexByExtraName(pizzaDetails[1]);
            int groesse = getIndexByGroesseName(pizzaDetails[2]);

            // Check if indices are valid
            if (pizza >= 0 && extra >= 0 && groesse >= 0) {
                // Subtract the price of the removed pizza from the total
                double removedPizzaPrice = model.WkItem[pizza].getPizza().getPreis() +
                        model.WkItem[extra].getExtra().getPreis() +
                        model.WkItem[groesse].getGroesse().getPreis();
                gesamtPreis = gesamtPreis - removedPizzaPrice;

                // Update the view and total price
                view.dlm1.remove(selectedIndex);
                view.getGesamtpreis_Label().setText(Double.toString(gesamtPreis) + "€");
            }
        }
    }

}
