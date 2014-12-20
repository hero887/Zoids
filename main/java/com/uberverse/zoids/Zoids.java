package com.uberverse.zoids;

import net.minecraft.init.Blocks;

import com.example.examplemod.ExampleMod;
import com.uberverse.zoids.entity.EntityShieldLiger;
import com.uberverse.zoids.entity.ModEntities;
import com.uberverse.zoids.proxies.CommonProxyZoids;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;

@Mod(modid = Zoids.MODID, version = Zoids.VERSION)
public class Zoids 
{
    public static final String MODID = "Zoids";
    public static final String VERSION = "1.0";
    
	@SidedProxy(clientSide = "com.uberverse.zoids.proxies.ClientProxyZoids", serverSide = "com.uberverse.zoids.proxies.ClientProxyZoids")
	public static CommonProxyZoids proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	proxy.registerRendering();
    	EntityRegistry.registerModEntity(EntityShieldLiger.class, "shieldliger", 0, this, 80, 3, true);
    	
    	ModEntities.loadEntities(this);
    	
    	
	}

	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
        
    }
}
