package lista_08_exemplos;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*; 
/**
 *
 * @author Rogerio Rodrigues 
 */
public class FlowLayout_01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 400)); 
        
        JPanel panel = new JPanel();
        
        FlowLayout flow = (FlowLayout) panel.getLayout();
        JLabel labelName = new JLabel("User");
        JLabel labelPassword = new JLabel("Password:" );
        JTextField txtName = new JTextField(20);
        JPasswordField txtPassword = new JPasswordField(10);
        
        JButton btnLogin = new JButton("Login");
        
        panel.add(labelName);
        panel.add(txtName);
        panel.add(labelPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
        
        
    }
}
