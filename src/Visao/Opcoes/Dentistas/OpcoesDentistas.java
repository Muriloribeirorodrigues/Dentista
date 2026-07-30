/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao.Opcoes.Dentistas;

import Visao.Opcoes.SelecionarOpcoes;
import Visao.Opcoes.Dentistas.Cadastro.CadastroDentista;
import Visao.Opcoes.Dentistas.Cadastro.CadastroDentistaEndereco;
import Visao.Opcoes.Dentistas.Consulta.ConsultaDentistas;
import Visao.Opcoes.Dentistas.Deletar.DeletarDentista;
import Visao.Opcoes.Dentistas.Agendamento.Agendamento;
import Visao.Opcoes.Dentistas.Atualizacao.AtualizarDadosDentista;
import Visao.Opcoes.Dentistas.Atualizacao.AtualizacaoEnderecoDentista;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author guto4
 */
public class OpcoesDentistas extends javax.swing.JFrame {

    /**
     * Creates new form OpcoesDentistas
     */
    public OpcoesDentistas() {

        initComponents();

        ConfigurarImagem();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        addComponentListener(new java.awt.event.ComponentAdapter() {

            @Override
            public void componentResized(java.awt.event.ComponentEvent e) {
                ajustarTela();
            }
        });

        SwingUtilities.invokeLater(() -> {
            ajustarTela();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltarSelecionarOpcoes = new javax.swing.JButton();
        CadastroDentista = new javax.swing.JButton();
        CadastroEnderecoDentista = new javax.swing.JButton();
        ConsultasDentistas = new javax.swing.JButton();
        AgendaDentistas = new javax.swing.JButton();
        DeletarDentistas = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Opções Dentistas");
        setMaximumSize(new java.awt.Dimension(801, 528));
        setMinimumSize(new java.awt.Dimension(801, 528));
        getContentPane().setLayout(null);

        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 530);
        VoltarSelecionarOpcoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/216437_back_arrow_icon.png"))); // NOI18N
        VoltarSelecionarOpcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarSelecionarOpcoesActionPerformed(evt);
            }
        });
        getContentPane().add(VoltarSelecionarOpcoes);
        VoltarSelecionarOpcoes.setBounds(0, 463, 54, 30);

        CadastroDentista.setText("Cadastrar Dentista");
        CadastroDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroDentistaActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroDentista);
        CadastroDentista.setBounds(310, 180, 200, 23);

        CadastroEnderecoDentista.setText("Cadastrar Endereço Do Dentista");
        CadastroEnderecoDentista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastroEnderecoDentistaActionPerformed(evt);
            }
        });
        getContentPane().add(CadastroEnderecoDentista);
        CadastroEnderecoDentista.setBounds(310, 240, 200, 23);

        ConsultasDentistas.setText("Consultar Dentistas Cadastrados");
        ConsultasDentistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultasDentistasActionPerformed(evt);
            }
        });
        getContentPane().add(ConsultasDentistas);
        ConsultasDentistas.setBounds(310, 300, 200, 23);

        AgendaDentistas.setText("Agendamento Dos Dentistas");
        AgendaDentistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgendaDentistasActionPerformed(evt);
            }
        });
        getContentPane().add(AgendaDentistas);
        AgendaDentistas.setBounds(310, 330, 200, 23);

        DeletarDentistas.setText("Deletar Dentistas");
        DeletarDentistas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarDentistasActionPerformed(evt);
            }
        });
        getContentPane().add(DeletarDentistas);
        DeletarDentistas.setBounds(310, 360, 200, 23);

        jButton1.setText("Atualizar Dados Do Dentista");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 210, 200, 23);

        jButton2.setText("Atualizar Endereço Do Dentista");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(310, 270, 200, 23);

        pack();
        setSize(801, 528);
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ConfigurarImagem() {

        java.net.URL url = getClass()
                .getResource("/Imagem/Odontologia Temporaria.png");

        if (url == null) {
            System.out.println("Imagem não encontrada!");
            return;
        }


        Image imagem = new ImageIcon(url).getImage();


        jLabel1 = new JLabel() {

            @Override
            protected void paintComponent(java.awt.Graphics g) {

                super.paintComponent(g);

                g.drawImage(
                        imagem,
                        0,
                        0,
                        getWidth(),
                        getHeight(),
                        this
                );
            }
        };


        getContentPane().add(jLabel1);
        getContentPane().setComponentZOrder(AgendaDentistas, 0);
        getContentPane().setComponentZOrder(CadastroDentista, 0);
        getContentPane().setComponentZOrder(CadastroEnderecoDentista, 0);
        getContentPane().setComponentZOrder(ConsultasDentistas, 0);
        getContentPane().setComponentZOrder(DeletarDentistas, 0);
        getContentPane().setComponentZOrder(VoltarSelecionarOpcoes, 0);
        getContentPane().setComponentZOrder(jButton1, 0);
        getContentPane().setComponentZOrder(jButton2, 0);
    }

    private void VoltarSelecionarOpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarSelecionarOpcoesActionPerformed
    dispose();
    new SelecionarOpcoes().setVisible(true);
    }//GEN-LAST:event_VoltarSelecionarOpcoesActionPerformed

    private void CadastroDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroDentistaActionPerformed
    dispose();
    new CadastroDentista().setVisible(true);
    }//GEN-LAST:event_CadastroDentistaActionPerformed

    private void CadastroEnderecoDentistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastroEnderecoDentistaActionPerformed
    dispose();
    new CadastroDentistaEndereco().setVisible(true);
    }//GEN-LAST:event_CadastroEnderecoDentistaActionPerformed

    private void ConsultasDentistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultasDentistasActionPerformed
    dispose();
    new ConsultaDentistas().setVisible(true);
    }//GEN-LAST:event_ConsultasDentistasActionPerformed

    private void DeletarDentistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarDentistasActionPerformed
    dispose();
    new DeletarDentista().setVisible(true);
    }//GEN-LAST:event_DeletarDentistasActionPerformed

    private void AgendaDentistasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgendaDentistasActionPerformed
    dispose();
    new Agendamento().setVisible(true);
    }//GEN-LAST:event_AgendaDentistasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    dispose();
    new AtualizarDadosDentista().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    dispose();
    new AtualizacaoEnderecoDentista().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OpcoesDentistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OpcoesDentistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OpcoesDentistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OpcoesDentistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OpcoesDentistas().setVisible(true);
            }
        });
    }

    private void abrirTela(javax.swing.JFrame tela) {
        dispose();
        tela.setLocationRelativeTo(null); // Centraliza a janela
        tela.setVisible(true);
    }

    private void ajustarTela() {

        int largura = getContentPane().getWidth();
        int altura = getContentPane().getHeight();


        // imagem ocupa toda a tela
        jLabel1.setBounds(
                0,
                0,
                largura,
                altura
        );


        int larguraBotao = 220;
        int alturaBotao = 30;


        int x = (largura - larguraBotao) / 2;

        int y = (altura / 2) - 50;

        AgendaDentistas.setBounds(
                x,
                y+160,
                larguraBotao,
                alturaBotao
        );

        CadastroDentista.setBounds(
                x,
                y,
                larguraBotao,
                alturaBotao
        );

        CadastroEnderecoDentista.setBounds(
                x,
                y+40,
                larguraBotao,
                alturaBotao
        );

        ConsultasDentistas.setBounds(
                x,
                y+200,
                larguraBotao,
                alturaBotao
        );

        DeletarDentistas.setBounds(
                x,
                y+240,
                larguraBotao,
                alturaBotao
        );

        VoltarSelecionarOpcoes.setBounds(
                15,
                altura - 60,
                45,
                45
        );

        jButton1.setBounds(
                x,
                y+80,
                larguraBotao,
                alturaBotao
        );

        jButton2.setBounds(
                x,
                y+120,
                larguraBotao,
                alturaBotao
        );


    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgendaDentistas;
    private javax.swing.JButton CadastroDentista;
    private javax.swing.JButton CadastroEnderecoDentista;
    private javax.swing.JButton ConsultasDentistas;
    private javax.swing.JButton DeletarDentistas;
    private javax.swing.JButton VoltarSelecionarOpcoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
