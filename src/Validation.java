import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class Validation implements ActionListener {
    private JTextField name, taille;
    private final JComboBox<String> gender;
    private final JComboBox<String> color;
    private ButtonGroup age;

    Validation(JTextField name, JComboBox<String> gender, JTextField taille, JComboBox<String> color, ButtonGroup age){
        this.name = name;
        this.gender = gender;
        this.taille = taille;
        this.color = color;
        this.age = age;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        boolean nEmpty = this.name.getText().isEmpty() || Objects.equals(this.name.getText(), "Nom"),
                gEmpty = Objects.equals(this.gender.getItemAt(this.gender.getSelectedIndex()), "   Sexe"),
                tEmpty = this.taille.getText().isEmpty() || Objects.equals(this.taille.getText(), "Taille (en cm)"),
                cEmpty = Objects.equals(this.color.getItemAt(this.color.getSelectedIndex()), "   Couleur de cheveux"),
                aEmpty = this.age.getSelection() == null;

        if(nEmpty || gEmpty || tEmpty || cEmpty || aEmpty)
            new noValid();
        else
            new Valid(this.name.getText(),
                      this.gender.getItemAt(this.gender.getSelectedIndex()),
                      this.taille.getText(),
                      this.color.getItemAt(this.color.getSelectedIndex()),
                      this.age.getSelection().getActionCommand());

    }
}
