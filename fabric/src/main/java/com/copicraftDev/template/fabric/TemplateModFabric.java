package com.copicraftDev.template.fabric;

import com.copicraftDev.template.TemplateModCommon;
import net.fabricmc.api.ModInitializer;


public class TemplateModFabric implements ModInitializer {
	@Override
	public void onInitialize() {
		TemplateModCommon.init();
	}
}
