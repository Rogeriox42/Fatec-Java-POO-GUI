package lista_08_exemplos;
import java.awt.Dimension;
import javax.swing.*; 
/**
 *
 * @author I0361398
 */
public class BoxLayout_01 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo - Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        
        JLabel lblUser = new JLabel("User");
        JLabel lblPassword = new JLabel("Password");
        
        JTextField txtUser = new JTextField(20);
        JPasswordField txtPassword = new JPasswordField(10); 
        
        JButton btnLogin = new JButton("Login");
        
        panel.add(lblUser);
        panel.add(txtUser);
        panel.add(lblPassword);
        panel.add(txtPassword); 
        
        panel.add(btnLogin);
        
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true); 
    }
}
