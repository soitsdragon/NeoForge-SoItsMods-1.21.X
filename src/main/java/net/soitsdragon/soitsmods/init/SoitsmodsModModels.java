/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.soitsdragon.soitsmods.init;

import net.soitsdragon.soitsmods.client.model.Modeltop_hat;
import net.soitsdragon.soitsmods.client.model.Modelsanta_hat;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

@EventBusSubscriber(Dist.CLIENT)
public class SoitsmodsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsanta_hat.LAYER_LOCATION, Modelsanta_hat::createBodyLayer);
		event.registerLayerDefinition(Modeltop_hat.LAYER_LOCATION, Modeltop_hat::createBodyLayer);
	}
}