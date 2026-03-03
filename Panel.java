import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Panel extends JPanel implements ActionListener {
    Ball ball = new Ball(50);
    @Override
    public void actionPerformed(ActionEvent e ) {

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ball.disegna(g);

    }


}
