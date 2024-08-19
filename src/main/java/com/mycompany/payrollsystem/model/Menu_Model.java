/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.model;

import com.mycompany.payrollsystem.Util;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Paul
 */
public class Menu_Model {

    /**
     * @return the icon
     */
    public String getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(String icon) {
        this.icon = icon;
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
    
    public Menu_Model() {}
    
    public Icon toIcon() {
        return new ImageIcon(getClass().getResource("icons/" + icon + ".png"));
    }
    
    private String icon;
    private String name;
    private Util util = new Util();
    
    
}
