import GUI.ArrayPanel;
import GUI.Gui;
import Sorting.InstertionSort;

import java.util.Arrays;

public class Main {
    static void main() {
        int[] arr = new int[] {1, 2, 5, 4, 6, 7, 3, 8, 10, 9};

        Gui gui = new Gui("Window", 1280, 720, arr);
        gui.show();

    }
}
