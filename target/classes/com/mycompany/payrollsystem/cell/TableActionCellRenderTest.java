/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagLayout;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JTable;
import org.jdesktop.swingx.renderer.DefaultTableRenderer;

/**
 *
 * @author Paul
 */
public class TableActionCellRenderTest<T extends Component> extends DefaultTableRenderer {
    
    private final T component;
    
    public TableActionCellRenderTest(T component) {
        this.component = component;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component comp = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        
        JPanel cellPanel = new JPanel(new GridBagLayout());
        cellPanel.setOpaque(true);
        
        T cellComponent = component;
        
        if (!isSelected && row % 2 == 0) {
            cellPanel.setBackground(Color.WHITE);
            cellComponent.setBackground(Color.WHITE);
        } else {
            cellPanel.setBackground(comp.getBackground());
            cellComponent.setBackground(comp.getBackground());
        }
        
        cellPanel.add(cellComponent);
        
        return cellPanel;
    }
    
    
    
    
}
