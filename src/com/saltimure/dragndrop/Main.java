package com.saltimure.dragndrop;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        //create a top-level window
        JFrame frame = new JFrame("drag-and-drop");
        
        //prevent swing from resizing components
        frame.setLayout(null);
        frame.setSize(500,500);
        
        //make window in center on startup
        frame.setLocationRelativeTo(null);
        
        //exit from app by pressing close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Panel());
        frame.setVisible(true);
    }
}
