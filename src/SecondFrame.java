import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SecondFrame extends JFrame {

    SecondFrame(){


        super("Formulaire");

        ImageIcon bg = new ImageIcon("./assets/bg-pic/secBg.jpg");
        JLabel bgLab = new JLabel(bg);

        JLabel xQuitter = new JLabel("X");
        JLabel reduire = new JLabel("_");
        xQuitter.setFont(new Font("monospace", Font.BOLD, 15));
        xQuitter.setForeground(Color.white);
        xQuitter.setBounds(780, 7, 40, 20);
        xQuitter.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                dispose();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                xQuitter.setForeground(Color.red);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                xQuitter.setForeground(Color.white);
            }
        });

        reduire.setFont(new Font("monospace", Font.BOLD, 15));
        reduire.setForeground(Color.white);
        reduire.setBounds(750, 2, 10, 20);
        reduire.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                setState(Frame.ICONIFIED);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                reduire.setForeground(Color.green);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                reduire.setForeground(Color.white);
            }
        });
        dragFrame move = new dragFrame(this);

        this.add(reduire);
        this.add(xQuitter);
        this.add(bgLab);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);

        this.addMouseListener(move);
        this.addMouseMotionListener(move);


    }
    public static void main(String[] args){
        new SecondFrame();
    }
}
