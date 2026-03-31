package GUI;

import javax.swing.*;
import java.awt.*;

public class ArrayPanel extends JPanel {
    int[] arr;
    int distance;
    int y;
    int heightScale;
    int width;
    int largestIndex;

    public void setArray(int[] arr){
        if (arr == null)
            throw new IllegalArgumentException("Array cannot be null");

        if (distance == 0){
            setDistance(80);
        }
        if (y == 0){
            setY(getHeight());
        }
        if (heightScale == 0){
            setHeightScale(10);
        }
        if (width == 0){
            setWidth(50);
        }

        this.arr = arr;

        largestIndex = findLargestIndex();
        setOpaque(true);
        setBackground(Color.DARK_GRAY.darker());
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (arr == null) return;

        for (int i = 0; i < arr.length; i++) {
            if (i == largestIndex){
                g.setColor(Color.ORANGE.darker());
            }
            else {
                g.setColor(Color.ORANGE);
            }
            g.fillRect(i * distance,getHeight() - heightScale * arr[i], width, heightScale * arr[i]);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(arr.length * distance - distance + width, heightScale * arr[largestIndex]);
    }

    public int findLargestIndex(){
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]){
                largest = arr[i];
            }
        }
        return largestIndex;
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
