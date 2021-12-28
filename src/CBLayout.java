import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CBLayout extends DefaultListCellRenderer {
    private final JComboBox<String> CBInput;
    private final String firstItem;

    CBLayout(JComboBox<String> CBInput){
        this.CBInput = CBInput;
        this.firstItem = CBInput.getItemAt(CBInput.getSelectedIndex());
    }
    public void paint(Graphics g) {

        setBackground(Color.white);
        if(Objects.equals(this.CBInput.getItemAt(this.CBInput.getSelectedIndex()), this.firstItem)){
            setForeground(Color.GRAY);
        }
        else{
            setForeground(mainDev.valoCol);
        }
        super.paint(g);
    }
}
