package Game.SimpleRPG.tilegame.entities.statics;

import java.awt.Color;
import java.awt.Graphics;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.gfx.Assets;
import Game.SimpleRPG.tilegame.items.Item;

import Game.SimpleRPG.tilegame.tiles.Tile;

public class Tree1 extends StaticEntity{
	public Tree1(Handler handler, float x, float y) {
		super(handler, x, y, 64 , 98 );
		bounds.x = 8;
		bounds.y =(int)(height/2);
		bounds.width = width-20;
		bounds.height =(int) (height - height/1.5f);
	}

	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		int i = 0;
//		for(i = )
		g.drawImage(Assets.tree1,(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}

	@Override
	public void die() {
		handler.getWorld().getItemManager().addItem(Item.woodItem.createNew((int)x,(int) y));
		
	}
}
