package Game.SimpleRPG.tilegame.worlds;

import java.awt.Graphics;

import Game.SimpleRPG.tilegame.Game;
import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.entities.EntityManager;
//import Game.SimpleRPG.tilegame.entities.creatures.Monster;
import Game.SimpleRPG.tilegame.entities.creatures.Player;
import Game.SimpleRPG.tilegame.entities.statics.Bird;
import Game.SimpleRPG.tilegame.entities.statics.House;
import Game.SimpleRPG.tilegame.entities.statics.House2;
import Game.SimpleRPG.tilegame.entities.statics.House3;
import Game.SimpleRPG.tilegame.entities.statics.House4;
import Game.SimpleRPG.tilegame.entities.statics.Monster3;
import Game.SimpleRPG.tilegame.entities.statics.Monster4;
import Game.SimpleRPG.tilegame.entities.statics.Monster5;
import Game.SimpleRPG.tilegame.entities.statics.Tree1;
import Game.SimpleRPG.tilegame.entities.statics.Tree2;
import Game.SimpleRPG.tilegame.entities.statics.Tree3;
import Game.SimpleRPG.tilegame.entities.statics.Tree4;
import Game.SimpleRPG.tilegame.entities.statics.Tree5;
import Game.SimpleRPG.tilegame.entities.statics.monster2;
import Game.SimpleRPG.tilegame.entities.statics.rock1;
import Game.SimpleRPG.tilegame.entities.statics.rock2;
import Game.SimpleRPG.tilegame.items.ItemManager;
import Game.SimpleRPG.tilegame.tiles.Tile;
import Game.SimpleRPG.tilegame.utils.Utils;
public class World {
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	public EntityManager getEntityManager() {
		return entityManger;
	}

	private Handler handler;
	
	//Entities
	private EntityManager entityManger;
	
	//item
	private ItemManager itemManager;
	
