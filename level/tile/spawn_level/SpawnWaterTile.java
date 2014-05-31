package com.finn.snow.level.tile.spawn_level;

import com.finn.snow.graphics.Screen;
import com.finn.snow.graphics.Sprite;
import com.finn.snow.level.tile.Tile;

public class SpawnWaterTile extends Tile {

	public SpawnWaterTile(Sprite sprite) {
		super(sprite);

	}
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

}
