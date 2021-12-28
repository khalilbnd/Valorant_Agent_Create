import javax.swing.*;

public class noValid extends JOptionPane {

    noValid(){
        showMessageDialog(null,
                "Votre formulaire n'est pas saisi correctement, Veuillez Jetez un coup d'oeil",
                "Formulaire Non Validé",
                ERROR_MESSAGE);
    }
}
