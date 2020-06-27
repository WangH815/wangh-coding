package com.wangh.base.yiibai.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class CreateTransparentCursor2 {
    public static void main(String[] argv) throws Exception {
        JFrame frame = new JFrame();
        frame.setCursor(frame.getToolkit().createCustomCursor(new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB),
                new Point(0, 0), "null"));
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
