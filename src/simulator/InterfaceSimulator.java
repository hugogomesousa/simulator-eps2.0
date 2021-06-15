/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulator;

import jade.core.Profile;
import jade.core.ProfileImpl;
import simulator.Simulator;
import jade.core.Runtime;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import system.entities.AgentsMa;

/**
 *
 * @author hugo
 */
public class InterfaceSimulator extends javax.swing.JFrame {

    Simulator simulator;

    /**
     * Creates new form InterfaceSimulator
     */
    public InterfaceSimulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAgentsMa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnAgentsMa = new javax.swing.JButton();
        txtOrder = new javax.swing.JTextField();
        btnOrder = new javax.swing.JButton();
        btnClearAgentsMa = new javax.swing.JButton();
        btnClearOrder = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaAgentsMa = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface Simulator EPS");
        setResizable(false);

        jLabel1.setText("Insira o nome do arquivo XML dos Agentes MA");

        txtAgentsMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgentsMaActionPerformed(evt);
            }
        });

        jLabel2.setText("Insira o nome do arquivo XML da Ordem de Produção");

        btnAgentsMa.setText("Ok");
        btnAgentsMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentsMaActionPerformed(evt);
            }
        });

        txtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderActionPerformed(evt);
            }
        });

        btnOrder.setText("Ok");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnClearAgentsMa.setText("CLEAR");
        btnClearAgentsMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAgentsMaActionPerformed(evt);
            }
        });

        btnClearOrder.setText("CLEAR");
        btnClearOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearOrderActionPerformed(evt);
            }
        });

        jTextAreaAgentsMa.setColumns(20);
        jTextAreaAgentsMa.setRows(5);
        jScrollPane2.setViewportView(jTextAreaAgentsMa);

        jLabel3.setText("Agentes Cyber-Físicos Instanciados:");

        jScrollPane1.setViewportView(jTextPane1);

        jLabel4.setText("Ordem de Produção:");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtAgentsMa, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAgentsMa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearAgentsMa))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrder, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearOrder)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAgentsMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgentsMa)
                    .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrder)
                    .addComponent(btnClearAgentsMa)
                    .addComponent(btnClearOrder))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgentsMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentsMaActionPerformed
        simulator = new Simulator();
        ArrayList<AgentsMa> agentsMa = new ArrayList<>(); //ArrayList do tipo AgentsMa para pegar o nome dos Agents presentes no XML
        String nameXmlAgentsMa = txtAgentsMa.getText(); //pega o texto presente no campo de texto do XML1
        if (nameXmlAgentsMa.equals("AgentsMa")) {
            JOptionPane.showMessageDialog(null, "XML correto");
            try {
                Runtime rt = Runtime.instance();
                Profile p = new ProfileImpl(true);
                ContainerController mainContainer = rt.createMainContainer(p);
                AgentController ac;
                ac = mainContainer.createNewAgent("Simulator", "simulator.Simulator", null);
                AgentController rma;
                rma = mainContainer.createNewAgent("rma", "jade.tools.rma.rma", null);
                ac.start();
                rma.start();
                agentsMa = simulator.readXML();
                for(AgentsMa am: agentsMa){
                    jTextAreaAgentsMa.append(am.getNameAg() + "\n");
                }
            } catch (StaleProxyException ex) {
                Logger.getLogger(InterfaceSimulator.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "XML Inválido");
        }


    }//GEN-LAST:event_btnAgentsMaActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        String strXML2 = txtOrder.getText();


    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnClearAgentsMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAgentsMaActionPerformed
        txtAgentsMa.setText("");
        jTextAreaAgentsMa.setText("");

    }//GEN-LAST:event_btnClearAgentsMaActionPerformed

    private void txtAgentsMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgentsMaActionPerformed

    }//GEN-LAST:event_txtAgentsMaActionPerformed

    private void txtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderActionPerformed

    private void btnClearOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearOrderActionPerformed
        txtOrder.setText("");
    }//GEN-LAST:event_btnClearOrderActionPerformed

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
            java.util.logging.Logger.getLogger(InterfaceSimulator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceSimulator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceSimulator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceSimulator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceSimulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgentsMa;
    private javax.swing.JButton btnClearAgentsMa;
    private javax.swing.JButton btnClearOrder;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaAgentsMa;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField txtAgentsMa;
    private javax.swing.JTextField txtOrder;
    // End of variables declaration//GEN-END:variables
}