package com.wangh.base.yiibai.gui;

import javax.swing.*;
import java.awt.*;

class Part2 {
    double value;
    Color color;

    public Part2(double value, Color color) {
        this.value = value;
        this.color = color;
    }
}

class MyComponent3 extends JComponent {
    Part2[] slices = {new Part2(15, Color.yellow), new Part2(30, Color.white), new Part2(25, Color.blue),
            new Part2(30, Color.red)};

    MyComponent3() {
    }

    public void paint(Graphics g) {
        drawPie((Graphics2D) g, getBounds(), slices);
    }

    void drawPie(Graphics2D g, Rectangle area, Part2[] slices) {
        double total = 0.0D;
        for (int i = 0; i < slices.length; i++) {
            total += slices[i].value;
        }
        double curValue = 0.0D;
        int startAngle = 0;
        for (int i = 0; i < slices.length; i++) {
            startAngle = (int) (curValue * 360 / total);
            int arcAngle = (int) (slices[i].value * 360 / total);

            g.setColor(slices[i].color);
            g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);
            curValue += slices[i].value;
        }
    }
}

public class DisplayPieChart2 {
    public static void main(String[] argv) {
        JFrame frame = new JFrame();
        frame.getContentPane().add(new MyComponent3());
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
