package Game.SimpleRPG.tilegame.entities.statics;


import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.gfx.Animation;
import Game.SimpleRPG.tilegame.gfx.Assets;
import Game.SimpleRPG.tilegame.items.Item;

public class Monster3 extends StaticEntity{
	
	private Animation animaLeft, animaRight;
	public Monster3(Handler handler, float x, float y) {
		super(handler, x, y, 70 , 80);
		bounds.x = 16;
		bounds.y =(int)(height/2);
		bounds.width = width-20;
		bounds.height =(int) (height - height/1.5f);
		
		animaLeft = new Animation(500, Assets.quai3_trai);
		animaRight = new Animation(500, Assets.quai3_phai);

	}

	@Override
	public void tick() {
		animaLeft.tick();
		animaRight.tick();
		if (j2==0) {
			for(int i = (int) x; i >= 200; i--) {
				x = (float) (x - sp);
				if(x < 200) { j2=1;  break;}
			}
		}
		if (j2==1) {
			for(int i = (int) y; i >= 300; i++) {
				y = (float) (y - sp);
				if(y < 300) { j2=2;  break;}				
			}
		}
		if (j2==2) {
			for(int i = (int) x; i <=400; i++) {
				x = (float) (x + sp);
				if(x > 400) { j2=3;  break;}	
			}
		}
		if (j2==3) {
			for(int i = (int) y; i <= 500; i++) {
				y = (float) (y + sp);
				if(y > 500) { j2=0;  break;}	
			}
		}
		
//		for(int i = (int) x; i <= 700; i++) {
//			x = (float) (x + 0.001);
//			if(x == 700) break;
//		}
//		for(int j = (int) y; j >= 300; j--) {
//			y = (float) (y - 0.001);
//			if(y == 300) break;
//				
//			
//		}
		
		
	}

	@Override
	public void render(Graphics g) {
		
//		System.out.println(x);
		
		g.drawImage(getCurrentAnimationFrame(),(int)(x - handler.getGameCamera().getxOffset()), (int)(y - handler.getGameCamera().getyOffset()), width, height, null);
//		g.setColor(Color.red);
//		g.fillRect((int)(x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int)(y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame() {
		if(j2 == 0) {
			return animaLeft.getCurrentFrame();
		}
		if(j2 == 1) {
			return animaRight.getCurrentFrame();
		}
		if(j2 == 2) {
			return animaRight.getCurrentFrame();
		}
		if (j2==3) {
			return animaLeft.getCurrentFrame();
		}
		return null;
		
	}

	@Override
	public void die() {
		handler.getWorld().getItemManager().addItem(Item.rockItem.createNew((int)x,(int) y));
		
	}
	
}
