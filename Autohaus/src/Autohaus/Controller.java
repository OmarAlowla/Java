package Autohaus;

import java.io.BufferedReader;
import java.io.IOException;
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
			            view.getComboModell().addItem(lines[0]);
			            view.getComboFrabe().addItem(lines[1]);
			            view.getComboPS().addItem(lines[2]);
			    }
			} catch (IOException e) {
			    e.printStackTrace();
			}

	}

}
