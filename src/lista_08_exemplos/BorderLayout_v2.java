package lista_08_exemplos;

import java.awt.Dimension;
import javax.swing.*;


/**
 *
 * @author Rogerio Rodrigues 
 */
public class BorderLayout_v2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); 
        frame.setSize(new Dimension(600, 400)); 
        JButton btnTopo = new JButton("Topo"); 
        JButton btnEsquerda = new JButton("Esquerda"); 
        JButton btnBaixo = new JButton("Baixo"); 
        JButton btnDireita = new JButton("Direita"); 
        JTextField texto = new JTextField("Insira algum texto aqui"); 
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add("West",btnEsquerda);
        frame.add("North",btnTopo);
        frame.add("East",btnDireita);
        frame.add("South",btnBaixo);
        frame.add("Center", texto);
        
        frame.setVisible(true); 
        

    }
}
