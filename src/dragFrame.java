import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class dragFrame extends MouseAdapter {
    private int posX, posY;
    private final JFrame frame;

    dragFrame(JFrame frame){
        this.frame = frame;
    }

    public void mousePressed(MouseEvent e)
    {
        posX=e.getX();
        posY=e.getY();
    }
    public void mouseDragged(MouseEvent evt)
    {
        this.frame.setLocation(evt.getXOnScreen()-posX,evt.getYOnScreen()-posY);

    }
}
