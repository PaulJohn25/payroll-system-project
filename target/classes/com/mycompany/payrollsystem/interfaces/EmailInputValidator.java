/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.payrollsystem.interfaces;

import javax.swing.JLabel;

/**
 *
 * @author Paul
 */
public interface EmailInputValidator {
    boolean validateEmailInput(String input, JLabel error_label);
}
