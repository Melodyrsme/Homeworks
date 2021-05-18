package com.company;

import javax.swing.*;

public class DrawFrame extends JFrame {
    public DrawFrame()
    {
        setTitle("y = x^2 и y = x^3");
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        add(new DrawPanel());
    }

    public static final int DEFAULT_WIDTH = 500;
    public static final int DEFAULT_HEIGHT = 500;
}
