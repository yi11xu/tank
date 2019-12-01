package com.lianxi.tank;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankMain {

    public static void main(String[] args) {
//        System.out.println("sss");
        Frame frame = new Frame();
        frame.setTitle("sss");
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(300,300);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
//        frame.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                System.exit(0);
//            }
//        });

    }

}
