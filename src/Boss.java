//import java.awt.Color;	  //第三处修改
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;


public class Boss {
	//Image temp = img;
	Toolkit tool = Toolkit.getDefaultToolkit();
	Image img = tool.getImage(GameStart.class.getResource("/Boss_FW/斧王左.gif"));			//左走
	Image img3 = tool.getImage(GameStart.class.getResource("/Boss_FW/斧王右.gif"));			//右走
	Image img1 = tool.getImage(GameStart.class.getResource("/Image/盔甲兵向左OVER.gif"));
	Image img2 = tool.getImage(GameStart.class.getResource("/Boss_FW/斧王左击.gif"));			//左砍
	Image img4 = tool.getImage(GameStart.class.getResource("/Boss_FW/斧王右击.gif"));			//右砍
	Image img5 = tool.getImage(GameStart.class.getResource("/Boss_FW/斧王左死.gif"));
	Random rand = new Random();
	int img_x1 = 500 + rand.nextInt(2300);
	int img_y1 = 400 + rand.nextInt(100);
	
	int Fwrun_x=161;	//FW跑
	int Fwrun_y=135;
	int Fwhit_x=270;	//FW击打
	int Fwhit_y=204;
	int img_x2 = 200; // BOSS大小长宽
	int img_y2 = 200;
	
	Image temp=img;
	int hp=2200;	//BOSS血量
	int time = 0;
	int index = 0;
	int x=0;
	GameStart gs = null;
	
	public Boss(GameStart g) {
		gs = g;
	}
	
	
	public void Paint(Graphics g) {
		

		int t1 = img_x1 + gs.background.img_x;
		int t2 = img_y1 + gs.background.img_y;
	//	int t = rand.nextInt(20);
		
		double m1=t1 - gs.ply.img_x1;	
		double m2=t2 - gs.ply.img_y1;
		//int time=0;
		
		
		if (Math.hypot(m1,m2)>35 && Math.hypot(m1,m2)<500 && t1>=gs.ply.img_x1 && x==0)	//行走判定 怪在人物右边
			{
				if(m1>=m2){
				temp=img;
				img_x1-=1;}
				else if (m1<m2){
				temp=img;
				img_y1-=1;	
				}
			}
		else if (Math.hypot(m1,m2)>35 && Math.hypot(m1,m2)<500 && t1<gs.ply.img_x1 && x==0)	//行走判定
			{
			if(m1<m2){
			temp=img3;
			img_x1+=1;}
			else if (m1>=m2){
			temp=img3;
			img_y1+=1;	
			}
			}
		else if (Math.hypot(m1,m2)<40 && t1>=gs.ply.img_x1 && x==0) //攻击判定 怪在人物右边
			{
			temp = img2;
			if(getbossRect().intersects(gs.ply.getplyRect1()))
			{
				
				if(gs.hb>=0)
				gs.hb--;
				if(gs.hb%100==0){
					gs.music.playSound("music/wound.MP3");
				}
				
			}
			}
		else if (Math.hypot(m1,m2)<40 && t1<gs.ply.img_x1 && x==0) //攻击判定 怪在人物左边
			{
			temp = img4;
			
			if(getbossRect().intersects(gs.ply.getplyRect1()))
			{	
				if(gs.hb>=0)
				gs.hb--;
				if(gs.hb%100==0){
					gs.music.playSound("music/wound.MP3");
				}
			}
			}
		
		//人物打中怪
		if (getbossRect().intersects(gs.ply.getplyRect())) {
			
			
				if(hp>0)
					{hp-=10;}			//英雄每攻击一下 BOSS减少的血量
			
					if (hp==0){
						time++;
						x++;
						temp=img5;
						gs.m=8;
						}
			
			
		}
			

			
		if (temp==img || temp==img3){
				g.drawImage(temp, img_x1 + gs.background.img_x, img_y1
						+ gs.background.img_y-100, Fwrun_x, Fwrun_y, gs);
				}
		else if ( temp==img2 ){				
			g.drawImage(temp, img_x1 + gs.background.img_x, img_y1
					+ gs.background.img_y-100, Fwhit_x, Fwhit_y , gs);
			}
		else if ( temp==img4 ){				//CHAOYOU砍-40
			g.drawImage(temp, img_x1 + gs.background.img_x, img_y1
					+ gs.background.img_y-100, Fwhit_x, Fwhit_y, gs);
			}
		else if (temp==img5)
		{
			
			g.drawImage(temp, img_x1 + gs.background.img_x, img_y1
					+ gs.background.img_y, img_x2, img_y2, gs);
		}
		
		
	}
	public Rectangle getbossRect() {

			return new Rectangle(img_x1 + gs.background.img_x, img_y1
					+ gs.background.img_y, 200, 200);
		}
}
