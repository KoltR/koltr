package ru.koltr.subs;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;

public class RenderTileEntityObj extends TileEntitySpecialRenderer {

	public static final IModelCustom model = 
			AdvancedModelLoader.loadModel(new ResourceLocation(main.MODID, "obj/Opora_ZB.obj")); // здесь изменить путь модельки
	public static final ResourceLocation texture = new ResourceLocation(main.MODID, "textures/blocks/Opora_ZB.jpg"); // текстурка

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((TileEntityObj)tile, x, y, z, f);
	}

	private void render(TileEntityObj tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 0.0F, 0.5F);
		bindTexture(texture);
		GL11.glScalef(1.0F, 1.0F, 1.0F); // размер модели "Кодом" робит только перед рендером модели model.renderAll();
		model.renderAll();
		GL11.glPopMatrix();
	}

}
