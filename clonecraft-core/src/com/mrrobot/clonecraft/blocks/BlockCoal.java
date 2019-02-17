package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;

public class BlockCoal extends Block {
	
	public BlockCoal() {
		super(new Texture(Gdx.files.internal("texture/Coal.png")), Type.CoalBlock);
	}

}
