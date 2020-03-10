package com.mirea.lab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;

class Animages {

    public static void main(String[] args) throws Exception {
        final Image[] frames = {
                ImageIO.read(new File("src/com/mirea/lab/1.png")),
                ImageIO.read(new File("src/com/mirea/lab/2.png")),
                ImageIO.read(new File("src/com/mirea/lab/3.png")),
                ImageIO.read(new File("src/com/mirea/lab/4.png"))
        };
        Runnable r = new Runnable() {

            @Override
            public void run() {
                JPanel gui = new JPanel(new BorderLayout());


                final JLabel animation = new JLabel(new ImageIcon(frames[0]));
                gui.add(animation, BorderLayout.CENTER);

                ActionListener animate = new ActionListener() {

                    private int index = 0;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (index<frames.length-1) {
                            index++;
                        } else {
                            index = 0;
                        }
                        animation.setIcon(new ImageIcon(frames[index]));
                    }
                };
                final Timer timer = new Timer(200,animate);

                final JToggleButton b = new JToggleButton("Start/Stop");
                ActionListener startStop = new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (b.isSelected()) {
                            timer.start();
                        } else {
                            timer.stop();
                        }
                    }
                };
                b.addActionListener(startStop);
                gui.add(b, BorderLayout.SOUTH);

                JOptionPane.showMessageDialog(null, gui ,"AnImAtIoN", JOptionPane.PLAIN_MESSAGE);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}


