package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        double shX = 100;
        double shY = 50;
        double shX2 = 200;
        double shY2 = 150;

        for (double x = -50.0; x < 50.0; x += 0.01) {
            g2.draw(
                    new Line2D.Double(
                        x +shX,
                        DrawFrame.DEFAULT_HEIGHT -(Math.pow(x, 2)+shY),
                        x +1+shX,
                        DrawFrame.DEFAULT_HEIGHT -(Math.pow(x, 2)+shY)
                    )
            );
        }
        for (double x = -50.0; x < 50.0; x += 0.01) {
            g2.draw(
                    new Line2D.Double(
                            x +shX2,
                            DrawFrame.DEFAULT_HEIGHT -(Math.pow(x, 3)+shY2),
                            x +1+shX2,
                            DrawFrame.DEFAULT_HEIGHT -(Math.pow(x, 3)+shY2)
                    )
            );
        }
    }
}
