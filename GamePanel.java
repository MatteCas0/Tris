import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

public class GamePanel extends JPanel{

    public static ArrayList<PlayablePanels> pB;
    PlayablePanels p;

    public GamePanel() {
        pB = new ArrayList<>();
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < 9; i++) {
            p = new PlayablePanels();
            pB.add(p);
            add(p);
        }
    }

    public static void disableAll(){
        for (PlayablePanels playablePanels : pB) {
            playablePanels.removeMouseListener(PlayablePanels.l);
        }
    }

    public static void printAll(){
        for (PlayablePanels playablePanels : pB)
            System.out.println(playablePanels.s);

        System.out.println("-----------------------------------------------------------------------------");
    }

}
