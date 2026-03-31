package GUI;

import javax.swing.*;
import java.awt.*;

public class ArrayPanel extends JPanel {
    int[] arr;
    int distance;
    int y;
    int heightScale;
    int width;

    public void setArray(int[] arr){
        if (arr == null)
            throw new IllegalArgumentException("Array cannot be null");

        if (distance == 0){
            setDistance(80);
        }
        if (y == 0){
            setY(300);
        }
        if (heightScale == 0){
            setHeightScale(10);
        }
        if (width == 0){
            setWidth(50);
        }

        this.arr = arr;
        setOpaque(false);
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.YELLOW);

        if (arr == null) return;

        for (int i = 0; i < arr.length; i++) {
            g.fillRect(i * distance,y - heightScale * arr[i], width, heightScale * arr[i]);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(arr.length * width + (arr.length * distance - width), 500);
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setHeightScale(int heightScale) {
        this.heightScale = heightScale;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setY(int y) {
        this.y = y;
    }
}