	public World(Handler handler, String path) {
		this.handler = handler;
		entityManger = new EntityManager(handler, new Player(handler, 100, 100));
//		entityManger = new EntityManager(handler, new Monster(handler, 100, 100));
		itemManager = new ItemManager(handler);
		entityManger.addEntity(new Tree1(handler, 64, 64));
		entityManger.addEntity(new Tree1(handler, 128, 50));
		entityManger.addEntity(new Tree1(handler, 192, 64));
		entityManger.addEntity(new Tree1(handler, 256, 50));
		entityManger.addEntity(new Tree1(handler, 320, 64));
		entityManger.addEntity(new Tree1(handler, 64, 100));
		entityManger.addEntity(new Tree1(handler, 128, 128));
		entityManger.addEntity(new Tree1(handler, 64, 190));
		entityManger.addEntity(new Tree1(handler, 128, 192));
		entityManger.addEntity(new Tree1(handler, 64, 370));
		entityManger.addEntity(new Tree1(handler, 64, 490));
		entityManger.addEntity(new Tree1(handler, 64, 730));
		entityManger.addEntity(new Tree1(handler, 64, 850));
		entityManger.addEntity(new Tree1(handler, 64, 970));
		entityManger.addEntity(new Tree1(handler, 64, 1030));
		entityManger.addEntity(new Tree1(handler, 64, 1090));

	
		
		entityManger.addEntity(new Tree2(handler, 710, 64));
		entityManger.addEntity(new Tree3(handler, 710, 128));
		entityManger.addEntity(new Tree4(handler, 774, 64));
		
		entityManger.addEntity(new Tree2(handler, 1400, 64));
		entityManger.addEntity(new Tree2(handler, 1300, 100));
		entityManger.addEntity(new Tree2(handler, 1300, 200));
		entityManger.addEntity(new Tree2(handler, 1400, 130));
		entityManger.addEntity(new Tree2(handler, 1400, 340));
		entityManger.addEntity(new Tree2(handler, 1400, 500));
		entityManger.addEntity(new Tree2(handler, 1400, 600));
		entityManger.addEntity(new Tree2(handler, 1400, 930));
		entityManger.addEntity(new Tree2(handler, 1400, 1000));
		entityManger.addEntity(new Tree2(handler, 1400, 1050));
		entityManger.addEntity(new Tree2(handler, 1400, 1100));
		
		
		
		entityManger.addEntity(new Tree3(handler, 64, 1600));
		entityManger.addEntity(new Tree3(handler, 120, 1600));
		entityManger.addEntity(new Tree3(handler, 240, 1600));
		entityManger.addEntity(new Tree3(handler, 280, 1600));
		entityManger.addEntity(new Tree3(handler, 64, 1550));
		entityManger.addEntity(new Tree3(handler, 120, 1550));	
		entityManger.addEntity(new Tree3(handler, 120, 1500));
		entityManger.addEntity(new Tree3(handler, 170, 1500));
		entityManger.addEntity(new Tree3(handler, 64, 1460));
		entityManger.addEntity(new Tree3(handler, 64, 1400));
		entityManger.addEntity(new Tree3(handler, 64, 1350));
		
		
		
		entityManger.addEntity(new House(handler, 200, 150));
		entityManger.addEntity(new Bird(handler, 200, 250));
		entityManger.addEntity(new House2(handler, 1100, 60));
		
		
		entityManger.addEntity(new House2(handler, 300, 680));
		entityManger.addEntity(new Tree4(handler, 250, 780));
		entityManger.addEntity(new Tree2(handler, 320, 880));
		entityManger.addEntity(new Tree4(handler, 410, 950));
		
		entityManger.addEntity(new House3(handler, 1200, 800));
		
		
		entityManger.addEntity(new Tree1(handler, 700, 350));
		entityManger.addEntity(new Tree2(handler, 700, 500));
		entityManger.addEntity(new House3(handler, 750, 400));
		entityManger.addEntity(new Tree2(handler, 850, 500));
		entityManger.addEntity(new Tree1(handler, 850, 350));
		
		
		entityManger.addEntity(new Tree1(handler, 700, 600));
		entityManger.addEntity(new Tree3(handler, 700, 750));
		
		entityManger.addEntity(new Tree1(handler, 720, 1050));
		entityManger.addEntity(new Tree2(handler, 720, 1200));
		entityManger.addEntity(new House4(handler, 750, 1100));
		entityManger.addEntity(new Tree2(handler, 850, 1200));
		entityManger.addEntity(new Tree1(handler, 850, 1050));
		
		entityManger.addEntity(new Tree4(handler, 1400, 1500));
		entityManger.addEntity(new Tree4(handler, 1400, 1600));
		entityManger.addEntity(new Tree4(handler, 1400, 1450));
		entityManger.addEntity(new Tree4(handler, 1400, 1400));
		entityManger.addEntity(new Tree4(handler, 1400, 1350));
		entityManger.addEntity(new Tree4(handler, 1250, 1400));
		entityManger.addEntity(new Tree4(handler, 1200, 1600));
		
		entityManger.addEntity(new Tree1(handler, 1000, 350));
		entityManger.addEntity(new Tree1(handler, 500, 500));
		entityManger.addEntity(new Tree1(handler, 500, 350));
		entityManger.addEntity(new Tree1(handler, 350, 700));
		entityManger.addEntity(new Tree1(handler, 500, 1200));
		entityManger.addEntity(new Tree1(handler, 1100, 800));
		entityManger.addEntity(new Tree1(handler, 1200, 900));
		entityManger.addEntity(new Tree1(handler, 1250, 800));
		entityManger.addEntity(new Tree1(handler, 1250, 1100));
		entityManger.addEntity(new Tree1(handler, 1250, 1200));
		entityManger.addEntity(new Tree1(handler, 700, 1400));
		entityManger.addEntity(new Tree1(handler, 800, 1400));
		entityManger.addEntity(new Tree1(handler, 850, 1430));
	
		

		
		entityManger.addEntity(new House4(handler, 1200, 1450));
		
		
		entityManger.addEntity(new House2(handler, 250, 1400));
		
		entityManger.addEntity(new rock1(handler, 460, 80));
		entityManger.addEntity(new rock1(handler, 410, 10));
		entityManger.addEntity(new rock1(handler, 810, 80));
		entityManger.addEntity(new rock1(handler, 870, 10));
		entityManger.addEntity(new rock1(handler, 670, 110));
		entityManger.addEntity(new rock2(handler, 590, 200));
		
		entityManger.addEntity(new monster2(handler, 900, 400));
		entityManger.addEntity(new Monster3(handler, 400, 500));
		entityManger.addEntity(new Monster4(handler, 500, 1000));
		entityManger.addEntity(new Monster5(handler, 900, 1300));

		
		
		
		loadWorld(path);
		
		entityManger.getPlayer().setX(spawnX);
		entityManger.getPlayer().setY(spawnY);
//		
//		entityManger.getMonster().setX(400);
//		entityManger.getMonster().setY(400);
	}
	public void tick() {
		entityManger.tick();
		itemManager.tick();
	}
	
	public void render(Graphics g) {
		int xStart = (int)Math.max(0, handler.getGameCamera().getxOffset()/Tile.TILEWIDTH );
		int xEnd = (int)Math.min(width, (handler.getGameCamera().getxOffset() + handler.getWidth())/Tile.TILEWIDTH +1);
		int yStart = (int)Math.max(0, handler.getGameCamera().getyOffset()/Tile.TILEHEIGHT );;
		int yEnd = (int)Math.min(height, (handler.getGameCamera().getyOffset() + handler.getHeight())/Tile.TILEHEIGHT +1);
		for(int y = yStart; y < yEnd; y++) {
			for(int x = xStart; x < xEnd; x++) {
				getTile(x, y).render(g, (int)(x * Tile.TILEWIDTH - handler.getGameCamera().getxOffset()), 
						(int)(y *Tile.TILEHEIGHT - handler.getGameCamera().getyOffset()));
			}
		}
		//items
		itemManager.render(g);
		// entities
		entityManger.render(g);
	}
	  
	public Handler getHandler() {
		return handler;
	}
	public void setHandler(Handler handler) {
		this.handler = handler;
	}
	public ItemManager getItemManager() {
		return itemManager;
	}
	public void setItemManager(ItemManager itemManager) {
		this.itemManager = itemManager;
	}
	public Tile getTile(int x, int y) {
		
		if(x < 0 || y < 0 || x >= width || y >= height)
			return Tile.grassTile;
		Tile t = Tile.tiles[tiles[x][y]];
		if(t == null) {
			return Tile.dirtTile;
		}
		return t;
	}
	private void loadWorld(String path) {
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles = new int[width][height];
		for(int y = 0; y < height; y++) {
			for(int x = 0; x < width; x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x+y*width) +4]);
			}
		}
	}
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
}
