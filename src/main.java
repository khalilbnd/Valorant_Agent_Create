
import javax.swing.*;

public class main extends JFrame {

    main(){
        super("VALORANT : Creer votre agent ");

        ImageIcon backGround = new ImageIcon("./assets/bg-pic/bg.png");
        JLabel bgLab = new JLabel(backGround);

        bgLab.setBounds(0, 0, 970, 546);
        this.setUndecorated(true);


        this.add(bgLab);
        this.setResizable(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(970, 546);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public static void main(String[] args){
       new main();
    }
}
