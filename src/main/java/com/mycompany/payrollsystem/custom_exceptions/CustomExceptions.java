/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.custom_exceptions;

/**
 *
 * @author Paul
 */
public class CustomExceptions { 
    
    public static class IncorrectPasswordException extends Exception {
        public IncorrectPasswordException(String exceptioMessage) {
            super(exceptioMessage);
        }
    }
    
    public static class UserNotFoundException extends Exception {
        public UserNotFoundException(String exceptionMessage) {
            super(exceptionMessage);
        }
    }
    
}
