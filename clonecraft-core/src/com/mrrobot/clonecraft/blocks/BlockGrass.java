package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;


public class BlockGrass extends Block {
	
	public BlockGrass() {
		super(new Texture(Gdx.files.internal("texture/Grass.png")), Type.GrassBlock);
	}
}
