
import javax.swing.JButton;

public class MyButton extends JButton{

    MyListener l;

    public MyButton(String a) {
        l = new MyListener();

        setSize(200, 200);
        setFocusable(false);
        setText(a);

        addActionListener(l);
    }

}
