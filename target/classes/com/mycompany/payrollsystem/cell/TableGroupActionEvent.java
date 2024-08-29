/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.payrollsystem.cell;

/**
 *
 * @author Paul
 */
public interface TableGroupActionEvent extends TableEditActionEvent {
    void onAddEmployee(int row);
    void onProcessTimecard(int row);
    void onProcessPayroll(int row);
    void onPostForApproval(int row);
    void onPayrollReport(int row);
}
