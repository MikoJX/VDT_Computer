/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdt_computer;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle;

/**
 *
 * @author User
 */
public class MainWindow extends JFrame{
    
    private JFrame mainFrame;
    private JPanel panel;
    private CodePanel panelCode;
    private JButton btnSubmit; 
    private JTextArea txtInput; 
    
   
   private JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel;
  
    
    MainWindow() {
        prepareGUI();
    }
    
    private void prepareGUI(){
        
      //------------------------- Create new frame -----------------------
      mainFrame = new JFrame("Java SWING Examples");
      mainFrame.setSize(700,500);
      mainFrame.addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent windowEvent){
	        System.exit(0);
         }        
      });    
      controlPanel = new JPanel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(controlPanel);
      mainFrame.setVisible(true);  
   }

   protected void showGroupLayout(){    

      JPanel panel = new JPanel();
      panel.setSize(600,400);
      GroupLayout layout = new GroupLayout(panel);
      layout.setAutoCreateGaps(true);
      layout.setAutoCreateContainerGaps(true);
      
      txtInput = new JTextArea(24,25);
      panelCode = new CodePanel();
      btnSubmit = new JButton("Submit");

      // --------------------------- Set the layout 
      layout.setHorizontalGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                      .addComponent(txtInput)
                      .addComponent(btnSubmit))
              .addComponent(panelCode) 
      );
      
      layout.setVerticalGroup(layout.createSequentialGroup()
              .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
              .addComponent(txtInput)
              .addComponent(panelCode))
              
              .addComponent(btnSubmit)
      
      );
     
      panel.setLayout(layout);        
      controlPanel.add(panel);

      mainFrame.setVisible(true);  
   }
    
    
}
