package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;

public class BlockWood extends Block {
	
	public BlockWood() {
		super(new Texture(Gdx.files.internal("texture/Wood.png")), Type.WoodBlock);
	}
}
