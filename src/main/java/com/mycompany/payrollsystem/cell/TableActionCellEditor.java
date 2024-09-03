/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

import com.mycompany.payrollsystem.event.LoanManagementActionEvent;
import com.mycompany.payrollsystem.event.OtherIncomeManagementActionEvent;
import com.mycompany.payrollsystem.event.TableDownloadActionEvent;
import com.mycompany.payrollsystem.event.TableRemoveActionEvent;
import com.mycompany.payrollsystem.event.TableEmployeeActionEvent;
import com.mycompany.payrollsystem.event.TableEditActionEvent;
import com.mycompany.payrollsystem.event.TableGroupActionEvent;
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

    private final Class<T> actionComponentClass;
    private final E event;

    public TableActionCellEditor(Class<T> actionComponentClass, E event) {
        super(new JCheckBox());
        this.actionComponentClass = actionComponentClass;
        this.event = event;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        T actionComponent = null;

        try {
            // Create a new instance of the action component
            actionComponent = actionComponentClass.getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        if (actionComponent != null) {
            Color tableSelectionBackground = table.getSelectionBackground();

            switch (actionComponent) {
                case PanelEditAction panelEditAction -> {
                    panelEditAction.initEvent((TableEditActionEvent) event, row);
                    panelEditAction.setBackground(tableSelectionBackground);
                }
                case PayrollManagementPanelAction panelGroupAction -> {
                    panelGroupAction.initEvent((TableGroupActionEvent) event, row);
                    panelGroupAction.setBackground(tableSelectionBackground);
                }
                case PanelRemoveAction panelRemoveAction -> {
                    panelRemoveAction.initEvent((TableRemoveActionEvent) event, row);
                    panelRemoveAction.setBackground(tableSelectionBackground);
                }
                case PanelActionButtons panelActionButtons -> {
                    panelActionButtons.initEvent((TableEmployeeActionEvent) event, row);
                    panelActionButtons.setBackground(tableSelectionBackground);
                }
                case PanelDownloadAction panelDownloadAction -> {
                    panelDownloadAction.initEvent((TableDownloadActionEvent) event, row);
                    panelDownloadAction.setBackground(tableSelectionBackground);
                }
                case LoanManagementPanelAction loanManagementPanelAction -> {
                    loanManagementPanelAction.initEvent((LoanManagementActionEvent) event, row);
                    loanManagementPanelAction.setBackground(tableSelectionBackground);
                }
                case OtherIncomeManagementPanelAction otherIncomeManagementPanelAction -> {
                    otherIncomeManagementPanelAction.initEvent((OtherIncomeManagementActionEvent) event, row);
                    otherIncomeManagementPanelAction.setBackground(tableSelectionBackground);
                }
                case UserManagementPanelAction userManagementPanelAction -> {
                    userManagementPanelAction.initEvent((TableEditActionEvent) event, row);
                    userManagementPanelAction.setBackground(tableSelectionBackground);
                }
                default -> {
                }
            }

            return actionComponent;
        }

        return super.getTableCellEditorComponent(table, value, isSelected, row, column);
    }
}

