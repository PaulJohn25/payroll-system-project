/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.payrollsystem;

import com.mycompany.payrollsystem.panel_forms.*;
import com.mycompany.payrollsystem.cell.TableEditActionEvent;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul
 */
public class Main extends javax.swing.JFrame {

    private final Util util = new Util(); 
    private final AddEmployee addEmployeeComponent;
    private final Employees employeesComponent;
    private final FileManagement fileManagementComponent;
    private final JButton addEmployeeButton;
    private static final String[] OPTIONS = {"Yes", "No"};
   
    
    /**
     * Creates new form Dashboard
     */
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        addEmployeeComponent = new AddEmployee();
        employeesComponent = new Employees();
        fileManagementComponent = new FileManagement();
        addEmployeeButton = employeesComponent.getAddEmployeeButton();
        util.fitImageToComponent(hide_panel, "images/hide_icon.png");
        util.fitImageToComponent(close_panel, "images/close.png");
        util.fitImageToComponent(menu_logo_label, "icons/menu.png");
        util.fitImageToComponent(intra_logo_label, "images/main_logo-removebg.png");
        Menu.getListMenu().setSelectedIndex(0);
        Menu.addEventMenuSelected((int index) -> {
            System.out.println("Selected Index: " + index);
            
            switch (index) {
                case 0 -> {
                    System.out.println("Dashboard Form");
                    setForm(new AdminDasboard());
                }
                case 1 -> {
                    System.out.println("Employee Form");
                    setForm(employeesComponent);
                    
                    addEmployeeButton.addActionListener(((e) -> {
                         System.out.println("Add employee is clicked!");
                         setForm(addEmployeeComponent);
                    }));
                  
                    
                    addEmployeeComponent.getCloseButtons().forEach(button -> {
                        button.addActionListener(e -> {
                            System.out.println("Close Button Is Clicked!");
                            showEmployeeComponent();
                        });
                    });
                    
                    TableEditActionEvent edit_employee_event = (int row) -> {
                        System.out.println("Edit Employee Index: " + row);
                        setForm(addEmployeeComponent);
                    };
                    
                    employeesComponent.setEditEmployeeInfoEvent(edit_employee_event);
                    
                    
                }
                case 2 -> {
                    System.out.println("File Management Form");
                    setForm(fileManagementComponent);
                }
                
                case 3 -> {
                    System.out.println("Payroll Management Form");
                    setForm(new PayrollMagement());
                }
                
                case 4 -> {
                    System.out.println("Other Income Management");
                    setForm(new OtherIncomeManagement());
                }
                case 5 -> {
                    System.out.println("Loan Management");
                    setForm(new LoanManagement());
                }
                case 6 -> {
                    System.out.println("Timekeeping Management");
                    setForm(new TimekeepingManagement());
                }
                case 7 -> {
                    System.out.println("Leave Management");
                    setForm(new LeaveManagement());
                }
                case 8 -> {
                    System.out.println("Schedule Management");
                    setForm(new ScheduleManagement());
                }
                case 9 -> {
                    System.out.println("Statutories");
                    setForm(new Statutories());
                }
                case 10 -> {
                    System.out.println("Report");
                    setForm(new Report());
                }
                case 11 -> {
                    System.out.println("User Management");
                    setForm(new UserManagement());
                }
                case 12 -> {
                    System.out.println("Permission Management");
                    setForm(new PermissionManagement());
                }
                case 13 -> {
                    System.out.println("System Management");
                    setForm(new SystemManagement());
                }
                case 14 -> {
                    System.out.println("Logout");
                    Login login = new Login();
                    login.setVisible(true);
                    this.dispose();
                }
               
                default -> {
                    System.out.println("Default Form");
                }
                
            }
        });
    }
    
    public void setForm(JComponent comp) {
        scrollPane.setViewportView(null); // Remove existing component from viewport
        scrollPane.setViewportView(comp);
        // Refresh the UI
        scrollPane.revalidate();
        scrollPane.repaint();
    }

    public void showEmployeeComponent() {

        int choice; // Default option (pre-selected button)
        choice = JOptionPane.showOptionDialog(this, // Parent component
                "Back to List without saving",
                "Close", // Title
                JOptionPane.DEFAULT_OPTION, // Option type (customized buttons)
                JOptionPane.PLAIN_MESSAGE, // Message type
                null, // Icon (null means no custom icon)
                OPTIONS, // Custom button labels
                null);

        if (choice == 0) {
            setForm(employeesComponent);
        } else {
            System.out.println("Form Close");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close_panel = new javax.swing.JLabel();
        hide_panel = new javax.swing.JLabel();
        menu_header_panel = new javax.swing.JPanel();
        menu_logo_label = new javax.swing.JLabel();
        Menu = new com.mycompany.payrollsystem.component.Menu();
        scrollPane = new javax.swing.JScrollPane();
        adminDasboard1 = new com.mycompany.payrollsystem.panel_forms.AdminDasboard();
        menu_header_panel1 = new javax.swing.JPanel();
        intra_logo_label = new javax.swing.JLabel();
        Menu1 = new com.mycompany.payrollsystem.component.Menu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(245, 247, 248));

        close_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_panelMouseClicked(evt);
            }
        });

        hide_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hide_panelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(hide_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(close_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(hide_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        menu_header_panel.setBackground(new java.awt.Color(203, 209, 238));

        menu_logo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu_logo_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout menu_header_panelLayout = new javax.swing.GroupLayout(menu_header_panel);
        menu_header_panel.setLayout(menu_header_panelLayout);
        menu_header_panelLayout.setHorizontalGroup(
            menu_header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_header_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_logo_label, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addContainerGap())
        );
        menu_header_panelLayout.setVerticalGroup(
            menu_header_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_header_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu_logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        scrollPane.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        scrollPane.setViewportView(adminDasboard1);

        menu_header_panel1.setBackground(new java.awt.Color(203, 209, 238));

        intra_logo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intra_logo_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout menu_header_panel1Layout = new javax.swing.GroupLayout(menu_header_panel1);
        menu_header_panel1.setLayout(menu_header_panel1Layout);
        menu_header_panel1Layout.setHorizontalGroup(
            menu_header_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu_header_panel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(intra_logo_label, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        menu_header_panel1Layout.setVerticalGroup(
            menu_header_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu_header_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intra_logo_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menu_header_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(menu_header_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(menu_header_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_header_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menu1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hide_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_panelMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_hide_panelMouseClicked

    private void close_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_panelMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_close_panelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.payrollsystem.component.Menu Menu;
    private com.mycompany.payrollsystem.component.Menu Menu1;
    private com.mycompany.payrollsystem.panel_forms.AdminDasboard adminDasboard1;
    private javax.swing.JLabel close_panel;
    private javax.swing.JLabel hide_panel;
    private javax.swing.JLabel intra_logo_label;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menu_header_panel;
    private javax.swing.JPanel menu_header_panel1;
    private javax.swing.JLabel menu_logo_label;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
