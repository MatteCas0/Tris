
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MenuPanel extends JPanel{

    public MenuPanel() {
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridLayout(3, 1, 10, 10));
    }

}
