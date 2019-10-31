package com.mel;

import processing.core.PApplet;

public class ProcessingMain extends PApplet{

    public void settings(){
        size(500, 500);
    }

    public void draw(){
        background(0);
        ellipse(mouseX, mouseY, 40, 40);
    }

    public static void main(String... args){
        PApplet.main("com.mel.ProcessingMain");
    }
}
