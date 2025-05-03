
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class PlayablePanels extends JPanel{

    Border border = BorderFactory.createLineBorder(Color.BLACK);
    static GameListener l = new GameListener();
    States s;
    
    public PlayablePanels() {
        s = States.EMPTY;

        setBorder(border);

        addMouseListener(l);
    }

    public int checkPosition(){
        for (int i = 0; i < GamePanel.pB.size(); i++) {
            if(this.equals(GamePanel.pB.get(i)))
                return i;
        }
        return -1;
    }
}
