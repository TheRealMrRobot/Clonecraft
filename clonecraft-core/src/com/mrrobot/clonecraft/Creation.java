package com.mrrobot.clonecraft;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.attributes.ColorAttribute;
import com.badlogic.gdx.graphics.g3d.environment.DirectionalLight;

public class Creation {
	
	public Creation() {
		
	}
	
	public Environment createEnvironment() {
		Environment environment = new Environment();
		environment.set(new ColorAttribute(ColorAttribute.AmbientLight, 0.5f, 0.5f, 0.5f, 1f));
		environment.add(new DirectionalLight().set(0.2f, 0.2f, 0.2f, 1f, 0.8f, 0.5f));
		
		return environment;
	}
	
	public BitmapFont createBFont() {
		BitmapFont font = new BitmapFont();
		font.setColor(1f, 0f, 0f, 1f);
		
		return font;
	}
	
	public PerspectiveCamera createCamera(float field_of_view, float width, float height, float camera_near, float camera_far) {
		// Camera:
		PerspectiveCamera camera = new PerspectiveCamera(field_of_view, width, height);
		// 3Dimensionen:	x	y	z
		camera.position.set(0, 10f, 10f);
		camera.near = camera_near;
		camera.far = camera_far;
		
		return camera;
	}
	
	
	public FPSControl createCameraController(final Grid grid, PerspectiveCamera camera, float camera_degrees_per_pixel, float camera_velocity) {
		// Überschreiben des Controllers der Camera
		FPSControl camera_controller = new FPSControl(camera) {
			@Override
			public boolean touchDown(int screenX, int screenY, int pointer, int button) {
				if (button == 0) {
					grid.editBoxByRayCast(camera.position, camera.direction, Block.Type.DirtBlock);
				} else if (button == 1) {
					grid.editBoxByRayCast(camera.position, camera.direction, null);
				}
				return super.touchDown(screenX, screenY, pointer, button);
			}
		};
		camera_controller.setDegreesPerPixel(camera_degrees_per_pixel);
		camera_controller.setVelocity(camera_velocity);
		
		// Use Cursor as Camera point
		Gdx.input.setInputProcessor(camera_controller);
		Gdx.input.setCursorCatched(true);					// Cursor in mitte
		
		return camera_controller;
	}
}
