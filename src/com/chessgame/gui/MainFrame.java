//Java Swing GUI for Chess Game

package com.chessgame.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Java Chess Game");
        setSize(800, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(new JLabel("Chess Game UI Placeholder", SwingConstants.CENTER), BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}
