
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        MyButton b = (MyButton)e.getSource();

        if(b.getText().equals(Menu.a[0])){
            System.out.println("Non implementato");
        }

        if(b.getText().equals(Menu.a[1])){
            TicTacToe_Game_1v1_Frame t = new TicTacToe_Game_1v1_Frame();
            TicTacToe_Game_1v1_Frame.reset();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            t.setVisible(true);
        }

        if(b.getText().equals(Menu.a[2])){
            System.exit(0);
        }
    }

}
