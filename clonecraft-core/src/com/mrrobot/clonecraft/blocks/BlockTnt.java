package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;

public class BlockTnt extends Block{
	
	public BlockTnt() {
		super(new Texture(Gdx.files.internal("texture/Tnt.png")), Type.TntBlock);
	}
}
