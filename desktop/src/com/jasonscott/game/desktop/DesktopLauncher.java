package com.jasonscott.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jasonscott.game.JumpyDemo;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = JumpyDemo.WIDTH;
        config.height = JumpyDemo.HEIGHT;
        config.title = JumpyDemo.TITLE;
		new LwjglApplication(new JumpyDemo(), config);
	}
}
