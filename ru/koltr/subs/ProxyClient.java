package ru.koltr.subs;

import net.minecraft.item.Item;
import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ProxyClient extends ProxyCommon {

	public void preInit() {
		super.preInit();
	}

	public void init() {
		super.init();
		
		//Blocks
				ClientRegistry.bindTileEntitySpecialRenderer(TileEntityObj.class, new RenderTileEntityObj());
				MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(main.ZBopora), new RenderItemBlockObj());  //Итем рендер не обязателен
		
	}

}
