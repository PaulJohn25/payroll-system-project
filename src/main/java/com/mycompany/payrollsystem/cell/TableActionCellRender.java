/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Paul
 */
public class TableActionCellRender extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        JPanel cellPanel = new JPanel(new GridBagLayout());
        cellPanel.setOpaque(true);
        
        PanelAction action = new PanelAction();
        
        if (!isSelected && row % 2 == 0) {
            action.setBackground(Color.WHITE);
            cellPanel.setBackground(Color.WHITE);
        } else {
            action.setBackground(component.getBackground());
            cellPanel.setBackground(component.getBackground());
        }
            
        cellPanel.add(action);
        
        return cellPanel;
    }
    
}
