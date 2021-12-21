import javax.swing.*;

public class funcQuitter extends JOptionPane {

    funcQuitter(){
        int choice = showConfirmDialog(null, "Voulez-vous vraiment Quitter", "Quitter", YES_NO_OPTION);
        if(choice == YES_OPTION)
            System.exit(0);
    }

}