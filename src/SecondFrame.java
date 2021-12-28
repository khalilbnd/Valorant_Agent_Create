import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;

public class SecondFrame extends JFrame {

    SecondFrame(){


        super("Formulaire");

        // This is a useless JTextField for deleting the default caret
        JTextField useless = new JTextField();

        //JTextField
        JTextField nameInp = new JTextField("Nom" , 25);
        String[] sexe = {"   Sexe", "   Male", "   Female", "   Indéterminé"};
        JComboBox<String> sexeInp = new JComboBox<>(sexe);
        JTextField tailleInp = new JTextField("Taille (en cm)");
        String[] color = {"   Couleur de cheveux", "   Noir", "   Brun", "   Auburn", "   Chatain", "   Roux", "   Blond", "   Blanc"};
        JComboBox<String> colorInp = new JComboBox<>(color);
        JRadioButton b1 = new JRadioButton("0-16"), b2 = new JRadioButton("17-35"), b3 = new JRadioButton("36-80");
        ButtonGroup age = new ButtonGroup();

        JButton vButton = new JButton("Valider");
        JButton aList = new JButton("Agent List");

        JLabel tAge = new JLabel("Tranche d'age");

        ImageIcon bg = new ImageIcon("./assets/bg-pic/secBg.jpg");
        JLabel bgLab = new JLabel(bg);

        JLabel xQuitter = new JLabel("X");
        JLabel reduire = new JLabel("_");

        nameInp.setFont(new Font("monospace", Font.BOLD, 17));
        nameInp.setBounds(400, 70, 300, 40);
        nameInp.setBorder(new EmptyBorder(0,19,0,0));
        nameInp.setForeground(Color.gray);

        sexeInp.setFont(new Font("monospace", Font.BOLD, 17));
        sexeInp.setBounds(400, 120, 300,40);
        sexeInp.setForeground(Color.gray);
        sexeInp.setRenderer(new CBLayout(sexeInp));

        tailleInp.setFont(new Font("monospace", Font.BOLD, 17));
        tailleInp.setBounds(400, 170, 300, 40);
        tailleInp.setBorder(new EmptyBorder(0,19,0,0));
        tailleInp.setForeground(Color.gray);

        colorInp.setFont(new Font("monospace", Font.BOLD, 17));
        colorInp.setBounds(400, 220, 300,40);
        colorInp.setForeground(Color.gray);
        colorInp.setRenderer(new CBLayout(colorInp));

        tAge.setFont(new Font("monospace", Font.BOLD, 17));
        tAge.setBounds(490, 260, 200, 40);
        tAge.setOpaque(false);
        tAge.setForeground(Color.white);

        b1.setActionCommand("0-16");
        b1.setFocusable(false);
        b1.setFont(new Font("monospace", Font.BOLD, 17));
        b1.setBounds(415, 290, 80, 40);
        b1.setForeground(Color.white);
        b1.setOpaque(false);

        b2.setActionCommand("17-35");
        b2.setFocusable(false);
        b2.setFont(new Font("monospace", Font.BOLD, 17));
        b2.setBounds(515, 290, 80, 40);
        b2.setForeground(Color.white);
        b2.setOpaque(false);

        b3.setActionCommand("36-80");
        b3.setFocusable(false);
        b3.setFont(new Font("monospace", Font.BOLD, 17));
        b3.setBounds(615, 290, 80, 40);
        b3.setForeground(Color.white);
        b3.setOpaque(false);

        age.add(b1);
        age.add(b2);
        age.add(b3);

        vButton.setFont(new Font("monospace", Font.BOLD, 17));
        vButton.setBounds(590,360,100,50);
        vButton.setBackground(mainDev.valoCol);
        vButton.setForeground(Color.white);
        vButton.setBorder(new LineBorder(Color.white));
        vButton.setFocusable(false);

        vButton.addActionListener(new Validation(nameInp, sexeInp, tailleInp, colorInp, age));

        aList.setFont(new Font("monospace", Font.BOLD, 17));
        aList.setBounds(420, 360, 150, 50);
        aList.setBackground(mainDev.valoCol);
        aList.setForeground(Color.white);
        aList.setBorder(new LineBorder(Color.white));
        aList.setFocusable(false);

        aList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Va jeter un coup d'oeil sur la console du java(Intelij IDEA)", "Indication", JOptionPane.INFORMATION_MESSAGE);
                new displayDB();
            }
        });



        nameInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(Objects.equals(nameInp.getText(), "Nom")){
                    nameInp.setText("");
                    nameInp.setForeground(mainDev.valoCol);
                    nameInp.setBorder(new EmptyBorder(12, 20, 11, 0));
                    nameInp.getCaret().setVisible(true);
                }
            }

        });
        tailleInp.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if(Objects.equals(tailleInp.getText(), "Taille (en cm)")){
                    tailleInp.setText("");
                    tailleInp.setForeground(mainDev.valoCol);
                    tailleInp.setBorder(new EmptyBorder(12, 20, 11, 0));
                    tailleInp.getCaret().setVisible(true);
                }
            }

        });
        addMouseListener(new InputListener(nameInp));
        addMouseListener(new InputListener(tailleInp));

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
        tailleInp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if(!((c <= '9' && c >= '0') || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE )) {
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
                xQuitter.setForeground(mainDev.valoCol);
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
        this.add(aList);
        this.add(vButton);
        this.add(tAge);
        this.add(b1);
        this.add(b2);
        this.add(b3);
        this.add(colorInp);
        this.add(tailleInp);
        this.add(sexeInp);
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
