package Game.SimpleRPG.tilegame.entities.statics;


import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Game.SimpleRPG.tilegame.Handler;
import Game.SimpleRPG.tilegame.gfx.Animation;
import Game.SimpleRPG.tilegame.gfx.Assets;
import Game.SimpleRPG.tilegame.items.Item;

public class Monster4 extends StaticEntity{
	
	private Animation animaLeft, animaRight;
	public Monster4(Handler handler, float x, float y) {
		super(handler, x, y, 70 , 80);
		bounds.x = 16;
		bounds.y =(int)(height/2);
		bounds.width = width-20;
		bounds.height =(int) (height - height/1.5f);
		
		animaLeft = new Animation(500, Assets.quai4_trai);
		animaRight = new Animation(500, Assets.quai4_phai);

	}

	@Override
	public void tick() {
		animaLeft.tick();
		animaRight.tick();
		
		if (j3==0) {
			for(int i = (int) x; i <= 700; i--) {
				x = (float) (x + sp);
				if(x > 700) { j3=1;  break;}
			}
		}
		if (j3==1) {
			for(int i = (int) y; i >= 800; i++) {
				y = (float) (y - sp);
				if(y <801) { j3=2;  break;}				
			}
		}
		if (j3==2) {
			for(int i = (int) x; i >=500; i++) {
				x = (float) (x - sp);
				if(x <500) { j3=3;  break;}	
			}
		}
		if (j3==3) {
			for(int i = (int) y; i <= 1000; i++) {
				y = (float) (y + sp);
				if(y < 1000) { j3=0;  break;}	
			}
		}
		System.out.println(x);
		System.out.println(y);
		System.out.println(j2);
		
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
		if(j3 == 0) {
			return animaLeft.getCurrentFrame();
		}
		if(j3 == 1) {
			return animaRight.getCurrentFrame();
		}
		if(j3 == 2) {
			return animaRight.getCurrentFrame();
		}
		if (j3==3) {
			return animaLeft.getCurrentFrame();
		}
		return null;
		
	}

	@Override
	public void die() {
		handler.getWorld().getItemManager().addItem(Item.buaItem.createNew((int)x,(int) y));
		
	}
	
}
