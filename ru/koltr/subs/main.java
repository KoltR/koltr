package ru.koltr.subs;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

@Mod (modid = main.MODID, name = main.MODNAME, version = main.VERSION)

public class main {

	public static Block ZBopora;
	public static Block ZBopora2;
	
	/*
	Пиши блоки всегда выше всего
	и креатив вкладки
	будет жаловаться ProxyClient
	или сам блок при указаний креатив вкладки
	[Блоки]
	*/
	
	
	public static final String MODID = "subs";
	public static final String MODNAME = "subss";
	public static final String VERSION = "0.1b";
	
	@Instance(main.MODID) public static main instance;
	@SidedProxy(modId = main.MODID, clientSide = "ru.koltr.subs.ProxyClient", serverSide = "ru.koltr.subs.ProxyCommon")
	public static ProxyCommon proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		ZBopora = new ZBopora1();
		GameRegistry.registerBlock(ZBopora, "ZBopora"); // ковычки для .lang чтоб указать какой именно блок
		GameRegistry.registerTileEntity(TileEntityObj.class, "TileEntityObj");
		
		ZBopora2 = new ZBopora21();
		GameRegistry.registerBlock(ZBopora2, "ZBopora2"); // ковычки для .lang чтоб указать какой именно блок
		GameRegistry.registerTileEntity(TileEntityObj1.class, "TileEntityObj1");
		
		
		proxy.preInit();

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init();
	}

}
