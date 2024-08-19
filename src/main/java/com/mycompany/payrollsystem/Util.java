/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem;

import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Paul
 */
public class Util {

    private static final Logger LOGGER = Logger.getLogger(Util.class.getName());

    static {
        try {
            // Set up file handler 
            FileHandler fileHandler = new FileHandler("app.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
            LOGGER.setLevel(Level.ALL);
        } catch (IOException exception) {
            LOGGER.log(Level.SEVERE, "Failed to set up logger handler");
        }
    }

    public void fitImageToComponent(JComponent component, String imagePathString) {

        // Load image
        URL imgUrl = getClass().getResource(imagePathString);

        if (imgUrl != null) { // Checks if image file exist on the resources

            try {

                ImageIcon orginalIcon = new ImageIcon(imgUrl);
                Image orginalImage = orginalIcon.getImage();

                // Get component dimensions
                int width = component.getWidth();
                int height = component.getHeight();

                // Resize image
                Image resizeImage = orginalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                ImageIcon resizeIcon = new ImageIcon(resizeImage);

                if (component instanceof JLabel) {
                    ((JLabel) component).setIcon(resizeIcon);
                } else if (component instanceof JButton) {
                    ((JButton) component).setIcon(resizeIcon);
                } else {
                    LOGGER.warning("Unsupported component: " + component.getClass().getName());
                }

            } catch (Exception e) {
                LOGGER.log(Level.SEVERE, "Error resizing image", e);
            }

        } else {
            LOGGER.warning("Image not found: " + imagePathString);
        }
    }
    
    public void setLeftAndRightBorder(JLabel label, Color color) {
        Border bottom_border = BorderFactory.createMatteBorder(0, 4, 0, 4, color);
        label.setBorder(bottom_border);
    }
    
    public void setLeftBorder(JLabel label, Color color) {
        Border left_border = BorderFactory.createMatteBorder(0, 4, 0, 0, color);
        label.setBorder(left_border);
    }
 
    
}
