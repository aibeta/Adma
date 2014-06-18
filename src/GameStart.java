import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Random;

									//继承窗体框架
public class GameStart extends Frame {

	//创建窗体工具类Toolkit；
	
	Toolkit tool=Toolkit.getDefaultToolkit();
	
	
	Image Heroxueliang[] = {
			tool.getImage(GameStart.class.getResource("/Hero/13.png")),
			tool.getImage(GameStart.class.getResource("/Hero/12.png")),
			tool.getImage(GameStart.class.getResource("/Hero/11.png")),
			tool.getImage(GameStart.class.getResource("/Hero/10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/1.png"))};
	
	Image FWxueliang[] = {
			tool.getImage(GameStart.class.getResource("/Boss_FW/23.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/22.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/21.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/20.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/19.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/18.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/17.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/16.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/15.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/14.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/13.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/12.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/11.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/10.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/9.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/8.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/7.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/6.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/5.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/4.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/3.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/2.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/1.png")),
			tool.getImage(GameStart.class.getResource("/Boss_FW/0.png"))};
	Image vedio[] = {
	tool.getImage(GameStart.class.getResource("/background/42.png")),
	tool.getImage(GameStart.class.getResource("/background/43.png"))};
	
	
	Image Game_begin=tool.getImage(GameStart.class.getResource("/Image/beijing11.png"));
	Image Game_over=tool.getImage(GameStart.class.getResource("/Image/死亡.png"));
	Image door=tool.getImage(GameStart.class.getResource("/Image/doorred.png"));
	Image help=tool.getImage(GameStart.class.getResource("/Image/help.png"));
	Image Game_win=tool.getImage(GameStart.class.getResource("/Image/shengli.png"));
	//创建缓冲图片
	int m=0; //游戏状态 0表示准备界面 1表示开始 3表示死亡		8表示获胜
			 //90表示播放动画
	
	int vedio_ct=0;// 动画帧数控制
	
	
	Image hc_img= null;
	MediaTracker mt = new MediaTracker(this);
	Player ply= new Player(this);
	Background background =new Background(this);
	
	GameSound music = new GameSound();
	
	Random rand = new Random();
	
	Enemy emy= new Enemy(this);
//	Enemy emy1 = new Enemy(this);
	ArrayList emy_list=new ArrayList();
//	ArrayList emy_list1=new ArrayList();
	
	int hb=1000;//英雄血量
	int bg_val=1;
	int cout=0;
	int emy_type = 0; //小兵类型 0表示小兵 1表示矛兵
	int control_val=0;	//记录当前关卡
	int q= hb/100;

	Boss boss =new Boss(this);
	
	
	
