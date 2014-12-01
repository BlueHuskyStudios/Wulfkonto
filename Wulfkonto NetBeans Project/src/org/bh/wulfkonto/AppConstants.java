package org.bh.wulfkonto;

import bht.tools.net.UserAgent;
import bht.tools.net.upd.Version;
import static bht.tools.net.upd.Version.Channel.LAMBDA;

/**
 * AppConstants, made for Wulfkonto NetBeans Project, is copyright Blue Husky Programming ©2014 GPLv3 <hr/>
 * 
 * @author Kyli of Blue Husky Programming
 * @version 1.0.0
 *		- 2014-11-29 (1.1.0) - Kyli added USER_AGENT and APP_WEBSITE
 *		- 2014-11-29 (1.0.0) - Kyli created AppConstants
 * @since 2014-11-29
 */
public interface AppConstants
{
	public static final String    APP_NAME = "Wulfkonto";
	public static final Version   APP_VERSION = new Version(0,0,0).setChannel(LAMBDA);
	public static final String    APP_WEBSITE = "http://Prog.BHStudios.org/Wulfkonto/";
	public static final UserAgent USER_AGENT = new UserAgent(APP_NAME, APP_VERSION, "+" + APP_WEBSITE);
}
