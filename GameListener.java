
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GameListener implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        PlayablePanels p = (PlayablePanels) e.getSource();

        if(GamePanel.pB.get(p.checkPosition()).s.equals(States.EMPTY)){
            if(TicTacToe_Game_1v1_Frame.checkPlayerTurn() == PlayerTurn.PLAYER_1){
                GamePanel.pB.get(p.checkPosition()).setBackground(Color.RED);
                GamePanel.pB.get(p.checkPosition()).s = States.RED;
            }else{
                GamePanel.pB.get(p.checkPosition()).setBackground(Color.BLUE);
                GamePanel.pB.get(p.checkPosition()).s = States.BLUE;
            }

            

            if(WinningConditions.checkWin()) TicTacToe_Game_1v1_Frame.printWinner();
            else {
                TicTacToe_Game_1v1_Frame.counter ++;
                TicTacToe_Game_1v1_Frame.printPlayerTurn();
            }

        }
        GamePanel.printAll();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
