/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Visao.Opcoes.Pacientes.Agendamento;
import Controle.AgendamentoC;
import Modelo.AgendamentoM;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
/**
 *
 * @author guto4
 */
public class NovoAgendamento extends javax.swing.JFrame {
    int countCPF = 0;
    int countCPF2 = 0;
    int countData = 0;
    int countAgend = 0;
    /**
     * Creates new form NovoAgendamento
     */
    public NovoAgendamento() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cpfpac = new javax.swing.JTextField();
        cpfdent = new javax.swing.JTextField();
        dataat = new javax.swing.JTextField();
        ConfirmaAgendamento = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        HorAgend = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Imagem = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro De Agendamento");
        setMaximumSize(new java.awt.Dimension(800, 533));
        setMinimumSize(new java.awt.Dimension(800, 533));
        getContentPane().setLayout(null);

        getContentPane().add(Imagem);
        Imagem.setBounds(0, 0, 800, 533);
        jLabel2.setText("CPF Do Paciente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 270, 120, 20);

        jLabel1.setText("CPF Do Dentista");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(440, 300, 110, 20);

        jLabel3.setText("Data Do Atendimento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 330, 120, 30);

        cpfpac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfpacKeyTyped(evt);
            }
        });
        getContentPane().add(cpfpac);
        cpfpac.setBounds(580, 270, 170, 22);

        cpfdent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cpfdentKeyTyped(evt);
            }
        });
        getContentPane().add(cpfdent);
        cpfdent.setBounds(580, 300, 170, 22);

        dataat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dataatKeyTyped(evt);
            }
        });
        getContentPane().add(dataat);
        dataat.setBounds(580, 330, 170, 22);

        ConfirmaAgendamento.setText("Confirmar Agendamento");
        ConfirmaAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaAgendamentoActionPerformed(evt);
            }
        });
        getContentPane().add(ConfirmaAgendamento);
        ConfirmaAgendamento.setBounds(580, 400, 170, 23);

        Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/216437_back_arrow_icon.png"))); // NOI18N
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(0, 450, 80, 40);

        HorAgend.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                HorAgendKeyTyped(evt);
            }
        });
        getContentPane().add(HorAgend);
        HorAgend.setBounds(580, 360, 170, 22);

        jLabel4.setText("Horário Do Atendimento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 360, 140, 20);

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

        final Image imagem = new ImageIcon(url).getImage();

        Imagem = new JLabel() {
            @Override
            protected void paintComponent(Graphics g) {
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

        Imagem.setBounds(
                0,
                0,
                getContentPane().getWidth(),
                getContentPane().getHeight()
        );

        getContentPane().add(Imagem);

        // Imagem fica atrás
        getContentPane().setComponentZOrder(
                Imagem,
                getContentPane().getComponentCount() - 1
        );
    }

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
    dispose();
    new Agendamento().setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void ConfirmaAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaAgendamentoActionPerformed
    String cpfpaciente = cpfpac.getText();
    String cpfdentista = cpfdent.getText();
    String dataatendimento = dataat.getText();
    String HorarioAgendamento = HorAgend.getText();
    
    AgendamentoM agend = new AgendamentoM(cpfpaciente,cpfdentista,dataatendimento,HorarioAgendamento);
    AgendamentoC agc = new AgendamentoC();
    agc.CadastroAgendamento(agend);
    
    dispose();
    new AgendamentoConcluido().setVisible(true);
    }//GEN-LAST:event_ConfirmaAgendamentoActionPerformed

    private void cpfpacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfpacKeyTyped
    if(evt.getKeyChar() == '0' |evt.getKeyChar() == '1' |evt.getKeyChar() == '2'|evt.getKeyChar() == '3'
            |evt.getKeyChar() == '4'|evt.getKeyChar() == '5'|evt.getKeyChar() == '6'|evt.getKeyChar() == '7'|evt.getKeyChar() == '8'|evt.getKeyChar() == '9'){
        if(cpfpac.getText().isEmpty()){
          countCPF = 0;
        }
        countCPF = countCPF+1;
        if (countCPF == 4)
    {
        cpfpac.setText(cpfpac.getText() + ".");
        countCPF = countCPF+1;
    }
    if (countCPF == 8)
    {
       cpfpac.setText(cpfpac.getText() + "."); 
       countCPF = countCPF+1;
    }
    if (countCPF == 12){
        cpfpac.setText(cpfpac.getText() + "-");
        countCPF = countCPF+1;
    }
    }
    
    if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
        if (countCPF > 0){
            countCPF = countCPF-1;
        }
        else if(countCPF == 1){
        countCPF = countCPF-2;    
        }
        else if(countCPF == 2){
        countCPF = countCPF-2;    
        }
        else if(countCPF == 3){
        countCPF = countCPF-2;    
        }
        
    }
    }//GEN-LAST:event_cpfpacKeyTyped

    private void cpfdentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpfdentKeyTyped
        if(evt.getKeyChar() == '0' |evt.getKeyChar() == '1' |evt.getKeyChar() == '2'|evt.getKeyChar() == '3'
            |evt.getKeyChar() == '4'|evt.getKeyChar() == '5'|evt.getKeyChar() == '6'|evt.getKeyChar() == '7'|evt.getKeyChar() == '8'|evt.getKeyChar() == '9'){
        if(cpfdent.getText().isEmpty()){
          countCPF2 = 0;
        }
        countCPF2 = countCPF2+1;
        if (countCPF2 == 4)
    {
        cpfdent.setText(cpfdent.getText() + ".");
        countCPF2 = countCPF2+1;
    }
    if (countCPF2 == 8)
    {
       cpfdent.setText(cpfdent.getText() + "."); 
       countCPF2 = countCPF2+1;
    }
    if (countCPF2 == 12){
        cpfdent.setText(cpfdent.getText() + "-");
        countCPF2 = countCPF2+1;
    }
    }
    
    if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
        if (countCPF2 > 0){
            countCPF2 = countCPF2-1;
        }
        else if(countCPF2 == 1){
        countCPF2 = countCPF2-2;    
        }
        else if(countCPF2 == 2){
        countCPF2 = countCPF2-2;    
        }
        else if(countCPF2 == 3){
        countCPF2 = countCPF2-2;    
        }
        
    }
    }//GEN-LAST:event_cpfdentKeyTyped

    private void dataatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dataatKeyTyped
    
    
    if(evt.getKeyChar() == '0' |evt.getKeyChar() == '1' |evt.getKeyChar() == '2'|evt.getKeyChar() == '3'
            |evt.getKeyChar() == '4'|evt.getKeyChar() == '5'|evt.getKeyChar() == '6'|evt.getKeyChar() == '7'|evt.getKeyChar() == '8'|evt.getKeyChar() == '9'){
        if(dataat.getText().isEmpty()){
            countData = 0;
        }
            countData = countData+1;
        if (countData == 3)
    {
        dataat.setText(dataat.getText() + "/");
        countData = countData+1;
    }
    if (countData == 6)
    {
       dataat.setText(dataat.getText() + "/"); 
       countData = countData+1;
    }
    }
    
    if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
        if (countData > 0){
            countData = countData-1;
        }
        else if(countData == 1){
        countData = countData-2;    
        }
        else if(countData == 3){
        countData = countData-2;    
        }
        
    }
    }//GEN-LAST:event_dataatKeyTyped

    private void HorAgendKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HorAgendKeyTyped
            if(evt.getKeyChar() == '0' |evt.getKeyChar() == '1' |evt.getKeyChar() == '2'|evt.getKeyChar() == '3'
            |evt.getKeyChar() == '4'|evt.getKeyChar() == '5'|evt.getKeyChar() == '6'|evt.getKeyChar() == '7'|evt.getKeyChar() == '8'|evt.getKeyChar() == '9'){
        if(HorAgend.getText().isEmpty()){
          countAgend = 0;
        }
        countAgend = countAgend+1;
        if (countAgend == 3)
    {
        HorAgend.setText(HorAgend.getText() + ":");
        countAgend = countAgend+1;
    }
    }
    
    if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE){
        if (countAgend > 0){
            countAgend = countAgend-1;
        }
        else if(countAgend == 1){
        countAgend = countAgend-2;    
        }
        
    }
    }//GEN-LAST:event_HorAgendKeyTyped

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
            java.util.logging.Logger.getLogger(NovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NovoAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovoAgendamento().setVisible(true);
            }
        });
    }


    private void ajustarTela() {

        int largura = getContentPane().getWidth();
        int altura = getContentPane().getHeight();

        // ==============================
        // IMAGEM DE FUNDO
        // ==============================

        Imagem.setBounds(
                0,
                0,
                largura,
                altura
        );


        // ==============================
        // TAMANHO DOS CAMPOS
        // ==============================

        int larguraCampo = 170;
        int alturaCampo = 25;

        // Espaço entre label e campo
        int espaco = 10;

        // Largura do label
        int larguraLabel = 140;


        // ==============================
        // CENTRALIZA O CONJUNTO
        // ==============================

        int larguraTotal = larguraLabel + espaco + larguraCampo;

        int xLabel = (largura - larguraTotal) / 2;

        int xCampo = xLabel + larguraLabel + espaco;


        // ==============================
        // POSIÇÃO VERTICAL
        // ==============================

        int y = (altura / 2) - 80;


        // ==============================
        // CPF DO PACIENTE
        // ==============================

        jLabel2.setBounds(
                xLabel,
                y,
                larguraLabel,
                alturaCampo
        );

        cpfpac.setBounds(
                xCampo,
                y,
                larguraCampo,
                alturaCampo
        );


        // ==============================
        // CPF DO DENTISTA
        // ==============================

        jLabel1.setBounds(
                xLabel,
                y + 40,
                larguraLabel,
                alturaCampo
        );

        cpfdent.setBounds(
                xCampo,
                y + 40,
                larguraCampo,
                alturaCampo
        );


        // ==============================
        // DATA
        // ==============================

        jLabel3.setBounds(
                xLabel,
                y + 80,
                larguraLabel,
                alturaCampo
        );

        dataat.setBounds(
                xCampo,
                y + 80,
                larguraCampo,
                alturaCampo
        );


        // ==============================
        // HORÁRIO
        // ==============================

        jLabel4.setBounds(
                xLabel,
                y + 120,
                larguraLabel,
                alturaCampo
        );

        HorAgend.setBounds(
                xCampo,
                y + 120,
                larguraCampo,
                alturaCampo
        );


        // ==============================
        // BOTÃO CONFIRMAR
        // ==============================

        ConfirmaAgendamento.setBounds(
                xCampo,
                y + 160,
                larguraCampo,
                30
        );


        // ==============================
        // BOTÃO VOLTAR
        // ==============================

        Voltar.setBounds(
                15,
                altura - 60,
                45,
                45
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmaAgendamento;
    private javax.swing.JTextField HorAgend;
    private javax.swing.JLabel Imagem;
    private javax.swing.JButton Voltar;
    private javax.swing.JTextField cpfdent;
    private javax.swing.JTextField cpfpac;
    private javax.swing.JTextField dataat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}


