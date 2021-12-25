import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;

public class SecondFrame extends JFrame {

    SecondFrame(){


        super("Formulaire");

        // This is a useless JTextField for deleting the default caret
        JTextField useless = new JTextField();

        //JTextField
        JTextField nameInp = new JTextField("Nom" , 25);

        ImageIcon bg = new ImageIcon("./assets/bg-pic/secBg.jpg");
        JLabel bgLab = new JLabel(bg);

        JLabel xQuitter = new JLabel("X");
        JLabel reduire = new JLabel("_");

        nameInp.setFont(new Font("monospace", Font.BOLD, 17));
        nameInp.setBounds(400, 100, 300, 40);
        nameInp.setForeground(Color.gray);
        nameInp.setBorder(new EmptyBorder(12,20,11,100));

        nameInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                nameInp.setText("");
                nameInp.setForeground(Color.red);
                nameInp.setBorder(new EmptyBorder(12,20,11,100));
                nameInp.getCaret().setVisible(true);
            }

        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if(nameInp.getText().isEmpty()){
                    nameInp.setText("Nom");
                    nameInp.setForeground(Color.gray);
                    nameInp.setBorder(new LineBorder(Color.gray));
                    nameInp.setBorder(new EmptyBorder(12,20,11,100));
                    nameInp.getCaret().setVisible(false);
                }
                else {
                    nameInp.setBorder(new EmptyBorder(12,20,11,100));
                    nameInp.getCaret().setVisible(false);
                }
            }
        });

        nameInp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!(Character.isAlphabetic(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
                    e.consume();
                }
            }

        }
    );

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

        this.add(useless);
        this.add(nameInp);
        this.add(reduire);
        this.add(xQuitter);
        this.add(bgLab);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setSize(800, 450);
        this.setLocationRelativeTo(null);

        this.addMouseListener(move);
        this.addMouseMotionListener(move);


    }
    public static void main(String[] args){
        new SecondFrame();
    }
}
