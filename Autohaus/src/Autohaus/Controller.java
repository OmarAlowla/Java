package Autohaus;

import java.io.BufferedReader;
import java.io.IOException;


import javax.swing.JComboBox;
import java.io.*;


public class Controller {
	View view = new View();
	public Controller() {
		fillgui();
	}

	public void fillgui() {
		String path = "C:\\Users\\AlowlaOmar\\Downloads\\daten.txt"; 
		view.getComboExtras().addItem("Extras");
		 view.getComboExtras().addItem("Navi Gerät");
		 view.getComboExtras().addItem("Bose-Soundsystem");
		 try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			    String line;
			    while ((line = reader.readLine()) != null) {
			        String[] lines = line.split(";");

			        if (!isItemInComboBox(view.getComboModell(), lines[0])) {
			            view.getComboModell().addItem(lines[0]);
			        }

			        if (!isItemInComboBox(view.getComboFrabe(), lines[1])) {
			            view.getComboFrabe().addItem(lines[1]);
			        }

			        if (!isItemInComboBox(view.getComboPS(), lines[2])) {
			            view.getComboPS().addItem(lines[2]);
			        }
			    }
			} catch (IOException e) {
			    e.printStackTrace();
			}



	}
	private boolean isItemInComboBox(JComboBox<String> comboBox, String item) {
	    for (int i = 0; i < comboBox.getItemCount(); i++) {
	        if (comboBox.getItemAt(i).equals(item)) {
	            return true;
	        }
	    }
	    return false;
	}
}
