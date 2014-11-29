package org.bh.wulfkonto.gui;

import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 * GUIWindow, made for Wulfkonto, is copyright Blue Husky Programming, ©2013 GPL v3<HR/>
 * 
 * @author csu of Blue Husky Programming
 * @version 1.0.0
 * @since 2013-09-09
 */
public class GUIWindow extends JFrame
{

	public GUIWindow() throws HeadlessException
	{
		intiGUI();
	}

	private void intiGUI()
	{
		setContentPane(new GUI());
		pack();
	}
	
}
