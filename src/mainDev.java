
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainDev extends JFrame {

    mainDev(){
        super("VALORANT : Creer votre agent ");

        ImageIcon backGround = new ImageIcon("./assets/bg-pic/bg.png");
        JLabel bgLab = new JLabel(backGround);

        JLabel xQuitter = new JLabel("X");
        JLabel reduire = new JLabel("_");

        xQuitter.setFont(new Font("monospace", Font.BOLD, 15));
        xQuitter.setForeground(Color.white);
        xQuitter.setBounds(950, 7, 40, 20);
        xQuitter.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                new funcQuitter();
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
        reduire.setBounds(920, 2, 10, 20);
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

        bgLab.setBounds(0, 0, 970, 546);
        this.setUndecorated(true);


        this.add(reduire);
        this.add(xQuitter);
        this.add(bgLab);

        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(970, 546);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args){
       new mainDev();
    }
}
