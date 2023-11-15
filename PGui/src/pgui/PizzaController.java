// PizzaController.java


package pgui;
import java.util.Arrays;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.nio.file.*;
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
        view.getBtnBestellen().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	try {
					Bestellen();
				} catch (IOException e1) {
					e1.printStackTrace();
					System.out.println(e1);
				}
            }
        });
        view.getBestellungen().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            	try {
            		BestellungenAnzeigen();
				} catch (IOException e1) {
					e1.printStackTrace();
					System.out.println(e1);
				}
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
                ";" + model.WkItem[extra].getExtra().getName() +
                ";" + model.WkItem[groesse].getGroesse().getName());
        view.getPreis_Label().setText(Double.toString(preis) + "€");
        gesamtPreis = gesamtPreis  + preis;
        view.getGesamtpreis_Label().setText(Double.toString(gesamtPreis) + "€");
        view.getPreis_Label().setText(Double.toString(preis) + "€") ;
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

        if (selectedIndex != -1) { 
            String selectedPizza = view.dlm1.getElementAt(selectedIndex).toString();
            String[] pizzaDetails = selectedPizza.split(";");
            int pizza = getIndexByPizzaName(pizzaDetails[0]);
            int extra = getIndexByExtraName(pizzaDetails[1]);
            int groesse = getIndexByGroesseName(pizzaDetails[2]);
            if (pizza >= 0 && extra >= 0 && groesse >= 0) {
                
                double removedPizzaPrice = model.WkItem[pizza].getPizza().getPreis() +
                        model.WkItem[extra].getExtra().getPreis() +
                        model.WkItem[groesse].getGroesse().getPreis();
                gesamtPreis = gesamtPreis - removedPizzaPrice;
                view.dlm1.remove(selectedIndex);
                if (gesamtPreis <= 0)
                {
                	gesamtPreis  =0 ;
                }
                view.getGesamtpreis_Label().setText(Double.toString(gesamtPreis) + "€");
            }
        }
    }

    
/*
    private void Bestellen() throws IOException {
    	
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Bestellungen.txt", true))) {
            for (Object pizzaObject : view.dlm1.toArray()) {
                String selectedPizza = pizzaObject.toString();
                String[] pizzaDetails = selectedPizza.split(";");
                String str = pizzaDetails[0] + ";" + pizzaDetails[1] + ";" + pizzaDetails[2];
                writer.write("  ");
                writer.append(str);
                writer.newLine(); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void BestellungenAnzeigen() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("Bestellungen.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                view.dlm1.addElement(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
*/



    private void Bestellen() throws IOException {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\AlowlaOmar\\Documents\\Bestellungen.txt"), StandardOpenOption.APPEND, StandardOpenOption.CREATE)) {
            for (Object pizzaObject : view.dlm1.toArray()) {
                String selectedPizza = pizzaObject.toString();
                String[] pizzaDetails = selectedPizza.split(";");
                String str = pizzaDetails[0] + ";" + pizzaDetails[1] + ";" + pizzaDetails[2];
                writer.append(str);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void BestellungenAnzeigen() throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("C:\\Users\\AlowlaOmar\\Documents\\Bestellungen.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                view.dlm1.addElement(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
