package lista_08_exemplos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Rogerio Rodrigues 
 */
public class BorderLayout_01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(new Dimension(600, 400));
        frame.setLayout(new BorderLayout(10, 10));
        JButton btnNorte = new JButton("Norte");
        JButton btnWest = new JButton("West");
        JButton btnEast = new JButton("East");
        JButton btnSouth = new JButton("South");
        JButton btnCenter = new JButton("Center");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add("North", btnNorte);
        frame.add("West", btnWest);
        frame.add("East", btnEast);
        frame.add("South", btnSouth);
        frame.add("Center", btnCenter);
        frame.setVisible(true);
    }
}
