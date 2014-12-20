package com.uberverse.zoids.render;

import com.uberverse.zoids.Zoids;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderShieldLiger extends RenderLiving 
{
	public RenderShieldLiger(ModelBase par1ModelBase, float par2) 
		{
			super(par1ModelBase, par2);
		}

		@Override
		protected ResourceLocation getEntityTexture(Entity entity) 
		{
			return new ResourceLocation(Zoids.MODID, "textures/models/shieldLigerMini.png");
		}
}
