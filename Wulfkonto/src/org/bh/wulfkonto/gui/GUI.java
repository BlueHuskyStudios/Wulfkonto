package org.bh.wulfkonto.gui;

import bht.tools.fx.LookAndFeelChanger;
import java.awt.HeadlessException;
import java.awt.Label;
import javax.swing.JApplet;
import org.lobobrowser.html.HtmlRendererContext;
import org.lobobrowser.html.UserAgentContext;
import org.lobobrowser.html.gui.HtmlPanel;
import org.lobobrowser.html.test.SimpleHtmlRendererContext;
import org.lobobrowser.html.test.SimpleUserAgentContext;

/**
 * GUI, made for Wulfkonto, is copyright Blue Husky Programming, ©2013 GPL v3<HR/>
 * 
 * @author csu of Blue Husky Programming
 * @version 1.0.0
 * @since 2013-09-09
 */
public class GUI extends JApplet
{

	public GUI() throws HeadlessException
	{
		initGUI();
	}

        private HtmlPanel htmlPanel;
	private void initGUI()
	{
		LookAndFeelChanger.setLookAndFeel(LookAndFeelChanger.SYSTEM);
		add(new Label("Wulfkonto"));
                
                htmlPanel = new HtmlPanel();
                UserAgentContext uac = new SimpleUserAgentContext();
                HtmlRendererContext hrc = new SimpleHtmlRendererContext(htmlPanel, uac);
                htmlPanel.setHtml("Hello world", null, hrc);
                add(htmlPanel);
	}
	
}
