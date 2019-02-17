package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;


public class BlockSand extends Block {
	
	public BlockSand() {
		super(new Texture(Gdx.files.internal("texture/Sand.png")), Type.SandBlock);
	}
}
