package Game.SimpleRPG.tilegame.state;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import Game.SimpleRPG.tilegame.Game;
import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.gfx.Assets;
import Game.SimpleRPG.tilegame.ui.ClickListener;
import Game.SimpleRPG.tilegame.worlds.UIImageBackground;
import Game.SimpleRPG.tilegame.worlds.UIImageButton;
import Game.SimpleRPG.tilegame.worlds.UIManager;

public class MenuState extends State{
	private BufferedImage background;
	public MenuState(Handler handler) {
		super(handler);
		uiManager = new UIManager(handler);
//		UIManager uiManager1 = new UIManager(handler);
		handler.getMouseManager().setUIManager(uiManager);
//		handler.getMouseManager().setUIManager(uiManager1);
		uiManager.addObject(new UIImageButton(1250, 400, 256, 360, Assets.btn_start, new ClickListener() {
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
			}));
//		uiManager1.addObject(new UIImageButton(500, 400, 268, 127, Assets.btn_exit, new ClickListener() {
//			public void onClick() {
//				handler.getMouseManager().setUIManager(null);
//				System.exit(0);
//			}
//			}));
		uiManager.addObject(new UIImageBackground(0, 0, 1536, 800, Assets.background));
		uiManager.addObject(new UIImageButton(1250, 400, 256, 360, Assets.btn_start, new ClickListener() {
			public void onClick() {
				handler.getMouseManager().setUIManager(null);
				State.setState(handler.getGame().gameState);
			}
			}));
//		uiManager1.addObject(new UIImageButton(500, 400, 268, 127, Assets.btn_exit, new ClickListener() {
//			public void onClick() {
//				handler.getMouseManager().setUIManager(null);
//				System.exit(0);
//			}
//			}));
		
	}
	
	public UIManager uiManager;
	
	
	@Override
	public void tick() {
		uiManager.tick();
	}
	@Override
	public void render(Graphics g) {
		uiManager.render(g);
		
	}
	
}
