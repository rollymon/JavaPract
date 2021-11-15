/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pract5;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author spaid
 */
public class NewJFrame extends javax.swing.JFrame {
        public void paint(Graphics grap) {
            super.paint(grap);
            Graphics2D g = (Graphics2D) grap;
            int[] x = {145, 145, 150, 150, 155, 155, 152, 152, 150, 150, 146, 146, 144, 144, 142, 142, 140, 140, 138, 138, 136, 136, 132, 132, 130, 130, 128, 128, 126, 126, 124, 124, 122, 122, 118, 118, 116, 116, 114, 114, 112, 112, 111, 110, 109, 108, 107, 106, 105, 104, 103, 102, 101, 100, 99, 90, 89, 88, 87, 86, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 96, 95, 96, 96};
            int[] y = {160, 155, 155, 150, 150, 70, 70, 68, 68, 66, 66, 68, 68, 70, 70, 100, 100, 64, 64, 62, 62, 60, 60, 62, 62, 64, 64, 100, 100, 64, 64, 62, 62, 60, 60, 62, 62, 64, 64, 100, 100, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 77, 78, 79, 80, 81, 90, 91, 92, 93, 94, 95, 96 ,97, 98, 99, 100, 101, 102, 105, 110, 160};
            int ln = x.length;
 
            g.setColor(Color.WHITE);
            g.fillPolygon(x, y, ln);

            g.setColor(Color.RED);
            g.fillRoundRect(85, 150, 75, 10, 5, 10);

            g.setColor(Color.BLACK);
            g.drawRoundRect(85, 150, 75, 10, 5, 10);
            g.drawPolygon(x, y, ln);
            
            g.setColor(Color.BLACK);
            g.fillOval(115, 110, 7, 7);
            g.fillOval(135, 110, 7, 7);

            g.setColor(Color.RED);
            g.fillOval(117, 120, 18, 15);

            g.setColor(Color.BLACK);

            int i[] = {110, 119};
            int j[] = {110, 108};
            ln = i.length;
            g.drawPolygon(i, j, ln);
            
            int k[] = {145, 130};
            int l[] = {110, 106};
            ln = k.length;
            g.drawPolygon(k, l, ln);
            
            int m[] = {110, 115, 116, 118, 125};
            int n[] = {140, 145, 146, 146, 146};
            ln = m.length;

            g.drawPolygon(m, n, ln);
            g.fillPolygon(m, n, ln);

            g.setFont(new Font("Times New Roman", Font.BOLD, 16));
            g.drawString("JAVA!", 87, 45);
            
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.drawString("D. P. - 4", 80, 180);
            
            
    /**
     * Creates new form NewJFrame
     */}
    public NewJFrame() {
        initComponents();
        setSize(220, 220);
        setTitle("Lab-5");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 268, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 256, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
