package GUI;

import javax.swing.*;
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Gui {

    JFrame frame;
    JPanel panel;
    JLabel arrayLabel;
    int[] arr;

    public Gui(String title, int width, int height){
        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);

        panel = new JPanel();
        panel.setOpaque(true);
        panel.setBackground(Color.DARK_GRAY);

        frame.add(panel);
    }

    public Gui(String title, int width, int height, int[] arr){
        this.arr = arr;

        frame = new JFrame(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width, height);

        panel = new JPanel();
        panel.setOpaque(true);
        panel.setBackground(Color.DARK_GRAY);

        JLabel arrayLabel = new JLabel(Arrays.toString(arr));
        arrayLabel.setForeground(Color.WHITE);
        arrayLabel.setFont(new Font("Arial", Font.PLAIN, 30));


        JPanel midPanel = new JPanel();
        midPanel.setOpaque(true);
        midPanel.setBackground(Color.DARK_GRAY.darker());

        ArrayPanel arrayPanel = new ArrayPanel();
        arrayPanel.setArray(arr);

        panel.add(arrayLabel);
        midPanel.add(arrayPanel);
        frame.add(panel, BorderLayout.PAGE_START);
        frame.add(midPanel, BorderLayout.CENTER);
    }

    public void show(){
        frame.setVisible(true);
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JPanel getPanel() {
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
