/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payrollsystem.swing;

import com.mycompany.payrollsystem.event.EventMenuSelected;
import com.mycompany.payrollsystem.model.MenuModel;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

/**
 *
 * @author Paul
 * @param <E>
 */
public class ListMenu<E extends Object> extends JList<E> {

    /**
     * @return the selectedIndex
     */
    public int getSelectedIndex() {
        return selectedIndex;
    }

    /**
     * @param selectedIndex the selectedIndex to set
     */
    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }
    
    private final DefaultListModel model;
    private int selectedIndex = -1;
    private int overIndex = -1;
    private EventMenuSelected event;
    
    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
    }
    
    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    int index = locationToIndex(e.getPoint());
                    Object obj = model.getElementAt(index);
                    
                    if (obj instanceof MenuModel) {
                        selectedIndex = index;
                        if (event != null) {
                            event.selected(index);
                        }
                    } 
                    
                    repaint();
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                overIndex = -1;
                repaint();
            }
           
        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                int index = locationToIndex(me.getPoint());
                
                if (index != overIndex) {
                    Object obj = model.getElementAt(index);
                    
                    if (obj instanceof MenuModel) {
                        overIndex = index;
                    } else {
                        overIndex = -1;
                    }
                    repaint();
                }
            } 
        });
        
    }
    
    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jList, Object o, int index, boolean selected, boolean  focus) {
                MenuItem menuItem = new MenuItem();
                menuItem.setItem(o);
                menuItem.setSelected(getSelectedIndex() == index);
                menuItem.setOver(overIndex == index);
                return menuItem;
            }
        };
    }
    
    public void addItem(MenuModel data) {
        model.addElement(data);
    }
    
}
