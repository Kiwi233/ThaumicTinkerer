/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the ThaumicTinkerer Mod.
 *
 * ThaumicTinkerer is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 *
 * ThaumicTinkerer is a Derivative Work on Thaumcraft 3.
 * Thaumcraft 3 � Azanor 2012
 * (http://www.minecraftforum.net/topic/1585216-)
 *
 * File Created @ [1 Jun 2013, 22:16:23 (GMT)]
 */
package vazkii.tinkerer.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import vazkii.tinkerer.client.util.handler.ClientTickHandler;
import vazkii.tinkerer.lib.LibMisc;

// Generated by Techne
public class ModelFluxCollector extends ModelBase {

	ModelRenderer Base;
	ModelRenderer Piston1;
	ModelRenderer Piston2;
	ModelRenderer Piston3;
	ModelRenderer Piston4;

	public ModelFluxCollector() {
		textureWidth = 64;
		textureHeight = 32;

		Base = new ModelRenderer(this, 0, 0);
		Base.addBox(0F, 0F, 0F, 14, 5, 14);
		Base.setRotationPoint(-7F, 19F, -7F);
		Base.setTextureSize(64, 32);
		Base.mirror = true;
		Piston1 = new ModelRenderer(this, 0, 19);
		Piston1.addBox(0F, 0F, 0F, 2, 4, 2);
		Piston1.setRotationPoint(-6F, 15F, 4F);
		Piston1.setTextureSize(64, 32);
		Piston1.mirror = true;
		Piston2 = new ModelRenderer(this, 0, 19);
		Piston2.addBox(0F, 0F, 0F, 2, 4, 2);
		Piston2.setRotationPoint(4F, 15F, 4F);
		Piston2.setTextureSize(64, 32);
		Piston2.mirror = true;
		Piston3 = new ModelRenderer(this, 0, 19);
		Piston3.addBox(0F, 0F, 0F, 2, 4, 2);
		Piston3.setRotationPoint(-6F, 15F, -6F);
		Piston3.setTextureSize(64, 32);
		Piston3.mirror = true;
		Piston4 = new ModelRenderer(this, 0, 19);
		Piston4.addBox(0F, 0F, 0F, 2, 4, 2);
		Piston4.setRotationPoint(4F, 15F, -6F);
		Piston4.setTextureSize(64, 32);
		Piston4.mirror = true;
	}

	public void render() {
		Base.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		long ticks = ClientTickHandler.clientTicksElapsed;

		float trans = (float) Math.abs(Math.cos(ticks / 15F) / 4F);
		GL11.glTranslatef(0, trans, 0);
		Piston1.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		GL11.glTranslatef(0, -trans, 0);
		trans = (float) Math.abs(Math.sin(ticks / 15F) / 4F);

		GL11.glTranslatef(0, trans, 0);
		Piston2.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		GL11.glTranslatef(0, -trans, 0);
		trans = (float) Math.abs(Math.cos(ticks / 15F) / 4F);

		GL11.glTranslatef(0, trans, 0);
		Piston4.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		GL11.glTranslatef(0, -trans, 0);
		trans = (float) Math.abs(Math.sin(ticks / 15F) / 4F);

		GL11.glTranslatef(0, trans, 0);
		Piston3.render(LibMisc.MODEL_DEFAULT_RENDER_SCALE);
		GL11.glTranslatef(0, -trans, 0);
	}
}