	public void showwindow(){
//			if	(m==0){
//			music.playBgSound("music/背景.MP3");}
//			else music.playBgSound("music/开场.MP3");

			try {
				//添加
				mt.addImage(vedio[1],90);		//添加 动画
				mt.addImage(vedio[0],91);
				
				for(int i=0;i<10;i++)
					{mt.addImage(ply.youkan[i],1);}//右砍
				for(int i=0;i<10;i++)
				{mt.addImage(ply.zuokan[i],2);}	//左砍
				for (int i=0;i<9;i++)
					{mt.addImage(ply.zuoci[i], 3);}//左刺
				
				for (int i=0;i<9;i++)				//右刺
					{mt.addImage(ply.youci[i], 4);}
				
				for(int i=0;i<9;i++)
					{mt.addImage(ply.youdazhao[i], 5);}//右半月
				
				for(int i=0;i<9;i++)
				{mt.addImage(ply.zuodazhao[i], 6);}//左半月
				
				for (int i=0;i<11;i++)
				{mt.addImage(Heroxueliang[i],7);}	//英雄血量
				

				mt.addImage(Game_win,10);//胜利
				mt.addImage(background.background_img0,0);//背景1
				mt.addImage(background.background_img1,9);//背景2
				mt.waitForID(0);
				mt.waitForID(1);
				mt.waitForID(2);
				mt.waitForID(3);
				mt.waitForID(4);
				mt.waitForID(5);
				mt.waitForID(6);
				mt.waitForID(7);
				mt.waitForID(9);
				mt.waitForID(10);
				mt.waitForID(90);
				mt.waitForID(91);
				
				
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		
		
		//创建线程对象
		MyThread my=new MyThread();
		//启动线程
		my.start();
		
		int x1=600;
		int y1=500;
		
		setSize(x1, y1);
				//图标
		setTitle("Winter is coming.");
									//设置窗体是否显示
		setVisible(true);
		
		Toolkit tool=Toolkit.getDefaultToolkit();	
		int width=tool.getScreenSize().width;//获取屏幕大小
		int height=tool.getScreenSize().height;	//高度和宽度	
		
		//设置窗体位置
		setLocation((width-x1)/2, (height-y1)/2);		//x,y	
		//配置窗体的关闭监听器
		addWindowListener(
				//匿名类
				new WindowAdapter() {
					//窗体关闭中
					@Override
					public void windowClosing(WindowEvent e) {
						//退出应用程序
						System.exit(0);
					}
					
				}
		);
		//配置键盘监听器
		 addKeyListener  (
			new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					ply.Key_Pressed(e);
					if (e.getKeyCode()==KeyEvent.VK_ENTER && m==0)
					{m=1;
					music.playBgSound("music/开场.MP3");
					}
					else if (e.getKeyCode()==KeyEvent.VK_ESCAPE  &&  m==0)
					{System.exit(0);}
					else if (e.getKeyCode()==KeyEvent.VK_ESCAPE  &&  m==9)
					{m=0;}
					else if(e.getKeyCode()==KeyEvent.VK_ENTER && m==3)//死亡界面满血复活
					{
						if (control_val == 0){
						m=1;
						hb=1000;}
						else if (control_val == 1)
						{
							m=4;
							hb=1000;
						}
					}
					else if(e.getKeyCode()==KeyEvent.VK_ESCAPE && m==3)//死亡界面退出
					{System.exit(0);}
					else if (e.getKeyCode()== KeyEvent.VK_F1)
					{m=4;}//ply.Move(e);
					else if (e.getKeyCode()==KeyEvent.VK_F9 && m==0){
						m=9;
					}
					else if (e.getKeyCode()==KeyEvent.VK_ESCAPE && m==8){	//胜利界面
						System.exit(0);
					}
					else if (e.getKeyCode()==KeyEvent.VK_F2 && m==0){	//测试界面
						m=1000;
						
					}
				}
				@Override
				public void keyReleased(KeyEvent key) {
					
						ply.Key_Released(key);	
				}
				
			});

			
				
		
		this.setResizable(false); // 窗口大小不可改变
		this.setVisible(true);
	}
	
	
	//更新窗体实现双缓冲
	//窗体画笔Graphics g update方法是窗体地方法
	//Graphics hc_g 缓冲图片的画笔
	@Override
	public void update(Graphics g) {
	//	if(hc_img == null){
			hc_img = createImage(getWidth(),getHeight());//与窗体同大小的缓冲图片
			//	}
		//得到缓冲图片的画笔
		Graphics hc_g = hc_img.getGraphics();
		
		//修改画笔颜色
		hc_g.setColor(Color.white);
		//清空窗体图像
		hc_g.fillRect(0,0,getWidth(), getHeight());
		//使用缓冲画笔调用paint方法
		paint(hc_g);
		//把缓冲图片画在窗体上
		g.drawImage(hc_img,0,0,this);
	}
	
	int time=0;
	//重写窗体绘画方法 Graphics 画笔
	//@Override
	public void paint(Graphics g) {
		//hb=1000;
		if (m==0){	//游戏开始
		
		g.drawImage(Game_begin,0,0,600,500,this);
		}
		
		//这是第一幕小怪控制
	else if (m==1){						//画第一幕小怪
		bg_val=0;						//背景图选取0号
		background.P_Paint(g);		
		
		
		for(int i=0;i<emy_list.size();i++){
			//
			Enemy emy=(Enemy) emy_list.get(i);
				emy.Ex=0;
				emy.Ey=0;
			emy.emy_val = 0;
			//
			emy.Paint(g);
			
			//System.out.println(111111);
		//	System.out.println("gs.backgroundx"+background.img_x);
		//	System.out.println("gs.backgroundy"+background.img_y);
			}
/*		for(int j=0;j<emy_list.size();j++){
				//
				Enemy emy1=(Enemy) emy_list1.get(j);
				emy1.Ex=1;
				emy1.Ey=1;
				emy1.emy_val = 1;
				//
				emy1.Paint(g);
				System.out.println(2222);
			//	System.out.println("emy1.img_x1"+emy1.img_x1);
			//	System.out.println("emy1.img_y1"+emy1.img_y1);
		}*/
	
		int q= hb/100;
		if(q>0){
		g.drawImage(Heroxueliang[10-q],15,30,123,42,this);
		}
		else {
			m=3;
			g.drawImage(Heroxueliang[11],15,30,123,42,this);
		}
		ply.P_Paint(g);
		ply.move();
		
		if(emy_list.size()<5 && cout<5 ){ //&& emy_list1.size()<20
			if(time >= 100)
			{
				Enemy  emy = new  Enemy(this);
				emy_list.add(emy);
				
	//			Enemy emy1 = new Enemy(this);
	//			emy_list1.add(emy);
				time =0;
			}
			}
		else if(cout==5){
			
			control_val=1;
			m=4;
			background.img_x=0;
			background.img_y=0;
			hb=1000;
			}
		}
	else if (m==4){		//画BOSS 
		
		bg_val=1;
		background.P_Paint(g);		//画背景
		
		
		int p= hb/100;
		if(p>0){
		g.drawImage(Heroxueliang[10-p],15,30,123,42,this);
		}
		else {
			m=3;
			g.drawImage(Heroxueliang[11],15,30,123,42,this);
		}
		
		int q= boss.hp/100;
		if(q>0){
		g.drawImage(FWxueliang[22-q],400,30,195,46,this);
		}
		else {
			//m=3;
			g.drawImage(FWxueliang[23],400,30,195,46,this);
		}
		
		boss.Paint(g);
		
		ply.P_Paint(g);
		ply.move();
			
			}
		
		else if(m==3)// 游戏结束
		{
			g.drawImage(Game_over,0,0,600,500,this);
		}
		else if(m==8)// 游戏结束
		{
			g.drawImage(Game_win,0,0,600,500,this);
		}
		else if(m==9)// 游戏结束
		{
			g.drawImage(help,0,0,600,500,this);
		}
		else if (m==90){
			g.drawImage(vedio[vedio_ct],0,0,600,500,this);
		}

	}

	class MyThread extends Thread{
		@Override
		public void run() {
			//不停地重绘窗体
			while(true){
			//if (m==0) {
				try {
					Thread.sleep(10);	//线程休眠 1000ms
				//定时器增加
					time++;
					
				} catch (Exception e) {	
				}
		
				repaint();
			}
//			else if (m==90){
//				try {
//					Thread.sleep(2000);	//线程休眠 1000ms
//				//定时器增加
//					vedio_ct++;
//					
//				} catch (Exception e) {	
//				}
//		
//				repaint();
//			}
			
		}
	}
	
	public static void main(String[] args) {
		GameStart GS=new GameStart();
		GS.showwindow();
	}

}
