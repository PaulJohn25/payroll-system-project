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
public class CardModel {

    /**
     * @return the cardText
     */
    public String getCardText() {
        return cardText;
    }

    /**
     * @param cardText the cardText to set
     */
    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    /**
     * @return the count
     */
    public Integer getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * @return the icon
     */
//    public String getIcon() {
//        return icon;
//    }

    /**
     * @param icon the icon to set
     */
//    public void setIcon(String icon) {
//        this.icon = icon;
//    }
    
    private String cardText;
    private Integer count;
//    private String icon;
   
    public CardModel() {}
    
    public CardModel(String cardText, Integer count) {
        this.cardText = cardText;
        this.count = count;
//        this.icon = icon;
    }
    
//     public Icon toIcon(int width, int height) {
//        URL imgUrl = getClass().getResource("/com/mycompany/payrollsystem/icons/" + getIcon() + ".png");
//        if (imgUrl != null) {
//            
//            // Load the original image
//            ImageIcon originalIcon = new ImageIcon(imgUrl);
//            Image originalImage = originalIcon.getImage();
//            
//            Image resizeIcon = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
//            
//            return new ImageIcon(resizeIcon);
//        } else {
//            // Handle the null case, perhaps with a default icon or by logging an error
//            System.err.println("Icon not found: icons/" + getIcon() + ".png");
//            return null; // or return a default icon
//        }
//    }
    
}
