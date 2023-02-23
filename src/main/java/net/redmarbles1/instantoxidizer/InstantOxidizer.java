package net.redmarbles1.instantoxidizer;

import net.fabricmc.api.ModInitializer;

import net.redmarbles1.instantoxidizer.item.InstantOxidizerItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InstantOxidizer implements ModInitializer {
	public static final String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("testmod");

	@Override
	public void onInitialize() {
		InstantOxidizerItem.registerModItems();
	}
}