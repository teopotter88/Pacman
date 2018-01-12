package pacman;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {

    public Pacman() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new Board());
        
        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,600);
        setLocationRelativeTo(null);
        setVisible(true);        
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Pacman ex = new Pacman();
            ex.setVisible(true);
        });
    }
}
