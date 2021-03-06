/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipac;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Arga Diaz Prawira Yudha
 */
public class Class_Type extends javax.swing.JFrame {

    /**
     * Creates new form Class_Type
     */
    public Class_Type() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        classTypePane = new javax.swing.JPanel();
        classTypeLabel = new javax.swing.JLabel();
        ipTextField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        menuButton = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IPAC - Beta Version 1.0.0 (Class Type Finder)");
        setResizable(false);

        classTypePane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        classTypeLabel.setText("Insert IP");

        generateButton.setText("Generate");
        generateButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout classTypePaneLayout = new javax.swing.GroupLayout(classTypePane);
        classTypePane.setLayout(classTypePaneLayout);
        classTypePaneLayout.setHorizontalGroup(
            classTypePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classTypePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(classTypePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(classTypePaneLayout.createSequentialGroup()
                        .addComponent(classTypeLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ipTextField))
                .addContainerGap())
            .addGroup(classTypePaneLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        classTypePaneLayout.setVerticalGroup(
            classTypePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(classTypePaneLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(classTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ipTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        menuBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        menuButton.setText("Calculator Type");
        menuButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jMenuItem1.setText("Maximum Host");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuButton.add(jMenuItem1);

        jMenuItem3.setText("Class Type");
        jMenuItem3.setEnabled(false);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuButton.add(jMenuItem3);

        jMenuItem4.setText("DNS Validation");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuButton.add(jMenuItem4);

        menuBar.add(menuButton);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 322, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(classTypePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(classTypePane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MaxHostIP menu = new MaxHostIP();
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DNS_Valid menu = new DNS_Valid();
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        if( !ipTextField.getText().isEmpty() && Operation.isIpFormat(ipTextField.getText())){
            String ipString=ipTextField.getText();
            String message= ipString + " is " + Operation.classType(ipString);
            JOptionPane.showMessageDialog(new JFrame(), message, "Notice", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(
                new JFrame(), "Please enter the correct IP format.",
                "Error Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_generateButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel classTypeLabel;
    private javax.swing.JPanel classTypePane;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField ipTextField;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuButton;
    // End of variables declaration//GEN-END:variables
}
