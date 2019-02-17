package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;

public class BlockStone extends Block {

	public BlockStone() {
		super(new Texture(Gdx.files.internal("texture/Stone.png")), Type.StoneBlock);
	}
	

}
