package com.mrrobot.clonecraft.blocks;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mrrobot.clonecraft.Block;


public class BlockLeave extends Block {
	public BlockLeave() {
		super(new Texture(Gdx.files.internal("texture/Leaves.png")), Type.LeaveBlock);
	}
}
