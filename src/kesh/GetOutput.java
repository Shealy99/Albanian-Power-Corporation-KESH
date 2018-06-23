/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kesh;

import java.io.File;
import java.io.IOException;

public class GetOutput extends javax.swing.JFrame {

    File file1, file2, file3;
    Veprimet p;

    public GetOutput(File file1, File file2, File file3, double price1, double price2, double price3, double price4) throws IOException {
        initComponents();
        this.file1 = file1;
        this.file2 = file2;
        this.file3 = file3;
        p = new Veprimet(file1, file2, file3, price1, price2, price3, price4);
        jTextField1.setText("" + p.getSum());
        setLocationRelativeTo(null);
        setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(643, 385));
        setMinimumSize(new java.awt.Dimension(643, 385));
        setPreferredSize(new java.awt.Dimension(643, 385));

        jPanel1.setMaximumSize(new java.awt.Dimension(633, 347));
        jPanel1.setMinimumSize(new java.awt.Dimension(633, 347));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Californian FB", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Efekti perfundimtar");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(410, 250, 160, 30);

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jTextField1.setText("545");
        jTextField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jTextField1);
        jTextField1.setBounds(410, 280, 200, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hidrocentral-fierza-okokokok-905x395_1518554032-9221156.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 633, 347);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
