package lesson7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudent extends JPanel {
    private Task_2_Frame parent;

    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel facultyLabel;
    private JLabel groupLabel;

    private JTextField nameTextField;
    private JTextField surnameTextField;
    private JTextField groupTextField;

    private JComboBox facultyBox;

    private String faculty[] = {"Information Technologies", "Economics", "Mathematics"};

    private JButton addButton;
    private JButton exitButton;

    int id = 0;

    public AddStudent(Task_2_Frame parent, ERPSystem collage) {
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        nameLabel = new JLabel("NAME: ");
        nameLabel.setSize(100, 30);
        nameLabel.setLocation(100, 100);
        add(nameLabel);

        nameTextField = new JTextField("");
        nameTextField.setSize(200, 30);
        nameTextField.setLocation(200, 100);
        add(nameTextField);

        surnameLabel = new JLabel("SURNAME: ");
        surnameLabel.setSize(100, 30);
        surnameLabel.setLocation(100, 150);
        add(surnameLabel);

        surnameTextField = new JTextField("");
        surnameTextField.setSize(200, 30);
        surnameTextField.setLocation(200, 150);
        add(surnameTextField);

        facultyLabel = new JLabel("FACULTY: ");
        facultyLabel.setSize(100, 30);
        facultyLabel.setLocation(100, 200);
        add(facultyLabel);

        facultyBox = new JComboBox(faculty);
        facultyBox.setSize(200, 30);
        facultyBox.setLocation(200, 200);
        add(facultyBox);

        groupLabel = new JLabel("GROUP: ");
        groupLabel.setSize(100, 30);
        groupLabel.setLocation(100, 250);
        add(groupLabel);

        groupTextField = new JTextField("");
        groupTextField.setSize(200, 30);
        groupTextField.setLocation(200, 250);
        add(groupTextField);

        addButton = new JButton("ADD");
        addButton.setSize(120, 30);
        addButton.setLocation(100, 350);
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameTextField.getText();
                String surname = surnameTextField.getText();
                String faculty = (String) facultyBox.getSelectedItem();
                String group = groupTextField.getText();

                if (!name.equals("") && !surname.equals("") && !group.equals("")) {
                    Student student = new Student(id, name, surname, faculty, group);
                    id++;

                    collage.addStudent(student);
                    nameTextField.setText("");
                    surnameTextField.setText("");
                    facultyBox.setSelectedIndex(0);
                    groupTextField.setText("");
                }
            }
        });
        add(addButton);

        exitButton = new JButton("EXIT");
        exitButton.setSize(120, 30);
        exitButton.setLocation(280, 350);
        exitButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getHomePanel().setVisible(true);
                parent.getAddStudent().setVisible(false);
            }
        });
        add(exitButton);
    }
}
