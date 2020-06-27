package com.wangh.base.yiibai.gui;

import javax.swing.*;
import java.awt.*;

public class DrawTextUsingGUI2 extends JPanel {
    public void paint(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Font font = new Font("Serif", Font.PLAIN, 56);
        g.setFont(font);
        g.drawString("Yiibai.com", 40, 120);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().add(new DrawTextUsingGUI2());
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
