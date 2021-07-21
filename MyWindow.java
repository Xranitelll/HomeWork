import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setVisible(true);
        setLocation(500,120);
        setSize(500,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1,2));

        JButton button1 = new JButton("Enter");
        panel.add(button1);

        JButton button2 = new JButton("Exit");
        ActionListener listener = new CloseActionListener();
        button2.addActionListener(listener);
        panel.add(button2);

        add(panel, BorderLayout.SOUTH);
    }
}
