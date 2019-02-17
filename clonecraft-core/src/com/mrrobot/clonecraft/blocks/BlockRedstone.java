package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;


public class BlockRedstone extends Block {
	public BlockRedstone() {
		super(new Texture(Gdx.files.internal("texture/Redstone.png")), Type.RedstoneBlock);
	}
}
