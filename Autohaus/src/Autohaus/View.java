package Autohaus;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JList;

public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblFarbe;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1_1;
	private JLabel lblNewLabel_1_1_1_1_1_1_1;
	JComboBox<String> comboModell;
	JComboBox<String> comboFrabe;
	private JComboBox<String> comboPS;
	private JComboBox<String> comboExtras;
	private JButton btnAuswahl;
	private JList<String> list;
	private JButton btnBetstellen;

	public View() {

		ini();
	}
	private void ini()
	{	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblFarbe());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1());
		contentPane.add(getLblNewLabel_1_1_1_1_1_1_1());
		contentPane.add(getComboModell());
		contentPane.add(getComboFrabe());
		contentPane.add(getComboPS());
		contentPane.add(getComboExtras());
		contentPane.add(getBtnAuswahl());
		contentPane.add(getList());
		contentPane.add(getBtnBetstellen());
		setVisible(true);
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Model");
			lblNewLabel.setBounds(10, 47, 46, 14);
		}
		return lblNewLabel;
	}
	private JLabel getLblFarbe() {
		if (lblFarbe == null) {
			lblFarbe = new JLabel("Farbe");
			lblFarbe.setBounds(10, 87, 46, 14);
		}
		return lblFarbe;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("PS");
			lblNewLabel_1_1.setBounds(10, 126, 46, 14);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("Extras");
			lblNewLabel_1_1_1.setBounds(10, 165, 46, 14);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("Ihre Auswahl");
			lblNewLabel_1_1_1_1.setBounds(362, 47, 77, 14);
		}
		return lblNewLabel_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1 = new JLabel("Gesamtpreis netto:");
			lblNewLabel_1_1_1_1_1.setBounds(362, 165, 112, 14);
		}
		return lblNewLabel_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1 = new JLabel("19% MWSt: ");
			lblNewLabel_1_1_1_1_1_1.setBounds(362, 208, 69, 14);
		}
		return lblNewLabel_1_1_1_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_1_1_1_1_1() {
		if (lblNewLabel_1_1_1_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1_1_1_1 = new JLabel("Bruttopreis:");
			lblNewLabel_1_1_1_1_1_1_1.setBounds(362, 256, 89, 14);
		}
		return lblNewLabel_1_1_1_1_1_1_1;
	}
	protected JComboBox<String> getComboModell() {
		if (comboModell == null) {
			comboModell = new JComboBox<String>();
			comboModell.setBounds(66, 43, 163, 22);
		}
		return comboModell;
	}
	protected JComboBox<String> getComboFrabe() {
		if (comboFrabe == null) {
			comboFrabe = new JComboBox<String>();
			comboFrabe.setBounds(66, 83, 163, 22);
		}
		return comboFrabe;
	}
	protected JComboBox<String> getComboPS() {
		if (comboPS == null) {
			comboPS = new JComboBox<String>();
			comboPS.setBounds(66, 126, 163, 22);
		}
		return comboPS;
	}
	protected JComboBox<String> getComboExtras() {
		if (comboExtras == null) {
			comboExtras = new JComboBox<String>();
			comboExtras.setBounds(66, 161, 163, 22);
		}
		return comboExtras;
	}
	protected JButton getBtnAuswahl() {
		if (btnAuswahl == null) {
			btnAuswahl = new JButton("Auswahl bestätigen");
			btnAuswahl.setBounds(66, 294, 163, 23);
		}
		return btnAuswahl;
	}
	protected JList<String> getList() {
		if (list == null) {
			list = new JList<>();
			list.setBounds(362, 72, 217, 82);
		}
		return list;
	}
	protected JButton getBtnBetstellen() {
		if (btnBetstellen == null) {
			btnBetstellen = new JButton("Auto betstellen");
			btnBetstellen.setBounds(362, 294, 217, 23);
		}
		return btnBetstellen;
	}
}
