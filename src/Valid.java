import javax.swing.*;
import java.util.Random;

public class Valid extends JOptionPane {

    Valid(String name, String gender, String taille, String color, String age){
        Random rand = new Random();
        int randNum = rand.nextInt(17) + 1;
        String path = "./assets/players-icon/" + randNum + ".png";
        ImageIcon agents = new ImageIcon(path);

        showMessageDialog(null
                , "VOTRE FORMULAIRE A ETE BIEN SAISI :\n" +
                "Nom : \t" + name + "\n" +
                "Sexe : \t" + gender + "\n" +
                "Taille : \t" + taille + "\n" +
                "Couleur des cheveux : \t" + color + "\n" +
                "Age : \t" + age + "\n", "VOTRE FORMULAIRE", PLAIN_MESSAGE, agents);
    }
}
