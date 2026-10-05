package liveCoding;

import javax.swing.*;

public class myViewer {
    private JFrame myFrame;
    private myComponent myComponent;

    public myViewer() {
        this.myFrame = new JFrame();
        this.myComponent = new myComponent();

    }

    private void runApp() {
        int width = 800;
        int height = 600;
        int x = 50;
        int y = 100;
        this.myFrame.setSize(width, height);
        this.myFrame.setLocation(x, y);
        this.myFrame.setTitle("Big Upset Win for the Gators!!!");
        this.myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.myFrame.add(this.myComponent);
        this.myFrame.setVisible(true);
    }

    public static void main(String[] args) {
        myViewer app = new myViewer();
        app.runApp();
    }


}




