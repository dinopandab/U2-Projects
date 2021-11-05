import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class RPGCharacterGUI {

    JFrame window;
    JPanel panel;


    static JTextField inputField1, inputField2, inputField3, inputField4;
    static JLabel statsLabel1, statsLabel2, statsLabel3, statsLabel4, statsLabel5, statsLabel6, statsLabel7, statsLabel8;


    public RPGCharacterGUI() {

        window = new JFrame("character stats calculator ");

        inputField1 = new JTextField(5);
        inputField2 = new JTextField(5);
        inputField3 = new JTextField(5);
        inputField4 = new JTextField(5);

        statsLabel1 = new JLabel("spirit: ");
        statsLabel2 = new JLabel("strength: ");
        statsLabel3 = new JLabel("energy: ");
        statsLabel4 = new JLabel("speed: ");
        statsLabel5 = new JLabel("dexterity: ");
        statsLabel6 = new JLabel("spell strength: ");
        statsLabel7 = new JLabel("mana: ");
        statsLabel8 = new JLabel("armor: ");

        JButton clicker = new JButton("calculate stats: ");

        panel = new JPanel();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);

        clicker.addActionListener(new ClickerListener());

        panel.add(statsLabel1);
        panel.add(inputField1);
        panel.add(statsLabel2);
        panel.add(inputField2);
        panel.add(statsLabel3);
        panel.add(inputField3);
        panel.add(statsLabel4);
        panel.add(inputField4);

        panel.add(statsLabel5);
        panel.add(statsLabel6);
        panel.add(statsLabel7);
        panel.add(statsLabel8);


        panel.add(clicker);
        window.add(panel);


        window.setVisible(true);
    }

    private class ClickerListener implements ActionListener {

        public void actionPerformed(ActionEvent actionEvent) {

            int calculateDexterity = Integer.parseInt(inputField1.getText());
            calculateDexterity *= 6;
            statsLabel5.setText("spirit: " + calculateDexterity);

            int calculateSpellStrength = Integer.parseInt(inputField2.getText());
            calculateSpellStrength  *= 5 ;
            statsLabel6.setText("strength: " + calculateSpellStrength );

            int calculateMana = Integer.parseInt(inputField3.getText());
            calculateMana *= 2  ;
            statsLabel7.setText("mana: " + calculateMana);

            int calculateArmor = Integer.parseInt(inputField4.getText());
            calculateArmor *= 4;
            statsLabel8.setText("speed: " + calculateArmor);

        }

    }
}





