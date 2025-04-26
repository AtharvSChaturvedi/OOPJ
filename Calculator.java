import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JTextField t1, t2, t3;
    private JButton b1, b2;

    public Calculator() {
        super("Calculator");

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        t1 = new JTextField(10);
        container.add(t1);

        t2 = new JTextField(10);
        container.add(t2);

        t3 = new JTextField(10);
        t3.setEditable(false);
        container.add(t3);

        b1 = new JButton("+");
        container.add(b1);

        b2 = new JButton("-");
        container.add(b2);

        ButtonHandler handler = new ButtonHandler();
        b1.addActionListener(handler);
        b2.addActionListener(handler);

        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int num1 = Integer.parseInt(t1.getText());
                int num2 = Integer.parseInt(t2.getText());
                int result = 0;

                if (e.getSource() == b1) {
                    result = num1 + num2;
                } 
                else if (e.getSource() == b2) {
                    result = num1 - num2;
                }

                t3.setText(Integer.toString(result));
            } catch (NumberFormatException ex) {
                t3.setText("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
