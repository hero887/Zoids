package com.uberverse.zoids.proxies;

import com.uberverse.zoids.entity.EntityShieldLiger;
import com.uberverse.zoids.render.ModelShieldLiger;
import com.uberverse.zoids.render.RenderShieldLiger;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxyZoids extends CommonProxyZoids
{
	public static void preInit(){
	
		RenderingRegistry.registerEntityRenderingHandler(EntityShieldLiger.class, new RenderShieldLiger (new ModelShieldLiger(), 0.5F));
		
	}

}
