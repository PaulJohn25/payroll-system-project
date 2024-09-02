/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.payrollsystem.event;

/**
 *
 * @author Paul
 */
public interface TableEmployeeActionEvent {
    void onAddIncome(int row);
    void onAddDeduction(int row);
    void onRemoveEmployee(int row);
}
