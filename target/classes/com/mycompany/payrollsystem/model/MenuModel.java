/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.model;

import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Paul
 */
public class MenuModel {

    /**
     * @return the iconPath
     */
//    public String getIconPath() {
//        return "icons/" + iconPath + ".png";
//    }

    /**
     * @param iconPath the iconPath to set
     */
    public void setIconPath(String iconPath) {
        this.icon = iconPath;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    public Icon toIcon(int width, int height) {
        URL imgUrl = getClass().getResource("/com/mycompany/payrollsystem/icons/" + icon + ".png");
        if (imgUrl != null) {
            
            // Load the original image
            ImageIcon originalIcon = new ImageIcon(imgUrl);
            Image originalImage = originalIcon.getImage();
            
            Image resizeIcon = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            
            return new ImageIcon(resizeIcon);
        } else {
            // Handle the null case, perhaps with a default icon or by logging an error
            System.err.println("Icon not found: icons/" + icon + ".png");
            return null; // or return a default icon
        }
    }

    public MenuModel(String icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    private String icon;
    private String name;

}
