package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;


public class BlockGold extends Block {
	
	public BlockGold() {
		super(new Texture(Gdx.files.internal("texture/Gold.png")), Type.GoldBlock);
	}
}
