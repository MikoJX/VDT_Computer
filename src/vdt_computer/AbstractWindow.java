/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdt_computer;

import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class AbstractWindow extends JFrame
{
	//Constant
	private final static int WINDOW_WIDTH = 300;
	private final static int WINDOW_HEIGHT= 300;
	
	public AbstractWindow(){
		super("Default window");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	/**
	 * Create window with a title
	 * @param name Title on the top of window.
	 */
	public AbstractWindow(String name){
		super(name);
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	
	/**
	 * Create window with custom parameter.
	 * @param title Title on the top of window.
	 * @param width Width of the window.
	 * @param height height of the window.
	 */
	public AbstractWindow(String title,int width,int height){
		super(title);
		setSize(width,height);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}
}
