/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.payrollsystem.panel_forms;

import com.mycompany.payrollsystem.cell.PanelStatus;
import com.mycompany.payrollsystem.cell.PanelStatusRegular;
import com.mycompany.payrollsystem.cell.TableCellRender;
import com.mycompany.payrollsystem.cell.OtherIncomeManagementPanelAction;
import com.mycompany.payrollsystem.cell.TableActionCellEditor;
import com.mycompany.payrollsystem.event.OtherIncomeManagementActionEvent;
import com.mycompany.payrollsystem.modals.OtherIncomeLibraryDetailsModal;
import java.awt.Font;
import javax.swing.table.JTableHeader;
import java.awt.Dimension;

/**
 *
 * @author Paul
 */
public class OtherIncomeManagement extends javax.swing.JPanel {

    /**
     * Creates new form Dashboard
     */
    private final Font headerFont;
    private final JTableHeader other_income_management_table_header;
    
    public OtherIncomeManagement() {
        this.headerFont = new Font("Arial", Font.BOLD, 20);
        initComponents();
        setOpaque(false);
        
        other_income_management_table_header = other_income_management_table.getTableHeader();
        other_income_management_table_header.setFont(headerFont);
        
        PanelStatusRegular panelStatusRegular = new PanelStatusRegular();
        panelStatusRegular.setStatus("Regular");
        
        TableCellRender tableStatusRegularCellRender = new TableCellRender(panelStatusRegular);
        other_income_management_table.getColumnModel().getColumn(2).setCellRenderer(tableStatusRegularCellRender);
        
        PanelStatus panelStatus = new PanelStatus();
        panelStatus.setStatus("Active");
       
        TableCellRender tableStatusCellRender = new TableCellRender(panelStatus);
        other_income_management_table.getColumnModel().getColumn(4).setCellRenderer(tableStatusCellRender);
        
        TableCellRender tableActionCellRender = new TableCellRender(new OtherIncomeManagementPanelAction());
        other_income_management_table.getColumnModel().getColumn(5).setCellRenderer(tableActionCellRender);
        
        other_income_management_table.getColumnModel().getColumn(5).sizeWidthToFit();
        
        OtherIncomeManagementActionEvent event = new OtherIncomeManagementActionEvent() {
            @Override
            public void onAddAndEditEmployee(int row) {
                System.out.println("Add/Edit Employee row: " + row);
            }
            
            @Override
            public void onEdit(int row) {
                System.out.println("Edit row: " + row);
                OtherIncomeLibraryDetailsModal otherIncomeLibraryDetailsModal = new OtherIncomeLibraryDetailsModal();
                otherIncomeLibraryDetailsModal.setVisible(true);
            }
        };
        
        other_income_management_table.getColumnModel().getColumn(5).setCellEditor(new TableActionCellEditor<>(OtherIncomeManagementPanelAction.class, event));
        other_income_management_table.getColumnModel().getColumn(5).setPreferredWidth(150);
        
        setPreferredSize(new Dimension(900, 1130));
        init();
    }
    
    private void init() {
        
        breadcrumb.setupBreadcrumb("Other Income Management");
        
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this
     * code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        breadcrumb = new com.mycompany.payrollsystem.component.Breadcrumb();
        topLeftAndTopRightRoundedCornersPanel1 = new com.mycompany.payrollsystem.swing.TopLeftAndTopRightRoundedCornersPanel();
        card_header_name = new javax.swing.JLabel();
        department_panel1 = new javax.swing.JPanel();
        roundedCornersPanel8 = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        jLabel15 = new javax.swing.JLabel();
        CreateOtherIncomeLibaryButton = new javax.swing.JButton();
        roundedCornersPanel9 = new com.mycompany.payrollsystem.swing.RoundedCornersPanel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        other_income_management_table = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(900, 935));

        topLeftAndTopRightRoundedCornersPanel1.setBackground(new java.awt.Color(47, 71, 186));

        card_header_name.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        card_header_name.setForeground(new java.awt.Color(255, 255, 255));
        card_header_name.setText("Other Income Management");

