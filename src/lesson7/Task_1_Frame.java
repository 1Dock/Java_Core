package lesson7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task_1_Frame extends JFrame {
    private JLabel nameLabel;
    private JLabel phoneLabel;
    private JLabel ageLabel;

    private JTextField nameTextField;
    private JTextField phoneTextField;

    private JComboBox ageComboBox;

    private JButton button;

    private JTextArea area;

    private Integer[] ages = new Integer[60];

    public Task_1_Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("BITLAB application");
        setSize(500, 600);
        setLayout(null);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = i;
        }

        nameLabel = new JLabel("Name: ");
        nameLabel.setSize(100, 30);
        nameLabel.setLocation(100, 100);
        add(nameLabel);

        nameTextField = new JTextField("");
        nameTextField.setSize(200, 30);
        nameTextField.setLocation(200, 100);
        add(nameTextField);

        phoneLabel = new JLabel("Phone: ");
        phoneLabel.setSize(100, 30);
        phoneLabel.setLocation(100, 150);
        add(phoneLabel);

        phoneTextField = new JTextField("");
        phoneTextField.setSize(200, 30);
        phoneTextField.setLocation(200, 150);
        add(phoneTextField);

        ageLabel = new JLabel("Age: ");
        ageLabel.setSize(100, 30);
        ageLabel.setLocation(100, 200);
        add(ageLabel);

        ageComboBox = new JComboBox(ages);
        ageComboBox.setSize(200, 30);
        ageComboBox.setLocation(200, 200);
        add(ageComboBox);

        area = new JTextArea();
        area.setSize(400,200);
        area.setLocation(50,300);
        add(area);

        button = new JButton("ADD CONTACT");
        button.setSize(300, 30);
        button.setLocation(100, 250);

        button.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String name = nameTextField.getText();
                 String number = phoneTextField.getText();
                 Integer age = (Integer) ageComboBox.getSelectedItem();

                 if (!name.equals("") && !number.equals("")) {
                     area.append(name+" - "+number+" - "+age+" years"+"\n");
                     nameTextField.setText("");
                     phoneTextField.setText("");
                     ageComboBox.setSelectedIndex(0);
                 }
             }
        });
        add(button);
    }
}
