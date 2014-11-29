//this is a comment I am making..
//I have made a comment.
// conflict!

package org.bh.wulfkonto;

import bht.tools.misc.Argument;
import bht.tools.misc.Parameter;
import java.io.Console;
import org.bh.wulfkonto.gui.GUIWindow;



/**
 * Main, made for Wulfkonto, is copyright Blue Husky Programming ©2013
 *
 * @author Supuhstar of Blue Husky Programming
 * @version 1.0.0
 * @since 2013-09-09
 */
public class Main
{
	public static final NoGUIArgument NO_GUI_ARG = new NoGUIArgument();

	/**
	 * @param args the command line arguments <BR/>
	 * <STRONG>Accepted arguments:</STRONG>
	 * <UL>
	 *	<LI>{@code --noGui} &ndash; Do not show the GUI and instead only use the console</LI>
	 * </UL>
	 */
	public static void main(String[] args)
	{
		if (NO_GUI_ARG.isProvided()) // Start TUI
		{
			Console c = System.console();
			System.out.println("Wulfkonto");
			
		}
		else // Start GUI
		{
			GUIWindow gui = new GUIWindow();
			gui.setVisible(true);
		}
	}
	
	public static class NoGUIArgument extends Argument
	{
		public NoGUIArgument()
		{
			super("--nogui", null);
		}
		
		public boolean provided = false;
		@Override
		public Argument provide(Parameter... parameters)
		{
			provided = true;
			return this;
		}

		public boolean isProvided()
		{
			return provided;
		}

		public void setUseGUI(boolean useGUI)
		{
			this.provided = useGUI;
		}
	}
}
