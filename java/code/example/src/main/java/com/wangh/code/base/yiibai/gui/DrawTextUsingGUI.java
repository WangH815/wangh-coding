package com.wangh.code.base.yiibai.gui;

import javax.swing.*;
import java.awt.*;

public class DrawTextUsingGUI extends JPanel {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Font font = new Font("Serif", Font.PLAIN, 36);
        g2.setFont(font);
        g2.drawString("This a Text", 40, 120);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.getContentPane().add(new DrawTextUsingGUI());
        f.setSize(300, 200);
        f.setVisible(true);
    }
}
