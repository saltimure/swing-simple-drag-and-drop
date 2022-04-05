package com.saltimure.dragndrop;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
    
    //cursor x,y
    private int cursorX = 0;
    private int cursorY = 0;
    
    //component x,y
    private int currentComponentX = 0;
    private int currentComponentY = 0;
    
    public Panel() {
        this.setBackground(Color.BLACK);
        this.setSize(100, 100);
        this.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //calculate cursor x,y on mouse press
                cursorX = e.getXOnScreen();
                cursorY = e.getYOnScreen();
                
                //calculate component (this) x,y on mouse press
                currentComponentX = getX();
                currentComponentY = getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
        this.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                //calculate the difference between current cursor x,y and old cursor x,y
                int differenceX = e.getXOnScreen() - cursorX;
                int differenceY = e.getYOnScreen() - cursorY;
                //move component (jpanel) by this difference
                setLocation(currentComponentX + differenceX, currentComponentY + differenceY);
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                // TODO Auto-generated method stub
                
            }
            
        });
    }
}
