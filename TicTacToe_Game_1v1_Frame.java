
import java.awt.BorderLayout;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.JFrame;

public class TicTacToe_Game_1v1_Frame extends JFrame{

    public static TextField t;
    static GamePanel p;
    public static int counter;

    public TicTacToe_Game_1v1_Frame() {
        p = new GamePanel();
        t = new TextField();

        counter = 0;

        setSize(500, 500);
        setResizable(false);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setFocusable(false);
        setLocationRelativeTo(null);
        setTitle("TicTacToe");
        setLayout(new BorderLayout());

        t.setFocusable(false);
        printPlayerTurn();

        add(t, BorderLayout.NORTH);
        add(p, BorderLayout.CENTER);
    }

    public static PlayerTurn checkPlayerTurn(){
        if((counter % 2) == 0) return PlayerTurn.PLAYER_1;

        return PlayerTurn.PLAYER_2;
    }

    public static void printPlayerTurn(){
        if(checkPlayerTurn() == PlayerTurn.PLAYER_1){
            t.setText("è il turno di: Player 1");
        }else{
            t.setText("è il turno di: Player 2");
        }
    }

    public static void printWinner(){
        if(checkPlayerTurn() == PlayerTurn.PLAYER_1){
            t.setText("Ha vinto: Player 1");
        }else{
            t.setText("Ha vinto: Player 2");
        }
        
        GamePanel.disableAll();
    }

    public static void reset(){
        ArrayList<PlayablePanels> gioco = GamePanel.pB;
        for (PlayablePanels g : gioco) {
            g.s = States.EMPTY;
        }
    }

}
