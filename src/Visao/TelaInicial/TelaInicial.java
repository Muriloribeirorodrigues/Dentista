package Visao.TelaInicial;

import Visao.Opcoes.SelecionarOpcoes;
import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {

    private JLabel Imagem;
    private JPanel jPanel1;
    private JButton IniciarAplicativo;

    public TelaInicial() {

        initComponents();

        setExtendedState(JFrame.MAXIMIZED_BOTH);

        ajustarTela();

        // Atualiza posições quando redimensionar
        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                ajustarTela();
            }
        });
    }


    private void initComponents() {

        Imagem = new JLabel() {

            private Image imagem;

            {
                try {

                    java.net.URL url = getClass()
                            .getResource("/Imagem/Odontologia Temporaria.png");

                    if (url != null) {
                        imagem = new ImageIcon(url).getImage();
                    }

                } catch (Exception e) {
                    System.out.println("Erro imagem: " + e.getMessage());
                }
            }


            @Override
            protected void paintComponent(Graphics g) {

                super.paintComponent(g);

                if (imagem != null) {

                    g.drawImage(
                            imagem,
                            0,
                            0,
                            getWidth(),
                            getHeight(),
                            this
                    );

                }
            }
        };


        jPanel1 = new JPanel();

        IniciarAplicativo = new JButton();


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial");


        // Layout manual
        getContentPane().setLayout(null);


        // Imagem
        Imagem.setBounds(
                0,
                0,
                801,
                528
        );


        // Painel transparente
        jPanel1.setOpaque(false);
        jPanel1.setLayout(null);

        jPanel1.setBounds(
                0,
                0,
                801,
                528
        );


        // Botão
        IniciarAplicativo.setText("Iniciar Aplicativo");
        IniciarAplicativo.setBorder(null);
        IniciarAplicativo.setFocusPainted(false);

        IniciarAplicativo.setBounds(
                320,
                240,
                160,
                40
        );


        IniciarAplicativo.addActionListener(e -> {
            IniciarAplicativoActionPerformed(e);
        });


        jPanel1.add(IniciarAplicativo);


        // Adiciona a imagem primeiro
        add(Imagem);

        // Adiciona o painel por cima
        add(jPanel1);


        setSize(801, 528);
        setLocationRelativeTo(null);
    }


    private void ajustarTela() {


        int largura = getContentPane().getWidth();
        int altura = getContentPane().getHeight();


        // imagem ocupa tudo
        Imagem.setBounds(
                0,
                0,
                largura,
                altura
        );


        // painel ocupa tudo
        jPanel1.setBounds(
                0,
                0,
                largura,
                altura
        );


        // botão no centro
        IniciarAplicativo.setLocation(
                (largura - IniciarAplicativo.getWidth()) / 2,
                (altura - IniciarAplicativo.getHeight()) / 2
        );


        repaint();
    }


    private void IniciarAplicativoActionPerformed(java.awt.event.ActionEvent evt) {

        dispose();

        new SelecionarOpcoes().setVisible(true);

    }


    public static void main(String args[]) {


        try {

            for (UIManager.LookAndFeelInfo info :
                    UIManager.getInstalledLookAndFeels()) {

                if ("Windows".equals(info.getName())) {

                    UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }

        } catch (Exception ex) {

            ex.printStackTrace();

        }


        java.awt.EventQueue.invokeLater(() -> {

            new TelaInicial().setVisible(true);

        });

    }
}