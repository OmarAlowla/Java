package Tanktellen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textField_Gaspreis;
	public JTextField textField_Liter;
	public JButton btn_rechnen;
	public JLabel Label_Preis;



	public View() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gas Preis:");
		lblNewLabel.setBounds(10, 74, 48, 14);
		contentPane.add(lblNewLabel);
		
		textField_Gaspreis = new JTextField();
		textField_Gaspreis.setBounds(80, 71, 86, 20);
		contentPane.add(textField_Gaspreis);
		textField_Gaspreis.setColumns(10);
		
		JLabel lblLiterAnzahl = new JLabel("Liter anzahl");
		lblLiterAnzahl.setBounds(10, 161, 60, 14);
		contentPane.add(lblLiterAnzahl);
		
		textField_Liter = new JTextField();
		textField_Liter.setColumns(10);
		textField_Liter.setBounds(80, 158, 86, 20);
		contentPane.add(textField_Liter);
		
		JLabel lblNewLabel_1 = new JLabel("Preis:");
		lblNewLabel_1.setBounds(176, 118, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		Label_Preis = new JLabel("0,00");
		Label_Preis.setBounds(210, 118, 46, 14);
		contentPane.add(Label_Preis);
		
		btn_rechnen = new JButton("Preis Rechnen");

		btn_rechnen.setBounds(317, 114, 107, 23);
		contentPane.add(btn_rechnen);
	}
}
