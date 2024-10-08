/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.component;

import com.mycompany.payrollsystem.Util;
import com.mycompany.payrollsystem.model.CardModel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.Icon;

/**
 *
 * @author Paul
 */
public class Card extends javax.swing.JPanel {

    
    
   
//    private final int ICON_WIDTH = 20;
//    private final int ICON_HEIGHT = 20;
    private Util util = new Util();
    
    // Column 1 card color -> [47,71,186]
    // Column 2 card color -> [255,141,7]
    // Column 3 card color -> [220,53,69]
    
    /**
     * Creates new form NewJPanel
     */
     
    public Card() {
        initComponents();
        setOpaque(false);
    }
    
    public void setupData(CardModel cardModel) {
        text_panel.setText("<html>" + cardModel.getCardText() + "</html>");
        count_panel.setText(cardModel.getCount().toString());
//        util.fitImageToComponent(icon_panel, "icons/" + cardModel.getIcon() + ".png");
//        icon_panel.setIcon(cardModel.toIcon(ICON_WIDTH, ICON_HEIGHT));
    }
        
    public void setIcon(Icon icon) {
        this.icon_panel.setIcon(icon);
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        
         int arcWidth = 15;
         int arcHeight = 15;
        
        Graphics2D g2 = (Graphics2D) graphics;
        g2.setColor(getBackground());
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), arcWidth, arcHeight);
        super.paintComponent(graphics);
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        text_panel = new javax.swing.JLabel();
        roundedPanel1 = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        icon_panel = new javax.swing.JLabel();
        count_panel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(209, 95));

        text_panel.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        text_panel.setForeground(new java.awt.Color(255, 255, 255));
        text_panel.setText("Employees");

        roundedPanel1.setBackground(new java.awt.Color(255, 255, 255));

        icon_panel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(icon_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        count_panel.setFont(new java.awt.Font("Arial Black", 1, 40)); // NOI18N
        count_panel.setForeground(new java.awt.Color(255, 255, 255));
        count_panel.setText("7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(count_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text_panel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(count_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel count_panel;
    private javax.swing.JLabel icon_panel;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel roundedPanel1;
    private javax.swing.JLabel text_panel;
    // End of variables declaration//GEN-END:variables
}
