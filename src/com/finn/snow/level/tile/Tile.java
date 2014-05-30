package com.finn.snow.level.tile;


import com.finn.snow.graphics.Screen;
import com.finn.snow.graphics.Sprite;
import com.finn.snow.level.tile.spawn_level.SpawnFloorTile;
import com.finn.snow.level.tile.spawn_level.SpawnGrassTile;
import com.finn.snow.level.tile.spawn_level.SpawnHedgeTile;
import com.finn.snow.level.tile.spawn_level.SpawnWall2Tile;
import com.finn.snow.level.tile.spawn_level.SpawnWallTile;
import com.finn.snow.level.tile.spawn_level.SpawnWaterTile;

public class Tile {

	public int x, y;
	public Sprite sprite;

	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile voidTile = new GrassTile(Sprite.voidSprite);
	public static Tile rock = new RockTile(Sprite.rock);
	public static Tile flower = new FlowerTile(Sprite.flower);
	
	public static Tile spawn_grass = new GrassTile(Sprite.spawn_grass);
	public static Tile spawn_floor = new SpawnFloorTile(Sprite.spawn_floor);
	public static Tile spawn_wall2= new SpawnWall2Tile(Sprite.spawn_wall2);
	public static Tile spawn_wall1= new SpawnWallTile(Sprite.spawn_wall1);
	public static Tile spawn_hedge = new SpawnHedgeTile(Sprite.spawn_hedge);
	public static Tile spawn_water = new SpawnWaterTile(Sprite.spawn_water);
	
	
	public static final  int col_spawn_grass = 0xff00ff00 ; 
	public static final  int col_spawn_floor = 0xff000000; 
	public static final  int col_spawn_wall2 = 0xffffffff;
	public static final  int col_spawn_wall1 = 0xff663300;
	public static final  int col_spawn_hedge = 0xff000080;
	public static final  int col_spawn_water = 0xff000080; //unused
	public static final  int col_rock = 0xffFF0000; 
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}

	public void render(int x, int y, Screen screen) {

	}

	public boolean solid() {
		return false;
	}

}
