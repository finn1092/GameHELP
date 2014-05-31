package com.finn.snow.level.tile;

import com.finn.snow.graphics.Screen;
import com.finn.snow.graphics.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);

	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x, y, this);
	}

}
