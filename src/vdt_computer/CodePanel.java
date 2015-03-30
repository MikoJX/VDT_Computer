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

/**
 *
 * @author User
 */
public class CodePanel extends Canvas  {
     JPanel myPanel;
      
     //private static int final width = 5;
     public CodePanel () {
        super();
        super.setSize(300,200);
        myPanel= new JPanel();
        //frame.getContentPane().add(this);
        //frame.pack();
        myPanel.setVisible(true);
         
     }
     
    //@Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // drawing of black border [g.fillRect(x, y, width, height)]
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 240, 10);  //top line
        g.fillRect(0,230, 240, 10); //bottom line
        g.fillRect(0, 0, 10, 240);  //left line
        g.fillRect(230,0, 10, 240); //right line
        
        //drawing of white border 
        g.setColor(Color.WHITE);
        g.fillRect(10, 10,220, 10);   //top line
        g.fillRect(10, 220,220, 10);  //bottom line
        g.fillRect(10, 10, 10, 220);   //left line
        g.fillRect(220, 10, 10,220);  //right line
       
        // for setting for RGB (R,G,B)
        //block size 20x20
        //code size 10x10 (w x h)
        
        
        boolean states = true; 
        for (int y = 20 ; y <= 200 ; y += 20) {
            for (int x = 20; x <= 200 ; x += 20 ) {
                if (states) {
                    g.setColor(new Color(255-x,0,0)); //colour setting
                }
                else { //change to dark to light
                    g.setColor(new Color(55+x ,0,0)); //colour setting 
                }
                //g.setColor(new Color(255-x,0,0));
                g.fillRect(x,y,20,20);
                }
                if(states) states = false;
                else states = true;
            } 
                
       
            
            
            
        } 
        // g.setColor(new Color(255,0,0));
        // g.fillRect(10,10,20,20);
         
         //g.setColor(Color.);
         
         
    }
    
    /**@Override
    public void colourCodeGenerator(Graphic g) {
        super.paint(g);
    } */

