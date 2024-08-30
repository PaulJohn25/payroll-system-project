/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultCellEditor;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JTable;

/**
 *
 * @author Paul
 * @param <T>
 */
public class TableActionCellEditor<T extends JComponent, E> extends DefaultCellEditor {
    
    private final T actionComponent;
    private final E event;
    
    public TableActionCellEditor(T actionComponent, E event) {
        super(new JCheckBox());
        this.actionComponent = actionComponent;
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        
        Color tableSelectionBackground = table.getSelectionBackground();
        
        if (actionComponent instanceof PanelEditAction panelEditAction) {
            panelEditAction.initEvent((TableEditActionEvent) event, row);
            panelEditAction.setBackground(tableSelectionBackground);
        } else if (actionComponent instanceof PanelGroupAction panelGroupAction) {
            panelGroupAction.initEvent((TableGroupActionEvent) event, row);
            panelGroupAction.setBackground(tableSelectionBackground);
        } else if (actionComponent instanceof PanelRemoveAction panelRemoveAction) {
            panelRemoveAction.initEvent((TableRemoveActionEvent) event, row);
            panelRemoveAction.setBackground(tableSelectionBackground);
        } else if (actionComponent instanceof PanelActionButtons panelActionButtons) {
            panelActionButtons.initEvent((TableEmployeeActionEvent) event, row);
            panelActionButtons.setBackground(tableSelectionBackground);
        }
        
        return actionComponent;
        
    }
}
