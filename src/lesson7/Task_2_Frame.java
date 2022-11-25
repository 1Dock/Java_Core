package lesson7;

import javax.swing.*;

public class Task_2_Frame extends JFrame {

    ERPSystem collage;
    private HomePanel homePanel;
    private AddStudent addStudent;
    private ListStudent listStudent;
    public Task_2_Frame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("STUDENT APPLICATION");
        setSize(500, 500);
        setLayout(null);

        collage = new ERPSystem();

        homePanel = new HomePanel(this, collage);
        homePanel.setVisible(true);
        add(homePanel);

        addStudent = new AddStudent(this, collage);
        addStudent.setVisible(false);
        add(addStudent);

        listStudent = new ListStudent(this, collage);
        listStudent.toggle(false);
        add(listStudent);
    }

    public HomePanel getHomePanel() {
        return homePanel;
    }

    public AddStudent getAddStudent() {
        return addStudent;
    }

    public ListStudent getListStudent() {
        return listStudent;
    }
}
