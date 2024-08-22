/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem;

/**
 *
 * @author Paul
 */
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.List;
import java.util.stream.Collectors;

public class PaginatedTableExample {
    private static int currentPage = 1;
    private static final int ENTRIES_PER_PAGE = 5;
    private static List<Object[]> data;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Paginated JTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Sample data
        String[] columns = {"ID", "Name"};
        data = List.of(
                new Object[]{1, "John"},
                new Object[]{2, "Jane"},
                new Object[]{3, "Michael"},
                new Object[]{4, "Sara"},
                new Object[]{5, "Laura"},
                new Object[]{6, "Tom"},
                new Object[]{7, "Anna"},
                new Object[]{8, "Peter"},
                new Object[]{9, "Rachel"},
                new Object[]{10, "David"}
        );

        // Creating the table model
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], columns);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Buttons for pagination
        JButton nextButton = new JButton("Next");
        JButton prevButton = new JButton("Previous");

        // Add action listeners to buttons
        nextButton.addActionListener((ActionEvent e) -> showNextPage(model));
        prevButton.addActionListener((ActionEvent e) -> showPreviousPage(model));

        // Panel for buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);

        // Add components to the frame
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Show initial data
        updateTableModel(model);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    private static void showNextPage(DefaultTableModel model) {
        int totalPages = (int) Math.ceil((double) data.size() / ENTRIES_PER_PAGE);
        if (currentPage < totalPages) {
            currentPage++;
            updateTableModel(model);
        }
    }

    private static void showPreviousPage(DefaultTableModel model) {
        if (currentPage > 1) {
            currentPage--;
            updateTableModel(model);
        }
    }

    private static void updateTableModel(DefaultTableModel model) {
        int start = (currentPage - 1) * ENTRIES_PER_PAGE;
        List<Object[]> pageData = data.stream()
                .skip(start)
                .limit(ENTRIES_PER_PAGE)
                .collect(Collectors.toList());

        model.setRowCount(0); // Clear existing data
        pageData.forEach(model::addRow); // Add new data
    }
}

