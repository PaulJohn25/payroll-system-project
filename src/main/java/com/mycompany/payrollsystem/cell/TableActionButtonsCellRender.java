/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Paul
 */
public class TableActionButtonsCellRender extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component =  super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 
        
        JPanel cellPanel = new JPanel(new GridBagLayout());
        cellPanel.setOpaque(true);
        
        PanelActionButtons panelActionButtons = new PanelActionButtons();
        
        if (!isSelected && row % 2 == 0) {
            cellPanel.setBackground(Color.WHITE);
            panelActionButtons.setBackground(Color.WHITE);
        } else {
            cellPanel.setBackground(component.getBackground());
            panelActionButtons.setBackground(component.getBackground());
        }
        
        cellPanel.add(panelActionButtons);
        
        return cellPanel;
    }
    
    
        
}
