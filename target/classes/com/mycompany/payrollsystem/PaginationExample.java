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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginationExample extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public PaginationExample() {
        setTitle("Pagination Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        // Initialize CardLayout and the panel to hold cards
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        // Create different panels (pages)
        JPanel page1 = new JPanel();
        page1.add(new JLabel("Page 1"));
        page1.setBackground(Color.RED);

        JPanel page2 = new JPanel();
        page2.add(new JLabel("Page 2"));
        page2.setBackground(Color.GREEN);

        JPanel page3 = new JPanel();
        page3.add(new JLabel("Page 3"));
        page3.setBackground(Color.BLUE);

        // Add pages to the cardPanel
        cardPanel.add(page1, "Page 1");
        cardPanel.add(page2, "Page 2");
        cardPanel.add(page3, "Page 3");

        // Control buttons for pagination
        JButton btnNext = new JButton("Next");
        JButton btnPrevious = new JButton("Previous");

        btnNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel); // Show next page
            }
        });

        btnPrevious.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.previous(cardPanel); // Show previous page
            }
        });

        // Add the cardPanel and buttons to the JFrame
        add(cardPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnPrevious);
        buttonPanel.add(btnNext);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PaginationExample().setVisible(true);
            }
        });
    }
}

