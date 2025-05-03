
import javax.swing.JFrame;

public class Menu extends JFrame{

    MenuPanel p;
    MyButton gCPU, gPLA, exit;
    public static String[] a = {"Gioca contro la CPU", "Gioca contro un amico", "Esci"};

    public Menu() {
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("TicTacToe Menu");

        p = new MenuPanel();

        inizializzaMenu();
        
        add(p);
    }

    private void inizializzaMenu(){
        gCPU = new MyButton(a[0]);
        gPLA = new MyButton(a[1]);
        exit = new MyButton(a[2]);

        p.add(gCPU);
        p.add(gPLA);
        p.add(exit);
    }
}
