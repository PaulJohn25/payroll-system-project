/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.component;

import com.mycompany.payrollsystem.Util;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.SwingUtilities;

/**
 *
 * @author Paul
 */
public class Staff_Dashboard_Profile extends javax.swing.JPanel {

    private final Color backgroundColor = new Color(245, 247, 248);
    private final Util util = new Util();

    /**
     * Creates new form Dashboard_Profile
     */
    public Staff_Dashboard_Profile() {
        initComponents();
        setOpaque(false);
        setBackground(backgroundColor);
        SwingUtilities.invokeLater(() -> {
            button_dashboard_logout.setupButton("icons/logout _black.png", "Logout", false);
            util.fitImageToComponent(staff_image, "staff_images/my_image.png");
        });
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        
        int arcWidth = 15;
        int arcHeight = 15;
        int width = getWidth();
        int height = getHeight();
     
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, width, height, arcWidth, arcHeight);
        super.paintComponent(graphics);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        last_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button_dashboard_logout = new com.mycompany.payrollsystem.component.ButtonDashboard();
        circlePanel1 = new com.mycompany.payrollsystem.swing.CirclePanel();
        staff_image = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome");

        last_name.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        last_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        last_name.setText("IMPERIAL,");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("JOHN PAUL");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Programmers");

        circlePanel1.setBackground(new java.awt.Color(222, 232, 227));
        circlePanel1.setForeground(new java.awt.Color(222, 232, 227));

        javax.swing.GroupLayout circlePanel1Layout = new javax.swing.GroupLayout(circlePanel1);
        circlePanel1.setLayout(circlePanel1Layout);
        circlePanel1Layout.setHorizontalGroup(
            circlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circlePanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staff_image, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
        circlePanel1Layout.setVerticalGroup(
            circlePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, circlePanel1Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addComponent(staff_image, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(button_dashboard_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(last_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(circlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(circlePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(last_name)
                .addGap(0, 0, 0)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(36, 36, 36)
                .addComponent(button_dashboard_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.payrollsystem.component.ButtonDashboard button_dashboard_logout;
    private com.mycompany.payrollsystem.swing.CirclePanel circlePanel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel last_name;
    private javax.swing.JLabel staff_image;
    // End of variables declaration//GEN-END:variables
}