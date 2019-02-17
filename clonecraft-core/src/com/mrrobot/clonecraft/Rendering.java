package com.mrrobot.clonecraft;

import java.awt.Font;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g3d.Environment;
import com.badlogic.gdx.graphics.g3d.ModelBatch;

public class Rendering {
	
		public Rendering() {
			
		}
	
	
	// Displays Coordinates, Velocity..
		public void displayInfo(Grid grid, BitmapFont font, SpriteBatch sprite_batch, Camera camera, FPSControl camera_controller) {
			String str_pos_x = "x: ";
			String str_pos_y = "y: ";
			String str_pos_z = "z: ";
			String str_velo = "Velocity: ";
			float dice_size = grid.getFieldSize();
			
			sprite_batch.begin();
			// Calculate the Position of the camera / the player:
			font.draw(sprite_batch, str_pos_x + (camera.position.x / dice_size), 10, 20);
			font.draw(sprite_batch, str_pos_y + (camera.position.y / dice_size), 10, 40);
			font.draw(sprite_batch, str_pos_z + (camera.position.z / dice_size), 10, 60);
			font.draw(sprite_batch, str_velo + camera_controller.getVelocity(), 10, 450);
			sprite_batch.end();
		}
		
		
		// Displays Blocks, Crosshair, GUI etc
		public void displayGraphics(Grid grid, Environment environment, ModelBatch model_batch, SpriteBatch sprite_batch, Camera camera, FPSControl camera_controller, float crosshair_size, Texture crosshair) {
			camera_controller.update();
			Gdx.gl.glClearColor(0.5f, 0.8f, 1f, 1f);
			Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);
			
			model_batch.begin(camera);
//			model_batch.render(block.getInstance(), environment);
			grid.renderGrid(model_batch, environment);
			model_batch.end();
			
			float crosshair_x = ((Gdx.graphics.getWidth() - crosshair_size) / 2);
			float crosshair_y = ((Gdx.graphics.getHeight() - crosshair_size) / 2);
			
			sprite_batch.begin();
			sprite_batch.draw(crosshair, crosshair_x, crosshair_y, crosshair_size, crosshair_size);
			sprite_batch.end();
		}
}
