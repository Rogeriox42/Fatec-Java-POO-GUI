package lista_08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Rogerio Rodrigues
 */
public class L8_E1 {

    private static Label lblTitle, lblResult, lblN1, lblN2;
    private static TextField txtN1, txtN2;
    private Button btnSum, btnSub, btnDiv, btnMult;
    private JFrame screen;
    private JPanel titlePanel, centerPanel, bottomPanel;

    public static void main(String[] args) {
        new L8_E1().initScreen();
    }

    void initScreen() {
        screen = new JFrame();
        screen.setSize(600, 300);
        titlePanel = new JPanel();
        centerPanel = new JPanel();
        bottomPanel = new JPanel();
        screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.PAGE_AXIS));

        lblTitle = new Label("Operating with numbers! ", Label.CENTER);
        lblN1 = new Label("1st Number: ");
        lblN2 = new Label("2nd Number: ");
        txtN1 = new TextField();
        txtN2 = new TextField();
        lblResult = new Label("Result: ");

        JButton btSoma, btSub, btMult, btDiv;
        btSoma = new JButton("Sum");
        btSub = new JButton("Sub");
        btMult = new JButton("Mult");
        btDiv = new JButton("Div");

        btSoma.addActionListener(new CliqueBotao());
        btSub.addActionListener(new CliqueBotao());
        btMult.addActionListener(new CliqueBotao());
        btDiv.addActionListener(new CliqueBotao());

        JPanel panelBotoes = new JPanel();
        panelBotoes.setLayout(new GridLayout(1, 4));

        panelBotoes.add(btSoma);
        panelBotoes.add(btSub);
        panelBotoes.add(btMult);
        panelBotoes.add(btDiv);

        titlePanel.add(lblTitle);
        titlePanel.add(lblN1);
        titlePanel.add(txtN1);
        titlePanel.add(lblN2);
        titlePanel.add(txtN2);
        titlePanel.add(panelBotoes);
        titlePanel.add(lblResult);

        screen.setContentPane(titlePanel);
        screen.setVisible(true);
    }

    private static class CliqueBotao implements ActionListener {

        public CliqueBotao() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            float n1, n2; 
            n1 = Float.parseFloat(txtN1.getText());
            n2 = Float.parseFloat(txtN2.getText());
            //JOptionPane.showMessageDialog(null, e.getActionCommand());
            switch (e.getActionCommand()) {
                case "Sum":        
                    lblResult.setText("Result: " + (n1+n2));
                    break;
                case "Sub":
                    lblResult.setText("Result: " + (n1-n2));
                    break;
                case "Mult":
                    lblResult.setText("Result: " + (n1*n2));
                    break;
                case "Div":
                    lblResult.setText("Result: " + (n1/n2));
                    break;
            }
        }
    }
}
