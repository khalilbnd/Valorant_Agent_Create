
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainDev extends JFrame {
    public static Color valoCol = new Color(0xFA4A57);
    mainDev(){
        super("VALORANT : Creer votre agent ");


        dragFrame move = new dragFrame(this);
        this.addMouseListener(move);
        this.addMouseMotionListener(move);



        ImageIcon backGround = new ImageIcon("./assets/bg-pic/bg.png");
        ImageIcon logo = new ImageIcon("./assets/logo/valoLogo.png");
        JLabel bgLab = new JLabel(backGround);
        JLabel lgLab = new JLabel(logo);

        JLabel xQuitter = new JLabel("X");
        JLabel reduire = new JLabel("_");
        JLabel title = new JLabel("VALORANT : CREER UN SPECIFICATION POUR VOTRE AGENT");
        JPanel panTitle = new JPanel();
        JButton quitter = new JButton("Quitter");
        JButton information = new JButton("Information");
        JButton create = new JButton("Créer");


        lgLab.setBounds(50,50,100, 68);

        panTitle.add(title);
        panTitle.setBackground(valoCol);
        panTitle.setBounds(143, 450, 720, 60);
        panTitle.setBorder(new LineBorder(Color.white));
        panTitle.setLayout(null);
        title.setFont(new Font("monospace", Font.BOLD, 22));
        title.setForeground(Color.white);
        title.setBounds(24, 2, 720, 60);
        title.setFocusable(false);

        create.setFont(new Font("monospace", Font.BOLD, 20));
        create.setBackground(valoCol);
        create.setForeground(Color.white);
        create.setBounds(133, 263, 150, 50);
        create.setFocusable(false);
        create.setBorder(new LineBorder(Color.white));
        create.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                new SecondFrame();
            }
        });

        information.setFont(new Font("monospace", Font.BOLD, 20));
        information.setBackground(valoCol);
        information.setForeground(Color.white);
        information.setBounds(713, 223, 150, 50);
        information.setFocusable(false);
        information.setBorder(new LineBorder(Color.white));
        information.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                new funcInformation();
            }
        });
        quitter.setFont(new Font("monospace", Font.BOLD, 20));
        quitter.setBackground(valoCol);
        quitter.setForeground(Color.white);
        quitter.setBounds(713, 303, 150, 50);
        quitter.setFocusable(false);
        quitter.setBorder(new LineBorder(Color.white));
        quitter.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                new funcQuitter();
            }
        });


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
                xQuitter.setForeground(valoCol);
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

        this.add(lgLab);
        this.add(panTitle);
        this.add(create);
        this.add(information);
        this.add(quitter);
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

