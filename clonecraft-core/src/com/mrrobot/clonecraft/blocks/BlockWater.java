package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;

public class BlockWater extends Block {
	
	public BlockWater() {
		super(new Texture(Gdx.files.internal("texture/Water.png")), Type.WaterBlock);
	}
}
