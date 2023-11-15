package pgui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PizzaView extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JLabel lblExstras;
    private JLabel lblNewLabel_1_1;
    private JLabel lblNewLabel_1_2;
    private JLabel lblNewLabel_1_2_1;
    private JLabel Preis_Label;
    private JLabel Gesamtpreis_Label;
    protected JComboBox<String> comboBox_Pizza;
    protected JComboBox<String> comboBox_Extras;
    protected JComboBox<String> comboBox_Groese;
    private JButton btnHinzufuegen;
    private JButton btnEntfernen;
    private JButton btnBestellen;
    private JButton Bestellungen;
    private JList<String> list;
    private PizzaModel model;
    DefaultListModel<String> dlm1 = new DefaultListModel<>();
    double[] preisArray = new double[100];
    double gesamtPreis = 0;


    public PizzaView(PizzaModel model) {
        this.model = model;
        initialize();
    }




    private void initialize() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 484, 359);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        contentPane.add(getLblNewLabel());
        contentPane.add(getLblExstras());
        contentPane.add(getLblNewLabel_1_1());
        contentPane.add(getLblNewLabel_1_2());
        contentPane.add(getLblNewLabel_1_2_1());
        contentPane.add(getPreis_Label());
        contentPane.add(getGesamtpreis_Label());
        contentPane.add(getComboBox_Pizza());
        contentPane.add(getComboBox_Extras());
        contentPane.add(getComboBox_Groese());
        contentPane.add(getBtnHinzufuegen());
        contentPane.add(getBtnEntfernen());
        contentPane.add(getBtnBestellen());
        contentPane.add(getBestellungen());
        contentPane.add(getList());
    }
    


    private JLabel getLblNewLabel() {
        if (lblNewLabel == null) {
            lblNewLabel = new JLabel("Pizza");
            lblNewLabel.setBounds(39, 34, 46, 14);
        }
        return lblNewLabel;
    }

    private JLabel getLblExstras() {
        if (lblExstras == null) {
            lblExstras = new JLabel("Exstras");
            lblExstras.setBounds(39, 76, 46, 14);
        }
        return lblExstras;
    }

    private JLabel getLblNewLabel_1_1() {
        if (lblNewLabel_1_1 == null) {
            lblNewLabel_1_1 = new JLabel("Größe");
            lblNewLabel_1_1.setBounds(273, 34, 46, 14);
        }
        return lblNewLabel_1_1;
    }

    private JLabel getLblNewLabel_1_2() {
        if (lblNewLabel_1_2 == null) {
            lblNewLabel_1_2 = new JLabel("Preis");
            lblNewLabel_1_2.setBounds(273, 76, 46, 14);
        }
        return lblNewLabel_1_2;
    }

    private JLabel getLblNewLabel_1_2_1() {
        if (lblNewLabel_1_2_1 == null) {
            lblNewLabel_1_2_1 = new JLabel("Gesamtpreis:");
            lblNewLabel_1_2_1.setBounds(39, 283, 111, 14);
        }
        return lblNewLabel_1_2_1;
    }

    protected JLabel getPreis_Label() {
        if (Preis_Label == null) {
            Preis_Label = new JLabel("0.00");
            Preis_Label.setBounds(329, 76, 46, 14);
        }
        return Preis_Label;
    }

    protected JLabel getGesamtpreis_Label() {
        if (Gesamtpreis_Label == null) {
            Gesamtpreis_Label = new JLabel("0.00");
            Gesamtpreis_Label.setBounds(273, 283, 46, 14);
        }
        return Gesamtpreis_Label;
    }

    protected JComboBox<String> getComboBox_Pizza() {
        if (comboBox_Pizza == null) {
            comboBox_Pizza = new JComboBox<>();


            comboBox_Pizza.setBounds(95, 30, 87, 22);
        }
        return comboBox_Pizza;
    }

    protected JComboBox<String> getComboBox_Extras() {
        if (comboBox_Extras == null) {
            comboBox_Extras = new JComboBox<>();


            comboBox_Extras.setBounds(95, 72, 87, 22);
        }
        return comboBox_Extras;
    }

    protected JComboBox<String> getComboBox_Groese() {
        if (comboBox_Groese == null) {
            comboBox_Groese = new JComboBox<>();

            comboBox_Groese.setBounds(329, 30, 87, 22);
        }
        return comboBox_Groese;
    }

    protected JButton getBtnHinzufuegen() {
        if (btnHinzufuegen == null) {
            btnHinzufuegen = new JButton("Hinzufügen");

            btnHinzufuegen.setBounds(329, 122, 89, 23);
        }
        return btnHinzufuegen;
    }

    protected JButton getBtnEntfernen() {
        if (btnEntfernen == null) {
            btnEntfernen = new JButton("Entfernen");
            btnEntfernen.setBounds(329, 158, 89, 23);
        }
        return btnEntfernen;
    }

    protected JButton getBtnBestellen() {
        if (btnBestellen == null) {
            btnBestellen = new JButton("Bestellen");
            btnBestellen.setBounds(329, 220, 89, 23);
        }
        return btnBestellen;
    }

    protected JButton getBestellungen() {
        if (Bestellungen == null) {
        	Bestellungen = new JButton("Bestellungen");
            Bestellungen.setBounds(329, 250, 89, 23);
        }
        return Bestellungen;
    }
    protected JList<String> getList() {
        if (list == null) {
            list = new JList<>(dlm1);
            list.setBounds(39, 122, 254, 150);
        }
        return list;
    }
}