        javax.swing.GroupLayout topLeftAndTopRightRoundedCornersPanel1Layout = new javax.swing.GroupLayout(topLeftAndTopRightRoundedCornersPanel1);
        topLeftAndTopRightRoundedCornersPanel1.setLayout(topLeftAndTopRightRoundedCornersPanel1Layout);
        topLeftAndTopRightRoundedCornersPanel1Layout.setHorizontalGroup(
            topLeftAndTopRightRoundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topLeftAndTopRightRoundedCornersPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(card_header_name, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topLeftAndTopRightRoundedCornersPanel1Layout.setVerticalGroup(
            topLeftAndTopRightRoundedCornersPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topLeftAndTopRightRoundedCornersPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(card_header_name, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        department_panel1.setBackground(new java.awt.Color(255, 255, 255));

        roundedCornersPanel8.setBackground(new java.awt.Color(245, 247, 248));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel15.setText("5 Other Incomes(s)");

        javax.swing.GroupLayout roundedCornersPanel8Layout = new javax.swing.GroupLayout(roundedCornersPanel8);
        roundedCornersPanel8.setLayout(roundedCornersPanel8Layout);
        roundedCornersPanel8Layout.setHorizontalGroup(
            roundedCornersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        roundedCornersPanel8Layout.setVerticalGroup(
            roundedCornersPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedCornersPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        CreateOtherIncomeLibaryButton.setBackground(new java.awt.Color(0, 102, 0));
        CreateOtherIncomeLibaryButton.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        CreateOtherIncomeLibaryButton.setForeground(new java.awt.Color(255, 255, 255));
        CreateOtherIncomeLibaryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/payrollsystem/icons/add_icon_button.png"))); // NOI18N
        CreateOtherIncomeLibaryButton.setText("Create Other Income Library");
        CreateOtherIncomeLibaryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateOtherIncomeLibaryButtonActionPerformed(evt);
            }
        });

        roundedCornersPanel9.setBackground(new java.awt.Color(245, 247, 248));

        jLabel25.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("Show");

        jComboBox4.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "25", "50", "100" }));

        jLabel26.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("entries");

        jLabel27.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("Search:");

        jTextField4.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("Showing 1 to 9 of 9 entries");

        jLabel29.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("Previous");

        jLabel30.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("1");
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel38.setFont(new java.awt.Font("Arial", 0, 17)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(51, 51, 51));
        jLabel38.setText("Next");

        other_income_management_table.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        other_income_management_table.setForeground(new java.awt.Color(51, 51, 51));
        other_income_management_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Code", "Name", "Regular", "Tax Type", "Status", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        other_income_management_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        other_income_management_table.setRowHeight(60);
        other_income_management_table.setSelectionBackground(new java.awt.Color(204, 204, 204));
        other_income_management_table.setShowGrid(true);
        jScrollPane1.setViewportView(other_income_management_table);

        javax.swing.GroupLayout roundedCornersPanel9Layout = new javax.swing.GroupLayout(roundedCornersPanel9);
        roundedCornersPanel9.setLayout(roundedCornersPanel9Layout);
        roundedCornersPanel9Layout.setHorizontalGroup(
            roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 393, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(roundedCornersPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel38)
                .addGap(21, 21, 21))
            .addGroup(roundedCornersPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        roundedCornersPanel9Layout.setVerticalGroup(
            roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedCornersPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedCornersPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout department_panel1Layout = new javax.swing.GroupLayout(department_panel1);
        department_panel1.setLayout(department_panel1Layout);
        department_panel1Layout.setHorizontalGroup(
            department_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(department_panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(department_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(roundedCornersPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(department_panel1Layout.createSequentialGroup()
                        .addGroup(department_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roundedCornersPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CreateOtherIncomeLibaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        department_panel1Layout.setVerticalGroup(
            department_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(department_panel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(roundedCornersPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CreateOtherIncomeLibaryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(roundedCornersPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breadcrumb, javax.swing.GroupLayout.DEFAULT_SIZE, 876, Short.MAX_VALUE)
                    .addComponent(topLeftAndTopRightRoundedCornersPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(department_panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(breadcrumb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(topLeftAndTopRightRoundedCornersPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(department_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CreateOtherIncomeLibaryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateOtherIncomeLibaryButtonActionPerformed
        // TODO add your handling code here:
        OtherIncomeLibraryDetailsModal otherIncomeLibraryDetailsModal = new OtherIncomeLibraryDetailsModal();
        otherIncomeLibraryDetailsModal.setVisible(true);
    }//GEN-LAST:event_CreateOtherIncomeLibaryButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateOtherIncomeLibaryButton;
    private com.mycompany.payrollsystem.component.Breadcrumb breadcrumb;
    private javax.swing.JLabel card_header_name;
    private javax.swing.JPanel department_panel1;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable other_income_management_table;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel roundedCornersPanel8;
    private com.mycompany.payrollsystem.swing.RoundedCornersPanel roundedCornersPanel9;
    private com.mycompany.payrollsystem.swing.TopLeftAndTopRightRoundedCornersPanel topLeftAndTopRightRoundedCornersPanel1;
    // End of variables declaration//GEN-END:variables
}
