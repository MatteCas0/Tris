import java.awt.Color;
import java.util.ArrayList;

public class WinningConditions {
    static ArrayList<PlayablePanels> gioco;
    
    public static boolean checkWin(){
        gioco = GamePanel.pB;
        PlayerTurn p = TicTacToe_Game_1v1_Frame.checkPlayerTurn();

        States st;
        if(p == PlayerTurn.PLAYER_1){
            st = States.RED;
        }else{
            st = States.BLUE;
        }

        if(tuttiPieni()){
            for (PlayablePanels pP : gioco) {
                pP.setBackground(Color.WHITE);
            }
            TicTacToe_Game_1v1_Frame.reset();
        }

        return (riga1(st) || riga2(st) || riga3(st) || colonna1(st) || colonna2(st) || colonna3(st) || diagonale1(st) || diagonale2(st));
    }

    private static boolean tuttiPieni(){
        return (gioco.get(0).s != States.EMPTY) && (gioco.get(1).s != States.EMPTY) && (gioco.get(2).s != States.EMPTY) && (gioco.get(3).s != States.EMPTY) && 
        (gioco.get(4).s != States.EMPTY) && (gioco.get(5).s != States.EMPTY) && (gioco.get(6).s != States.EMPTY) && (gioco.get(7).s != States.EMPTY) && 
        (gioco.get(8).s != States.EMPTY);
    }
    private static boolean riga1(States st){
        return (gioco.get(0).s == st) && (gioco.get(1).s == st) && (gioco.get(2).s == st);
    }

    private static boolean riga2(States st){
        return ((gioco.get(3).s == st) && (gioco.get(4).s == st) && (gioco.get(5).s == st));
    }

    private static boolean riga3(States st){
        return ((gioco.get(6).s == st) && (gioco.get(7).s == st) && (gioco.get(8).s == st));
    }

    private static boolean colonna1(States st){
        return ((gioco.get(0).s == st) && (gioco.get(3).s == st) && (gioco.get(6).s == st));
    }

    private static boolean colonna2(States st){
        return ((gioco.get(1).s == st) && (gioco.get(4).s == st) && (gioco.get(7).s == st));
    }
    private static boolean colonna3(States st){
        return ((gioco.get(2).s == st) && (gioco.get(5).s == st) && (gioco.get(8).s == st));
    }
    private static boolean diagonale1(States st){
        return ((gioco.get(0).s == st) && (gioco.get(4).s == st) && (gioco.get(8).s == st));
    }
    private static boolean diagonale2(States st){
        return ((gioco.get(2).s == st) && (gioco.get(4).s == st) && (gioco.get(6).s == st));
    }

}
