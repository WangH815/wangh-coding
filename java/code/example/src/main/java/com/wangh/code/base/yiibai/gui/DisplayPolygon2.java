package com.wangh.code.base.yiibai.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DisplayPolygon2 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Polygon p = new Polygon();
        for (int i = 0; i < 5; i++)
            p.addPoint((int) (100.0 + 100 * Math.cos(i * 2 * Math.PI / 5)),
                    (int) (100.0 + 100 * Math.sin(i * 2 * Math.PI / 5)));

        g.drawPolygon(p);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(Color.YELLOW);
        frame.setTitle("使用GUI绘制多边形");
        frame.setSize(350, 250);
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        Container contentPane = frame.getContentPane();
        contentPane.add(new DisplayPolygon2());
        frame.show();
    }
}