package com.mrrobot.clonecraft;

import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.VertexAttributes;
import com.badlogic.gdx.graphics.g3d.Material;
import com.badlogic.gdx.graphics.g3d.Model;
import com.badlogic.gdx.graphics.g3d.ModelInstance;
import com.badlogic.gdx.graphics.g3d.attributes.TextureAttribute;
import com.badlogic.gdx.graphics.g3d.utils.MeshPartBuilder;
import com.badlogic.gdx.graphics.g3d.utils.ModelBuilder;
import com.badlogic.gdx.graphics.g3d.utils.shapebuilders.BoxShapeBuilder;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Disposable;


public class Block implements Disposable {
	
	private final float box_size = 5f;
	
	private static ModelBuilder model_builder = new ModelBuilder();
	private Type type;
	private Material material;
	private ModelInstance instance;
	private Model model;
	
	
	// Constructor
	public Block(Texture texture, Type type) {
		this.setType(type);
		material = new Material(TextureAttribute.createDiffuse(texture));
		model_builder.begin();
		MeshPartBuilder mesh_part_builder = model_builder.part("box", GL20.GL_TRIANGLES, 
																VertexAttributes.Usage.Position | 
																VertexAttributes.Usage.Normal | 
																VertexAttributes.Usage.TextureCoordinates,
																material);
		
		//	WÜRFEL:								 x		   y		 z
		BoxShapeBuilder.build(mesh_part_builder, box_size, box_size, box_size);
		model = model_builder.end();
	
		// Speichert Objekte in die Instanz ab
		instance = new ModelInstance(model);
	}
	
	
	public void setPosition(float x, float y, float z) {
		// "Trick"		Matrix der Position
		instance.transform = new Matrix4().translate(x, y, z);
	}
	
	
	public Vector3 getPosition() {
		//										Spalte 0, Zeile 3 = x
		float x = instance.transform.getValues()[Matrix4.M03];
//												Spalte 1, Zeile 3 = x
		float y = instance.transform.getValues()[Matrix4.M13];
//												Spalte 2, Zeile 3 = x
		float z = instance.transform.getValues()[Matrix4.M23];
		return new Vector3(x, y, z);
	}
	
	
	public Model getModel() {
		return model;
	}
	
	
	public ModelInstance getInstance() {
		return instance;
	}
	
	// Kill it
	@Override
	public void dispose() {
		model.dispose();
	}
	
	
	public Type getType() {
		return type;
	}


	public void setType(Type type) {
		this.type = type;
	}


	// Different Types
	public enum Type {
		DirtBlock, StoneBlock, CoalBlock, GlassBlock, GoldBlock, GrassBlock, LeaveBlock, RedstoneBlock, SandBlock, TntBlock, WaterBlock, WoodBlock
	}
	
	
}
