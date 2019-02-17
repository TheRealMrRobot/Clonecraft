package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;

public class BlockGlass extends Block {
	
	public BlockGlass() {
		super(new Texture(Gdx.files.internal("texture/Glass.png")), Type.GlassBlock);
	}
}
