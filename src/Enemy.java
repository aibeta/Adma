import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Random;

public class Enemy {
	Toolkit tool = Toolkit.getDefaultToolkit();

	// ���ͼƬ ���Զ�λ ***
	// Image img = tool.getImage("D:\\2.jpg");

	// ��Զ�λ ****
	Image walk_l[] = {
			tool.getImage(GameStart.class.getResource("/Image/���ױ���������.gif")),
			tool.getImage(GameStart.class.getResource("/Enemy_maobing/ì����.gif"))
			};
	Image walk_r[] = {
			tool.getImage(GameStart.class.getResource("Image/���ױ���������.gif")),
			tool.getImage(GameStart.class.getResource("/Enemy_maobing/ì����.gif"))
			};
	Image hit_l[] = {
			tool.getImage(GameStart.class.getResource("/Image/���ױ����󹥻�.gif")),
			tool.getImage(GameStart.class.getResource("/Enemy_maobing/ì���.gif"))
			};
	Image hit_r[] = {
			tool.getImage(GameStart.class.getResource("/Image/���ױ����ҹ���.gif")),
			tool.getImage(GameStart.class.getResource("/Enemy_maobing/ì�Ҵ�.gif"))
			};
	Image die_l[] = {
			tool.getImage(GameStart.class.getResource("/Enemy_1/���ױ���OVER4.png")),
			tool.getImage(GameStart.class.getResource("/Enemy_1/���ױ���OVER4.png"))
			};
	Image die_r[] = {
			tool.getImage(GameStart.class.getResource("/Enemy_1/���ױ���OVER4.png")),
			tool.getImage(GameStart.class.getResource("/Enemy_1/���ױ���OVER4.png"))
			};
			
	
	Random rand = new Random();
	int img_x1 = 500 + rand.nextInt(2300);
	int img_x3 = 500 + rand.nextInt(2300);
	int img_y1 = 300 + rand.nextInt(200);
	int img_y3 = 300 + rand.nextInt(200);
	private int E_x[]={img_x1,img_x3};			//���ֱ���������Ҫ���������
	private int E_y[]={img_y1,img_y3};
	 int Ex=0;				//�������
	 int Ey=0;

	int size_x[] = {68,100};
	int size_y[] = {72,100};


	int enemy_zt=0;	//���Ƶ���״̬ 0��ʾ��  1��ʾ��
	int emy_val=0;	//��������
	
	Image temp = walk_l[emy_val];
	int time = 0;
	int index = 0;
	int t = 0;
	int hp=40;
	int x=0; //�����Ƿ����ܹ���
	GameStart gs = null;

	public Enemy(GameStart g) {
		gs = g;
	}
	
	//�߳�
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
		
		if (Math.hypot(m1,m2)>20 && Math.hypot(m1,m2)<500 && t1>=gs.ply.img_x1 && x==0)	//�����ж� ���������ұ�
		{
			if(m1>=m2){
			temp=walk_l[emy_val];
			E_x[Ex]-=1;}
			else if (m1<m2){
			temp=walk_l[emy_val];
			E_y[Ey]-=1;	
			}
		}
		else if (Math.hypot(m1,m2)>20 && Math.hypot(m1,m2)<500 && t1<gs.ply.img_x1 && x==0)	//�����ж�
		{
			if(m1<m2){
			temp=walk_r[emy_val];
			E_x[Ex]+=1;}
			else if (m1>=m2){
			temp=walk_r[emy_val];
			E_y[Ey]+=1;	
			}
		}
		else if (Math.hypot(m1,m2)<20 && t1>=gs.ply.img_x1 && x==0) //�����ж� ���������ұ�
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
		else if (Math.hypot(m1,m2)<20 && t1<gs.ply.img_x1 && x==0) //�����ж� �����������
		{
			temp = hit_r[emy_val];
			if(getbenemyRect().intersects(gs.ply.getplyRect1()))
			{
				if(gs.hb>=0)
				gs.hb-=10;
			}
		}
		
		
		//������й�
		if (getbenemyRect().intersects(gs.ply.getplyRect())) {
			
			
			if(hp>0)
				{hp-=4;
				}
		}
		if (hp==0){
				enemy_zt=1;
				gs.cout++;
			if(m1<m2){			//���������ұ�
				temp=die_r[emy_val];
				}
			
			else if (m1>=m2){	//�����������
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
