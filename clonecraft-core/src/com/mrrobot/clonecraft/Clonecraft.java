package com.mrrobot.clonecraft;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;


public class Clonecraft extends ApplicationAdapter {
	
	public Environment environment;
	public PerspectiveCamera camera;
	public SpriteBatch sprite_batch;
	public Texture crosshair;
	public Texture dirt_texture;
	public ModelBatch model_batch;
	public FPSControl camera_controller;
	public Grid grid;
	public BitmapFont font;
	public Rendering renderer;
	public Creation creation;
	
	
	public final float field_of_view = 67;
	public final float camera_near = 1;
	public final float camera_far = 600;
	public final float camera_velocity = 15;		// Velocity of camera
	public final float camera_degrees_per_pixel = 0.08f;
	public final float crosshair_size = 25;
	
	
	// at startup
	@Override
	public void create () {
		creation = new Creation();	// EXTRA Class to handle all creation
		renderer = new Rendering();	// EXTRA Class to handle all rendering
		sprite_batch = new SpriteBatch();
		model_batch = new ModelBatch();
		crosshair = new Texture(Gdx.files.internal("interface/Crosshair.png"));
		grid = new Grid();
		
		environment = creation.createEnvironment();
		font = creation.createBFont();
		// Camera:
		camera = creation.createCamera(field_of_view, Gdx.graphics.getWidth(), Gdx.graphics.getHeight(), camera_near, camera_far);
		camera_controller = creation.createCameraController(grid, camera, camera_degrees_per_pixel, camera_velocity);
	}
	
	

	// all the time!
	@Override
	public void render () {
		
		renderer.displayGraphics(grid, environment, model_batch, sprite_batch, camera, camera_controller, crosshair_size, crosshair);
		
		renderer.displayInfo(grid, font, sprite_batch, camera, camera_controller);
		
	}
	
	
	
	// at end
	@Override
	public void dispose () {
		// to erease RAM from Graphics Card
		grid.dispose();
		crosshair.dispose();
	}
	

}
