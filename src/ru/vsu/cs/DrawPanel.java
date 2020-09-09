package ru.vsu.cs;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        gr.drawLine(10, 10, 310, 40);
        gr.drawRect(400, 10, 100, 60);
        gr.setColor(Color.pink);
        gr.fillRect(600, 10, 100, 60);
        drawSun(gr, 400, 300, 80, 200, 30, new Color(255, 187, 00));
    }

    public static void drawSun(Graphics g, int x, int y, int r1, int r2, int n, Color color) {
        g.setColor(color);
        g.fillOval(x - r1, y - r1, 2 * r1, 2 * r1);
        double an = 2 * Math.PI / n;
        double dx1;
        double dy1;
        double dx2;
        double dy2;

        for (int i = 0; i < n; i++) {
            dx1 = r1 * Math.cos(an * i);
            dy1 = r1 * Math.sin(an * i);
            dx2 = r2 * Math.cos(an * i);
            dy2 = r2 * Math.sin(an * i);
            g.drawLine((int) dx1 + x, (int) dy1 + y, (int) dx2 + x, (int) dy2 + y);
        }
    }
}
