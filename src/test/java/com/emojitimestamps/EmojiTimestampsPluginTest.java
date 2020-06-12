package com.emojitimestamps;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class EmojiTimestampsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(EmojiTimestampsPlugin.class);
		RuneLite.main(args);
	}
}