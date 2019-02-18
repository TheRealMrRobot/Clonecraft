package com.mrrobot.clonecraft;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Camera;

public class FPSControl extends FPCameraController {
	
	Camera camera;

	public FPSControl(Camera camera) {
		super(camera);
		this.camera = camera;
	}
	
	
	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		touchDragged(screenX, screenY, 0);
		return super.mouseMoved(screenX, screenY);
	}
	
	@Override
	public boolean keyDown(int keycode) {
		if (keycode == Keys.ESCAPE) {
			Gdx.app.exit();
		} 
		if (keycode == Keys.L) {
			if (getVelocity() >= 15) {
				super.setVelocity(getVelocity() - 15);
			}
		}
		if (keycode == Keys.O) {
			if (getVelocity() < 150) {
				super.setVelocity(getVelocity() + 15);
			}
		}
		return super.keyDown(keycode);
	}
	
//	@Override
//	public boolean keyPressed(int keycode) {
//		if (keycode == Keys.SPACE) {
//			camera.position.y += 1;
//		}
//		return super.keyDown(keycode);
//	}
}
