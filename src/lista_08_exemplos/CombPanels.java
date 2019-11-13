package lista_08_exemplos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Rogerio Rodrigues
 */
public class CombPanels {

    private JFrame tela;
    private JPanel painelPrincipal, painelEntrada, painelBotoes;
    private JLabel lblN1, lblN2;
    private Label lblResult, lblTitle;
    private TextField txtN1, txtN2;
    private JButton btnSum, btnSub, btnExit;

    public static void main(String[] args) {
        new CombPanels().montaTela();
        
    }

    private void montaTela() {
        preparaJanela();
        definirEventos();
    }

    private void preparaJanela() {
        tela = new JFrame("Exemplo - Combinação de Painéis");
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tela.setLayout(new BorderLayout());

        painelEntrada = new JPanel();
        painelEntrada.setLayout(new BoxLayout(painelEntrada, BoxLayout.PAGE_AXIS));
        tela.add(painelEntrada, BorderLayout.NORTH);

        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(3, 2));
        tela.add(painelPrincipal, BorderLayout.CENTER);

        painelBotoes = new JPanel(new FlowLayout());
        tela.add(painelBotoes, BorderLayout.SOUTH);

        lblTitle = new Label("Somando números", Label.CENTER);
        lblResult = new Label("Calculando a soma de 2 números");

        painelEntrada.add(lblTitle);

        lblN1 = new JLabel("Número 1: ");
        lblN2 = new JLabel("Número 2: ");
        txtN1 = new TextField("");
        txtN2 = new TextField("");

        painelPrincipal.add(lblN1);
        painelPrincipal.add(txtN1);
        painelPrincipal.add(lblN2);
        painelPrincipal.add(txtN2);
        painelPrincipal.add(lblResult);

        btnSum = new JButton("Sum");
        btnSub = new JButton("Sub");
        btnExit = new JButton("Exit");

        painelBotoes.add(btnSum);
        painelBotoes.add(btnSub);
        painelBotoes.add(btnExit);

        tela.pack();
        tela.setSize(600, 200);
        tela.setVisible(true);

    }

    private void definirEventos() {
     
        btnSum.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
              int soma = Integer.parseInt(txtN1.getText()) + Integer.parseInt(txtN2.getText());
              String r = Integer.toString(soma);
              lblResult.setText("Resultado: " + r);
            }
        });
        
        btnSub.addActionListener((ActionEvent e) -> {
            lblResult.setText("Resultado: " + (Integer.parseInt(txtN1.getText()) - Integer.parseInt(txtN2.getText())));
        });
    }

}