package com.example.myapp;
import java.awt.*;
import javax.swing.*;

public class MyApp<JFrame> {
    private JFrame mainFrame;
    public static void main(String[] args){
        MyApp demo = new MyApp();
        demo.Show();
    }
    private void Show(){
        mainFrame = new JFrame("Java SWING Examples");
        mainFrame.setSize(400,400);
        mainFrame.setVisible(true);
    }
}
