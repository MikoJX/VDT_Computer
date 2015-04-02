/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdt_computer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Random;

/**
 *
 * @author User
 */
public class CodePanel extends Canvas  {
     JPanel myPanel;
     static int pixelData[];
     int red,blue,green;
      
     //private static int final width = 5;
     public CodePanel () {
        super();
        super.setSize(300,400);
        myPanel= new JPanel();
        //frame.getContentPane().add(this);
        //frame.pack();
        myPanel.setVisible(true);
        this.pixelData = new int [100];
        //this.pixelData = pixelData;
        this.red = 0;
        this.blue = 0;
        this.green = 0;
        System.out.println("Constructor : " + pixelData[0]);  
     }
     
    public void paint(Graphics g){
        //System.out.println("Pixel In paint before" + pixelData[0]);
        super.paint(g);
        // drawing of black border [g.fillRect(x, y, width, height)]
        g.setColor(Color.BLACK);
        g.fillRect(50, 50, 240, 10);  //top line
        g.fillRect(50,280, 240, 10);  //bottom line
        g.fillRect(50, 50, 10, 240);  //left line
        g.fillRect(280,50, 10, 240);  //right line
        
        //drawing of white border 
        g.setColor(Color.WHITE);
        g.fillRect(60, 60,220, 10);   //top line
        g.fillRect(60,270,220, 10);   //bottom line
        g.fillRect(60, 60, 10,220);   //left line
        g.fillRect(270,60, 10,220);   //right line
       
        System.out.println("Pixel In paint" + pixelData[0]);
        
        int index = 0;
        //drawing for colour code block (10x10) (w x h)
        for (int y = 0; y < 10; y++) {
            for(int x = 0; x < 10; x++) {
                splitColour(index);
                g.setColor(new Color(red,green,blue));
                g.fillRect((x*20)+70, (y*20)+70, 20, 20 );
               
                //System.out.println("Current Index" + index);
                index++;
            } //end inner loop
        }//end outer loop       
        } 
    
    //perform splitting the pixel into RBG forms 
    public void splitColour(int index){
        int currentPixel = getColour(index);
        
        if(!(getColour(index) ==0)) { //if is not end of the statement 
            this.red = (currentPixel >> 16) & 255;
            this.green = (currentPixel >> 8) & 255;
            this.blue = (currentPixel) & 255;
        }else {
            this.red = (int) (Math.random() * 240 + 10) ;
            this.green = (int) (Math.random() * 240 + 10) ;
            this.blue = (int) (Math.random() * 240 + 10) ;
        }
        //System.out.println("Current Pixel Data: " + currentPixel ); //0
        //System.out.print(red + "\n");
    }//end splitColour
    
    public int getColour(int index) {
        //System.out.println("Get Colour PixelData : " + pixelData[index] );
        return pixelData[index]; // 0 
    }

    public void setColour(int[] pixelData){
        this.pixelData = pixelData; 
        System.out.println("Code Panel:setColour" + pixelData[0]);
    }
}
