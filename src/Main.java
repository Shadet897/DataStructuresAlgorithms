import GUI.Gui;

void main() {
    int[] arr = new int[]{18, 2, 5, 4, 6, 7, 3, 8, 10, 9};

    Gui gui = new Gui("Window", 1280, 720, arr);
    gui.show();
}
