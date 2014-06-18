import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;

public class Enemy {
	Toolkit tool = Toolkit.getDefaultToolkit();

	// 获得图片 绝对定位 ***
	// Image img = tool.getImage("D:\\2.jpg");

	// 相对定位 ****
	Image walk_l[] = {
			tool.getImage(GameStart.class.getResource("/Image/盔甲兵向左行走.gif")),
			tool.getImage(GameStart.class.getResource("/Enemy_maobing/矛左走.gif"))
			};
	Image walk_r[] = {
			tool.getImage(GameStart.class.getResource("Image/盔甲兵向右行走.gif")),
			tool.getImage(GameStart.class.getResource("/Enemy_maobing/矛右走.gif"))
			};
	Image hit_l[] = {
			tool.getImage(GameStart.class.getResource("/Image/盔甲兵向左攻击.gif")),
			tool.getImage(GameStart.class.getResource("/Enemy_maobing/矛左刺.gif"))
			};
	Image hit_r[] = {
			tool.getImage(GameStart.class.getResource("/Image/盔甲兵向右攻击.gif")),
			tool.getImage(GameStart.class.getResource("/Enemy_maobing/矛右刺.gif"))
			};
	Image die_l[] = {
			tool.getImage(GameStart.class.getResource("/Enemy_1/盔甲兵左OVER4.png")),
			tool.getImage(GameStart.class.getResource("/Enemy_1/盔甲兵左OVER4.png"))
			};
	Image die_r[] = {
			tool.getImage(GameStart.class.getResource("/Enemy_1/盔甲兵右OVER4.png")),
			tool.getImage(GameStart.class.getResource("/Enemy_1/盔甲兵右OVER4.png"))
			};
			
	
	Random rand = new Random();
	int img_x1 = 500 + rand.nextInt(2300);
	int img_x3 = 500 + rand.nextInt(2300);
	int img_y1 = 300 + rand.nextInt(200);
	int img_y3 = 300 + rand.nextInt(200);
	private int E_x[]={img_x1,img_x3};			//两种兵的坐标需要两个随机数
	private int E_y[]={img_y1,img_y3};
	 int Ex=0;				//数组控制
	 int Ey=0;

	int size_x[] = {68,100};
	int size_y[] = {72,100};


	int enemy_zt=0;	//控制敌人状态 0表示活  1表示死
	int emy_val=0;	//敌人种类
	
	Image temp = walk_l[emy_val];
	int time = 0;
	int index = 0;
	int t = 0;
	int hp=40;
	int x=0; //控制是否遭受攻击
	GameStart gs = null;

	public Enemy(GameStart g) {
		gs = g;
	}
	
	//线程
	public void Paint(Graphics g) {
		if (enemy_zt==0){
		int t1 = E_x[Ex] + gs.background.img_x;
		int t2 = E_y[Ey] + gs.background.img_y;
		//int t = rand.nextInt(20);
		
		double m1=t1 - gs.ply.img_x1;
		double m2=t2 - gs.ply.img_y1;
		
		g.setColor(Color.CYAN);
		g.drawRect(t1, t2, 40, 3);
		g.fillRect(t1, t2, hp, 3);
		
		if (Math.hypot(m1,m2)>20 && Math.hypot(m1,m2)<500 && t1>=gs.ply.img_x1 && x==0)	//行走判定 怪在人物右边
		{
			if(m1>=m2){
			temp=walk_l[emy_val];
			E_x[Ex]-=1;}
			else if (m1<m2){
			temp=walk_l[emy_val];
			E_y[Ey]-=1;	
			}
		}
		else if (Math.hypot(m1,m2)>20 && Math.hypot(m1,m2)<500 && t1<gs.ply.img_x1 && x==0)	//行走判定
		{
			if(m1<m2){
			temp=walk_r[emy_val];
			E_x[Ex]+=1;}
			else if (m1>=m2){
			temp=walk_r[emy_val];
			E_y[Ey]+=1;	
			}
		}
		else if (Math.hypot(m1,m2)<20 && t1>=gs.ply.img_x1 && x==0) //攻击判定 怪在人物右边
		{
			temp = hit_l[emy_val];
			if(getbenemyRect().intersects(gs.ply.getplyRect1()))
			{
				if(gs.hb>=0)
				gs.hb-=10;
				if(gs.hb%100==0){
					//gs.music.playSound("music/wound.MP3");
				}
			}
		}
		else if (Math.hypot(m1,m2)<20 && t1<gs.ply.img_x1 && x==0) //攻击判定 怪在人物左边
		{
			temp = hit_r[emy_val];
			if(getbenemyRect().intersects(gs.ply.getplyRect1()))
			{
				if(gs.hb>=0)
				gs.hb-=10;
			}
		}
		
		
		//人物打中怪
		if (getbenemyRect().intersects(gs.ply.getplyRect())) {
			
			
			if(hp>0)
				{hp-=4;
				}
		}
		if (hp==0){
				enemy_zt=1;
				gs.cout++;
			if(m1<m2){			//怪在人物右边
				temp=die_r[emy_val];
				}
			
			else if (m1>=m2){	//怪在人物左边
				temp=die_l[emy_val];
					
				}	
		}
		}	
			
		if (temp==walk_l[emy_val] || temp==walk_r[emy_val]){
			
				g.drawImage(temp, E_x[Ex] + gs.background.img_x, E_y[Ey]
						+ gs.background.img_y, size_x[Ex], size_x[Ey], gs);
				}
		else if (temp==hit_l[emy_val] || temp==hit_r[emy_val] ){
			g.drawImage(temp, E_x[Ex] + gs.background.img_x, E_y[Ey]
					+ gs.background.img_y, size_x[Ex], size_x[Ey], gs);
			}
		else if (temp==die_l[emy_val] || temp == die_r[emy_val])
		{
			
			g.drawImage(temp, E_x[Ex] + gs.background.img_x, E_y[Ey]
					+ gs.background.img_y, size_x[Ex], size_x[Ey], gs);
		}
		
	
	}
	public Rectangle getbenemyRect() {

		return new Rectangle(E_x[Ex] + gs.background.img_x, E_y[Ey]
				+ gs.background.img_y, 68, 72);
	}
}
