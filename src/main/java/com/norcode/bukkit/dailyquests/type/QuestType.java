package com.norcode.bukkit.dailyquests.type;

import com.norcode.bukkit.dailyquests.DailyQuests;
import com.norcode.bukkit.dailyquests.quest.Quest;
import org.bukkit.event.Listener;

import java.util.Random;

public abstract class QuestType implements Listener {
	protected static Random random = new Random();
	protected DailyQuests plugin;
	public abstract Quest generateQuest(double difficulty);

	public QuestType(DailyQuests plugin) {
		this.plugin = plugin;
	}

}
