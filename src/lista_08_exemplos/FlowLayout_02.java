package lista_08_exemplos;
import java.awt.Dimension;
import javax.swing.*; 
/**
 *
 * @author I0361398
 */
public class FlowLayout_02 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(600, 400));
        
        JPanel panel = new JPanel();
        
        JLabel lblName = new JLabel("Name: ");
        JLabel lblCountry = new JLabel("Country: ");
        JLabel lblPassword = new JLabel("Password: ");
        
        JTextField txtName = new JTextField(20);
        JTextField txtCountry = new JTextField(15);
        JPasswordField txtPassword = new JPasswordField(10);
        
        JButton btnLogin = new JButton("Login"); 
        
        panel.add(lblName);
        panel.add(txtName);
        panel.add(lblCountry);
        panel.add(txtCountry);
        panel.add(lblPassword);
        panel.add(txtPassword);
        panel.add(btnLogin);
        
        frame.setContentPane(panel);
        frame.pack();
        
        frame.setVisible(true);
    }
}


