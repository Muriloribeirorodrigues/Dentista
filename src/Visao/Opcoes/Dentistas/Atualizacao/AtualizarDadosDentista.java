/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao.Opcoes.Dentistas.Atualizacao;
import java.awt.*;
import javax.swing.*;
import Visao.Opcoes.Dentistas.OpcoesDentistas;
import Controle.DadosPessoaisC;
import java.awt.event.KeyEvent;
/**
 *
 * @author guto4
 */
public class AtualizarDadosDentista extends javax.swing.JFrame {
    private Image imagemOriginalCache = null;
    int countContato = 0;
    int countCPF = 0;
    /**
     * Creates new form AtualizarDadosDentista
     */
    public AtualizarDadosDentista() {
        initComponents();

        getContentPane().setComponentZOrder(
                Imagem,
                getContentPane().getComponentCount() - 1
        );

        // Reaplica o estado (maximizada ou nao) que o usuario estava usando
        if (Utilitarios.EstadoJanela.maximizada) {
            setExtendedState(JFrame.MAXIMIZED_BOTH);
        }

        // Guarda o estado atual sempre que o usuario maximizar/restaurar a janela
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            @Override
            public void windowStateChanged(java.awt.event.WindowEvent e) {
                Utilitarios.EstadoJanela.maximizada =
                        (getExtendedState() & JFrame.MAXIMIZED_BOTH) == JFrame.MAXIMIZED_BOTH;
            }
        });

        // Ajusta a tela ao tamanho da janela
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

        jLabel2 = new javax.swing.JLabel();
        tCPF = new javax.swing.JTextField();
        tItem = new javax.swing.JTextField();
        ConfirmaAtualizacao = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        tOpcao = new javax.swing.JComboBox<>();
        Imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Atualizar Dados Do Dentista");
        setMaximumSize(new java.awt.Dimension(801, 528));
        setMinimumSize(new java.awt.Dimension(801, 528));
        getContentPane().setLayout(null);

        jLabel2.setText("Informe O CPF Do Dentista");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 320, 150, 16);

        tCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tCPFKeyTyped(evt);
            }
        });
        getContentPane().add(tCPF);
        tCPF.setBounds(660, 320, 120, 22);

        tItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tItemKeyTyped(evt);
            }
        });
        getContentPane().add(tItem);
        tItem.setBounds(660, 350, 120, 22);

        ConfirmaAtualizacao.setText("Confirmar Atualização");
        ConfirmaAtualizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaAtualizacaoActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmaAtualizacao);
        ConfirmaAtualizacao.setBounds(625, 380, 150, 23);

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/216437_back_arrow_icon.png"))); // NOI18N
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(0, 460, 70, 30);

        tOpcao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "Contato" }));
        getContentPane().add(tOpcao);
        tOpcao.setBounds(500, 350, 150, 22);

        Imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/Odontologia Temporaria.png"))); // NOI18N
        getContentPane().add(Imagem);
        Imagem.setBounds(0, 0, 800, 533);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
    dispose();
    new OpcoesDentistas().setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfirmaAtualizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaAtualizacaoActionPerformed
    String CPF = tCPF.getText();
    String tOP = tOpcao.getSelectedItem().toString();
    String Item = tItem.getText();
    DadosPessoaisC dp = new DadosPessoaisC();
    if (tOP == "Nome"){
        dp.AtualizaDentistaNome(CPF, Item);
    }
    if (tOP == "Contato"){
        dp.AtualizaDentistaContato(CPF, Item);
    }
    dispose();
    new AtualizacaoDadosConcluida().setVisible(true);
    }//GEN-LAST:event_ConfirmaAtualizacaoActionPerformed

    private void tItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tItemKeyTyped
     String tOP = tOpcao.getSelectedItem().toString();
     if (tOP == "Contato"){
         if(evt.getKeyChar() == '0' |evt.getKeyChar() == '1' |evt.getKeyChar() == '2'|evt.getKeyChar() == '3'
            |evt.getKeyChar() == '4'|evt.getKeyChar() == '5'|evt.getKeyChar() == '6'|evt.getKeyChar() == '7'|evt.getKeyChar() == '8'|evt.getKeyChar() == '9'){
    if(tItem.getText().isEmpty()){
          countContato = 0;
        }
    countContato = countContato+1;
        if (countContato == 1)
    {
        tItem.setText(tItem.getText() + "(");
        countContato = countContato+1;
    }
    if (countContato == 4)
    {
       tItem.setText(tItem.getText() + ")");
       countContato = countContato+1;
    }
    if (countContato == 10){
        tItem.setText(tItem.getText() + "-");
        countContato = countContato+1;
    }
    }

    if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
        if (countContato > 0){
            countContato = countContato-1;
        }
        else if (countContato == 1)
        {
        countContato = countContato-2;
        }
        else if (countContato == 4)
        {
       countContato = countContato-2;
        }
        else if (countContato == 10)
        {
        countContato = countContato-2;

    }
     }
     }
    }//GEN-LAST:event_tItemKeyTyped

    private void tCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCPFKeyTyped
       if(evt.getKeyChar() == '0' |evt.getKeyChar() == '1' |evt.getKeyChar() == '2'|evt.getKeyChar() == '3'
            |evt.getKeyChar() == '4'|evt.getKeyChar() == '5'|evt.getKeyChar() == '6'|evt.getKeyChar() == '7'|evt.getKeyChar() == '8'|evt.getKeyChar() == '9'){
    if(tCPF.getText().isEmpty()){
          countCPF = 0;
        }
    countCPF = countCPF+1;
        if (countCPF == 4)
    {
        tCPF.setText(tCPF.getText() + ".");
        countCPF = countCPF+1;
    }
    if (countCPF == 8)
    {
       tCPF.setText(tCPF.getText() + ".");
       countCPF = countCPF+1;
    }
    if (countCPF == 12){
        tCPF.setText(tCPF.getText() + "-");
        countCPF = countCPF+1;
    }
    }

    if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
        if (countCPF > 0){
            countCPF = countCPF-1;
        }
        else if (countCPF == 1)
        {
        countCPF = countCPF-2;
        }
        else if (countCPF == 2)
        {
       countCPF = countCPF-2;
        }
        else if (countCPF == 3)
        {
        countCPF = countCPF-2;
        }

    }
    }//GEN-LAST:event_tCPFKeyTyped

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
            java.util.logging.Logger.getLogger(AtualizarDadosDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AtualizarDadosDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AtualizarDadosDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AtualizarDadosDentista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AtualizarDadosDentista().setVisible(true);
            }
        });
    }

        private void atualizarImagem() {

        if (imagemOriginalCache == null) {
            imagemOriginalCache = new ImageIcon(
                    getClass().getResource("/Imagem/Odontologia Temporaria.png")
            ).getImage();
        }

        Image imagemRedimensionada = imagemOriginalCache.getScaledInstance(
                Imagem.getWidth(),
                Imagem.getHeight(),
                Image.SCALE_SMOOTH
        );

        Imagem.setIcon(
                new ImageIcon(imagemRedimensionada)
        );
    }

    private void ajustarTela() {

        int largura = getContentPane().getWidth();
        int altura = getContentPane().getHeight();

        // =====================================
        // IMAGEM DE FUNDO
        // =====================================

        Imagem.setBounds(
                0,
                0,
                largura,
                altura
        );

        atualizarImagem();

        // =====================================
        // COMPONENTES (mantêm a posição relativa do layout original)
        // =====================================

        int cx = largura / 2;
        int cy = altura / 2;

        jLabel2.setBounds(
                cx - 140,
                cy - 42,
                150,
                16
        );

        tCPF.setBounds(
                cx + 20,
                cy - 42,
                120,
                22
        );

        tItem.setBounds(
                cx + 20,
                cy - 12,
                120,
                22
        );

        ConfirmaAtualizacao.setBounds(
                cx - 15,
                cy + 18,
                150,
                23
        );

        tOpcao.setBounds(
                cx - 140,
                cy - 12,
                150,
                22
        );

        // =====================================
        // VOLTAR
        // =====================================

        Voltar.setBounds(
                15,
                altura - 60,
                70,
                30
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmaAtualizacao;
    private javax.swing.JLabel Imagem;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tCPF;
    private javax.swing.JTextField tItem;
    private javax.swing.JComboBox<String> tOpcao;
    // End of variables declaration//GEN-END:variables
}
