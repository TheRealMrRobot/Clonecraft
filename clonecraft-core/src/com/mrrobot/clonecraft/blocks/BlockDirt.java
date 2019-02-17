package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;

public class BlockDirt extends Block {
	
	public BlockDirt() {
		super(new Texture(Gdx.files.internal("texture/Dirt.png")), Type.DirtBlock);
	}
}
