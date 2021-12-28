import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InputListener extends MouseAdapter {
    private JTextField input;
    private final String name;

    InputListener(JTextField input){
        this.input = input;
        this.name = this.input.getText();
    }
    public void mouseReleased(MouseEvent e) {
        if (this.input.getText().isEmpty()) {
            this.input.setText(this.name);
            this.input.setForeground(Color.gray);
            this.input.setBorder(new LineBorder(Color.gray));
            this.input.setBorder(new EmptyBorder(12, 19, 11, 0));
            this.input.getCaret().setVisible(false);
        } else {
            this.input.getCaret().setVisible(false);
        }
    }
}
