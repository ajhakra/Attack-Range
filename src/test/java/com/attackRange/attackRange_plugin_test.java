package com.attackRange;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class attackRange_plugin_test
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(attackRange_plugin.class);
		RuneLite.main(args);
	}
}