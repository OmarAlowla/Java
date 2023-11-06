package Tanktellen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;
	private JTextField textField_Gaspreis;
	private JTextField textField_Liter;
	private JLabel lblNewLabel;
	private JLabel lblLiteranzahl;
	private JLabel lblPreis;
	private JLabel Label_Preis;

	public View() {
		initialize();
	}
	private void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
				setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnNewButton());
		contentPane.add(getTextField_Gaspreis());
		contentPane.add(getTextField_Liter());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblLiteranzahl());
		contentPane.add(getLblPreis());
		contentPane.add(getLabel_Preis());
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Preis Rechnen");
			btnNewButton.setBounds(300, 120, 112, 23);
		}
		return btnNewButton;
	}
	private JTextField getTextField_Gaspreis() {
		if (textField_Gaspreis == null) {
			textField_Gaspreis = new JTextField();
			textField_Gaspreis.setBounds(10, 62, 86, 20);
			textField_Gaspreis.setColumns(10);
		}
		return textField_Gaspreis;
	}
	private JTextField getTextField_Liter() {
		if (textField_Liter == null) {
			textField_Liter = new JTextField();
			textField_Liter.setColumns(10);
			textField_Liter.setBounds(10, 161, 86, 20);
		}
		return textField_Liter;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Gaspreis");
			lblNewLabel.setBounds(10, 42, 46, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblLiteranzahl() {
		if (lblLiteranzahl == null) {
			lblLiteranzahl = new JLabel("Literanzahl");
			lblLiteranzahl.setBounds(10, 139, 71, 14);
		}
		return lblLiteranzahl;
	}
	private JLabel getLblPreis() {
		if (lblPreis == null) {
			lblPreis = new JLabel("Preis");
			lblPreis.setBounds(75, 114, 46, 14);
		}
		return lblPreis;
	}
	private JLabel getLabel_Preis() {
		if (Label_Preis == null) {
			Label_Preis = new JLabel("0.00");
			Label_Preis.setBounds(131, 114, 46, 14);
		}
		return Label_Preis;
	}
}
