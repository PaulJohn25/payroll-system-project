/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Paul
 */
public class ActionButton extends JButton {

    /**
     * @param buttonPressedColor the buttonPressedColor to set
     */
    public void setButtonPressedColor(Color buttonPressedColor) {
        this.pressedButtonColor = buttonPressedColor;
    }

    /**
     * @param defaultColor the defaultColor to set
     */
    public void setDefaultColor(Color defaultColor) {
        this.defaultButtonColor = defaultColor;
    }
    
    private boolean mousePress;
    private Color pressedButtonColor;
    private Color defaultButtonColor;
    
    public ActionButton() {
//        setPreferredSize(new Dimension(75, 37));
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(3, 3, 3, 3));
        addMouseListener(new MouseAdapter () {
            @Override
            public void mousePressed(MouseEvent e) {
                mousePress = true;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                mousePress = false;
            }
        });
    }
    
    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics2D g2 = (Graphics2D) graphics.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int width = getWidth();
        int height = getHeight();
//        int size = Math.min(width, height);
//        int x = (width-size) / 2;
//        int y = (height-size) / 2;
        
        if (mousePress) {
//            g2.setColor(new Color(2, 144, 204));
            g2.setColor(pressedButtonColor);
        } else {
//            g2.setColor(new Color(2,142,255));
            g2.setColor(defaultButtonColor);
        }
        
        g2.fillRoundRect(0, 0, width, height, 10, 10);
        
        g2.dispose();
        super.paintComponent(graphics);
        
    }
    
    
}
