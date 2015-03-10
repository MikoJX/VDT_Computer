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
        
        // drawing of black border
        g.setColor(Color.BLACK);
        //g.fillRect(x, y, width, height)
        g.fillRect(0, 0, 200, 5);  //top line
        g.fillRect(0,200, 205, 5); //bottom line
        g.fillRect(0, 0, 5, 200);  //left line
        g.fillRect(200,0, 5, 200); //right line
        
        //drawing of white border 
        g.setColor(new Color(0,0,255));
        g.fillRect(5, 5,190, 5 );   //top line
        g.fillRect(5, 195,195, 5);  //bottom line
        g.fillRect(5, 5, 5, 190);   //left line
        g.fillRect(195, 5, 5,190);  //right line
        
        
        // for setting for RGB (R,G,)
         g.setColor(new Color(30,0,0));
    }
    
    /**@Override
    public void colourCodeGenerator(Graphic g) {
        super.paint(g);
    } */
}
