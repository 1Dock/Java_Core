package lesson7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePanel extends JPanel {
    private Task_2_Frame parent;

    private JButton addStudent;
    private JButton listStudent;
    private JButton exit;

    public HomePanel(Task_2_Frame parent, ERPSystem collage) {
        this.parent = parent;

        setSize(500,500);
        setLayout(null);

        addStudent = new JButton("ADD STUDENT");
        addStudent.setSize(300, 30);
        addStudent.setLocation(100, 150);
        add(addStudent);
        addStudent.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getHomePanel().setVisible(false);
                parent.getAddStudent().setVisible(true);
            }
        });

        listStudent = new JButton("LIST STUDENT");
        listStudent.setSize(300, 30);
        listStudent.setLocation(100, 225);
        add(listStudent);
        listStudent.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getHomePanel().setVisible(false);
                parent.getListStudent().toggle(true);
            }
        });

        exit = new JButton("EXIT");
        exit.setSize(300, 30);
        exit.setLocation(100, 299);
        add(exit);
        exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
    }
}
