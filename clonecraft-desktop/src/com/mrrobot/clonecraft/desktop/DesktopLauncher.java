package com.mrrobot.clonecraft.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mrrobot.clonecraft.Clonecraft;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = 1600;
		config.height = 900;
		config.title = "Clonecraft";
		
		new LwjglApplication(new Clonecraft(), config);
	}
}
