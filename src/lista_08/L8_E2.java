package lista_08;
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * @author Rogerio Rodrigues 
 */
public class L8_E2 {
    private static JLabel lblRes;
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setSize(300, 300);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel painel = new JPanel(); 
        JPanel painel2 = new JPanel();
        painel2.setLayout(new BoxLayout(painel2, BoxLayout.PAGE_AXIS));
        
        JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
        lblRes = new JLabel("Número: ");
        
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        
        
        painel.setLayout(new GridLayout(4, 3, 5, 5));
        painel.add(b1);
        painel.add(b2);
        painel.add(b3);
        painel.add(b4);
        painel.add(b5);
        painel.add(b6);
        painel.add(b7);
        painel.add(b8);
        painel.add(b9);
        
        painel2.add(painel);
        JButton limpar = new JButton("Limpar");
        
        JPanel painel3 = new JPanel();
        painel3.setLayout(new GridLayout(2, 1));
        painel3.add(limpar);
        painel3.add(lblRes);
        painel2.add(painel3);
        
        b1.addActionListener(new CliqueBotao());
        b2.addActionListener(new CliqueBotao());
        b3.addActionListener(new CliqueBotao());
        b4.addActionListener(new CliqueBotao());
        b5.addActionListener(new CliqueBotao());
        b6.addActionListener(new CliqueBotao());
        b7.addActionListener(new CliqueBotao());
        b8.addActionListener(new CliqueBotao());
        b9.addActionListener(new CliqueBotao());
        limpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lblRes.setText("Número: ");
            }
        });
        
        tela.setContentPane(painel2);
        //tela.pack();
        tela.setVisible(true);
    }

    private static class CliqueBotao implements ActionListener {

        public CliqueBotao() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //JOptionPane.showMessageDialog(null, e.getActionCommand());
            int valor = Integer.parseInt(e.getActionCommand());
            lblRes.setText(lblRes.getText()+valor);
        }
    }
    
    
}
