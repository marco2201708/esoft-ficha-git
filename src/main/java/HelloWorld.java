import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld extends JFrame{
    private JPanel panel1;
    private JLabel lblMensagem;
    private JLabel lblRes;
    private Desenvolvimento identiicar;

    public HelloWorld(){
        setContentPane(panel1);
        pack();
    }
    public static void main(String[] args) {
        new HelloWorld().setVisible(true);
    }
}
