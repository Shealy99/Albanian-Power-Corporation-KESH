package kesh;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Inputi extends JFrame {

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFileChooser jFileChooser1;
    private File file1 = null;
    private File file2 = null;
    private File file3 = null;
    private Double price1 = null, price2 = null, price3 = null, price4 = null;

    public Inputi() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        do {
            try {
                price1 = Double.parseDouble(JOptionPane.showInputDialog("Cmimi per -+"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vendos numra!");
            }
        } while (price1 == null);
        do {
            try {
                price2 = Double.parseDouble(JOptionPane.showInputDialog("Cmimi per --"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vendos numra!");
            }
        } while (price2 == null);
        do {
            try {
                price3 = Double.parseDouble(JOptionPane.showInputDialog("Cmimi per +-"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vendos numra!");
            }
        } while (price3 == null);
        do {
            try {
                price4 = Double.parseDouble(JOptionPane.showInputDialog("Cmimi per ++"));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Vendos numra!");
            }
        } while (price4 == null);

    }

    private void initComponents() {
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(670, 488));
        setMinimumSize(new java.awt.Dimension(670, 488));
        setPreferredSize(new java.awt.Dimension(670, 488));

        jPanel1.setBackground(new java.awt.Color(0, 0, 200));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(null);

        jButton1.setText("ACE");
        jPanel1.add(jButton1);
        jButton1.setBounds(310, 400, 120, 30);

        jButton2.setText("Nominimi Fizik");
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 400, 120, 30);

        jButton3.setText("Matjet Faktike");
        jPanel1.add(jButton3);
        jButton3.setBounds(170, 400, 120, 30);

        jButton4.setText("Vazhdo");
        jPanel1.add(jButton4);
        jButton4.setBounds(550, 400, 90, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Webp.net-resizeimage (1).png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255), null, null));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 20, 140, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/energia-hidreletrica-perdas-700x480.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 670, 460);
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFileChooser1 = new JFileChooser();
                jFileChooser1.setDialogTitle("Zgjidh skedarin");
                jFileChooser1.showOpenDialog(null);
                file1 = jFileChooser1.getSelectedFile();

            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFileChooser1 = new JFileChooser();
                jFileChooser1.setDialogTitle("Zgjidh skedarin");
                jFileChooser1.showOpenDialog(null);
                file2 = jFileChooser1.getSelectedFile();

            }
        });
        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFileChooser1 = new JFileChooser();
                jFileChooser1.setDialogTitle("Zgjidh skedarin");
                jFileChooser1.showOpenDialog(null);
                file3 = jFileChooser1.getSelectedFile();
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (file1 != null && file2 != null && file3 != null) {
                    GetOutput g;
                    if (file1.getPath().endsWith(".xlsx") && file2.getPath().endsWith(".xlsx") && file3.getPath().endsWith(".xlsx")) {
                        try {
                            g = new GetOutput(file1, file2, file3, price1, price2, price3, price4);
                            g.setVisible(true);
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }

                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Vendos file (*.xlsx)");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Vendos te 3 skedaret");
                }

            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );

        pack();
    }

}
