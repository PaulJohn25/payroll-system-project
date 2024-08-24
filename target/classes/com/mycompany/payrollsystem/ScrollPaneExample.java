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
import java.awt.*;

public class ScrollPaneExample {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ScrollPane Dynamic Replacement Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);

            // Initial panel to be displayed in the scroll pane
            JPanel initialPanel = new JPanel();
            initialPanel.setBackground(Color.LIGHT_GRAY);
            initialPanel.add(new JLabel("Initial Panel"));

            // Scroll pane with initial panel
            JScrollPane scrollPane = new JScrollPane(initialPanel);

            // Button to replace the panel inside scroll pane
            JButton replaceButton = new JButton("Replace Panel");
            replaceButton.addActionListener(e -> {
                // Create a new panel to replace the old one
                JPanel newPanel = new JPanel();
                newPanel.setBackground(Color.CYAN);
                newPanel.add(new JLabel("New Panel"));

                // Replace the viewport's view with the new panel
                scrollPane.setViewportView(newPanel);

                // Refresh the scroll pane to update the UI
                scrollPane.revalidate();
                scrollPane.repaint();
            });

            // Adding components to the frame
            frame.setLayout(new BorderLayout());
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(replaceButton, BorderLayout.SOUTH);

            frame.setVisible(true);
        });
    }
}

