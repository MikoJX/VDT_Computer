/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdt_computer;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
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
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.Font;

/**
 *
 * @author User
 */
public class MainWindow extends JFrame{
    public static boolean RIGHT_TO_LEFT = false;
    private JFrame mainFrame;
    private JPanel panel; 
    private CodePanel panelCode;
    private JButton btnSubmit; 
    private JTextArea txtInput; 
    private JLabel lblHeader;
  
   private JLabel statusLabel;
   private JPanel controlPanel;
  
    MainWindow() {
        prepareGUI();
    }
    
    private void prepareGUI(){
        
      //------------------------- Create new frame -----------------------
      mainFrame = new JFrame("VDT Computer Enviroment");
      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      mainFrame.setSize(700,500);
      addComponentToPane(mainFrame.getContentPane());
      
//      mainFrame.addWindowListener(new WindowAdapter() {
//         public void windowClosing(WindowEvent windowEvent){
//	        System.exit(0);
//         }        
//      });    
      
      //mainFrame.pack();
      mainFrame.setVisible(true);
//      controlPanel = new JPanel();
//      controlPanel.setLayout(new FlowLayout());
//
//      mainFrame.add(controlPanel);
//      mainFrame.setVisible(true);  
   }

   protected void showGroupLayout(){    

      JPanel panel = new JPanel();
      panel.setSize(600,400);
      GroupLayout layout = new GroupLayout(panel);
      layout.setAutoCreateGaps(true);
      layout.setAutoCreateContainerGaps(true);
      
      txtInput = new JTextArea(24,25);
      //panelCode = new CodePanel();
      //panelCode = new JPanel();
      //panelCode.setSize(300, 200);
//      btnSubmit = new JButton("Submit");
//      btnSubmit.addActionListener(new ActionListener()
//			{
//				@Override
//				public void actionPerformed(ActionEvent evt) {
//					//panelCode = new CodePanel() ;
//                                        CodeEncoding Encoding= new CodeEncoding();
//                                        Encoding.ColourEncode(txtInput.getText().toString());
//                                }
//			});      

      // --------------------------- Set the layout 
      
      
//      layout.setHorizontalGroup(layout.createSequentialGroup()
//              .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
//                      .addComponent(txtInput)
//                      .addComponent(btnSubmit))
//              .addComponent(panelCode) 
//      );
//      
//      layout.setVerticalGroup(layout.createSequentialGroup()
//              .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
//                    .addComponent(txtInput)
//                    .addComponent(panelCode))
//              .addComponent(btnSubmit)
//      );
////     
//      panel.setLayout(layout);        
//      controlPanel.add(panel);
//
//      mainFrame.setVisible(true);  
   }
   
   protected void addComponentToPane(Container pane) {
       
       if (!(pane.getLayout() instanceof BorderLayout)) {
           pane.add(new JLabel("Container does't use BorderLayout!"));
       }
       
       if (RIGHT_TO_LEFT) {
           pane.setComponentOrientation(java.awt.ComponentOrientation.RIGHT_TO_LEFT);
       }       
       //Header setting
       lblHeader = new JLabel("Visual Data Transmission");
       lblHeader.setFont(new Font("Serif", Font.PLAIN, 20));
       pane.add(lblHeader,BorderLayout.PAGE_START);
       
       txtInput = new JTextArea(24,25);
       JPanel leftpanel = new JPanel();
       leftpanel.setSize(600,400);
       leftpanel.add(txtInput);
       pane.add(leftpanel, BorderLayout.WEST);
       
       //JButton btn = new JButton("Hello");
       JPanel rightpanel = new JPanel();
       pane.add(rightpanel, BorderLayout.CENTER);
       
       btnSubmit = new JButton("Submit");
       btnSubmit.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent evt) {
                                    //rightPanel
                                    int[] temp = new int[100];
                                    panelCode = new CodePanel() ;
                                    rightpanel.add(panelCode);
                                    System.out.println("Set click");
                                        
                                    CodeEncoding Encoding= new CodeEncoding();
                                    Encoding.ColourEncode(txtInput.getText().toString());
                                    System.out.println("After click");
                                }
			}); 
       pane.add(btnSubmit,BorderLayout.AFTER_LAST_LINE);
       
   }
    
}
