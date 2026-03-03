import java.awt.*;

public class Ball {

    double x, y;
    double vx, vy;
    double massa;
    int raggio;

    //Costanti
    final double G = 9.81;              //Gravità
    final double SCALA = 100.0;         //Dimensioni
    final double RIMBALZO = 0.75;       //Energia conservata
    final double  VELOCITA = 7.0;       //Veloctà

    public Ball(double massa) {
        this.massa = massa;
        this.raggio = 15;
        reset();


    }

    public void reset() {
        x = 50;
        y = 130;
    }

    public void lancia() {

    }

    public void disegna(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval((int)(x-raggio), (int)(y-raggio), raggio*2, raggio*2);
    }

}
