package com.analoguetimestamps;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class AnalogueTimestampsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(AnalogueTimestampsPlugin.class);
		RuneLite.main(args);
	}
}