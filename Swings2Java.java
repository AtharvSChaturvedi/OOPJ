import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swings2Java extends JFrame implements MouseListener, MouseMotionListener {
    private JLabel statusBar;

    public Swings2Java() {
        super("MOUSELISTENER");

        statusBar = new JLabel("Status Bar");
        getContentPane().add(statusBar, BorderLayout.SOUTH);

        addMouseListener(this);
        addMouseMotionListener(this);

        setSize(400, 400);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent event) {
        statusBar.setText("Clicked at x[" + event.getX() + "] y[" + event.getY() + "]");
        //getContentPane().setBackground(Color.BLUE);
    }

    public void mousePressed(MouseEvent event) {
        statusBar.setText("Pressed at x[" + event.getX() + "] y[" + event.getY() + "]");
    }

    public void mouseReleased(MouseEvent event) {
        statusBar.setText("Released at x[" + event.getX() + "] y[" + event.getY() + "]");
    }

    public void mouseEntered(MouseEvent event) {
        statusBar.setText("Mouse entered the window");
    }

    public void mouseExited(MouseEvent event) {
        statusBar.setText("Mouse exited the window");
    }

    public void mouseMoved(MouseEvent event) {
        statusBar.setText("Moved at x[" + event.getX() + "] y[" + event.getY() + "]");
    }

    public void mouseDragged(MouseEvent event) {
        statusBar.setText("Dragged at x[" + event.getX() + "] y[" + event.getY() + "]");
    }

    public static void main(String[] args) {
        Swings2Java app = new Swings2Java();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
