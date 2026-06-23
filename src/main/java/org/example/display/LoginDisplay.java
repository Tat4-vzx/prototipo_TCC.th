package org.example.display;

import org.example.dao.LoginDAO;

import javax.swing.*;
import java.awt.*;

public class LoginDisplay extends JFrame{
    public LoginDisplay (){
        setTitle("Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel lblNome= new JLabel("Nome: ");
        JTextField textNome = new JTextField();

        JLabel lblSenha= new JLabel("Senha: ");
        JTextField textSenha = new JTextField();


        JButton bntSalvar =  new JButton("Entrar");

        String nome = textNome.getText();
        String senha = textSenha.getText();

        bntSalvar.addActionListener(e -> {
                    if (nome.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                    } else if (senha.isEmpty()) {}

            FeedBackDisplay feedBackDisplay = new FeedBackDisplay();
            feedBackDisplay.setVisible(true);

                });

        LoginDisplay.this.dispose();


        painel.add(lblNome);
        painel.add(textNome);
        painel.add(lblSenha);
        painel.add(textSenha);
        painel.add(new JLabel(""));
        painel.add(bntSalvar);
        add(painel);

    }

}
