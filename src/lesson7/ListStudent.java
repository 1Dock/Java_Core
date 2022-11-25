package lesson7;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListStudent extends JPanel {
    private Task_2_Frame parent;

    private JTextArea mainArea;
    private ERPSystem collage;

    private JButton back;

    public ListStudent(Task_2_Frame parent, ERPSystem collage) {
        this.parent = parent;
        this.collage = collage;

        setSize(500,500);
        setLayout(null);

        mainArea = new JTextArea();
        mainArea.setSize(450,400);
        mainArea.setLocation(18,10);
        add(mainArea);

        back = new JButton("BACK");
        back.setSize(100, 30);
        back.setLocation(368, 425);
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parent.getHomePanel().setVisible(true);
                parent.getListStudent().toggle(false);
            }
        });
        add(back);
    }

    public void toggle(boolean visible) {
        setVisible(visible);
        mainArea.setText("");

        if (visible) {
            for (int i = 0; i < collage.sizeOfStudents; i++) {
                mainArea.append(collage.students[i].getData()+"\n");
            }
        }
    }
}
