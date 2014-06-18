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

									//�̳д�����
public class GameStart extends Frame {

	//�������幤����Toolkit��
	
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
	Image Game_over=tool.getImage(GameStart.class.getResource("/Image/����.png"));
	Image door=tool.getImage(GameStart.class.getResource("/Image/doorred.png"));
	Image help=tool.getImage(GameStart.class.getResource("/Image/help.png"));
	Image Game_win=tool.getImage(GameStart.class.getResource("/Image/shengli.png"));
	//��������ͼƬ
	int m=0; //��Ϸ״̬ 0��ʾ׼������ 1��ʾ��ʼ 3��ʾ����		8��ʾ��ʤ
			 //90��ʾ���Ŷ���
	
	int vedio_ct=0;// ����֡������
	
	
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
	
	int hb=1000;//Ӣ��Ѫ��
	int bg_val=1;
	int cout=0;
	int emy_type = 0; //С������ 0��ʾС�� 1��ʾì��
	int control_val=0;	//��¼��ǰ�ؿ�
	int q= hb/100;

	Boss boss =new Boss(this);
	
	
	
	public void showwindow(){
//			if	(m==0){
//			music.playBgSound("music/����.MP3");}
//			else music.playBgSound("music/����.MP3");

			try {
				//���
				mt.addImage(vedio[1],90);		//��� ����
				mt.addImage(vedio[0],91);
				
				for(int i=0;i<10;i++)
					{mt.addImage(ply.youkan[i],1);}//�ҿ�
				for(int i=0;i<10;i++)
				{mt.addImage(ply.zuokan[i],2);}	//��
				for (int i=0;i<9;i++)
					{mt.addImage(ply.zuoci[i], 3);}//���
				
				for (int i=0;i<9;i++)				//�Ҵ�
					{mt.addImage(ply.youci[i], 4);}
				
				for(int i=0;i<9;i++)
					{mt.addImage(ply.youdazhao[i], 5);}//�Ұ���
				
				for(int i=0;i<9;i++)
				{mt.addImage(ply.zuodazhao[i], 6);}//�����
				
				for (int i=0;i<11;i++)
				{mt.addImage(Heroxueliang[i],7);}	//Ӣ��Ѫ��
				

				mt.addImage(Game_win,10);//ʤ��
				mt.addImage(background.background_img0,0);//����1
				mt.addImage(background.background_img1,9);//����2
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
		
		
		
		//�����̶߳���
		MyThread my=new MyThread();
		//�����߳�
		my.start();
		
		int x1=600;
		int y1=500;
		
		setSize(x1, y1);
				//ͼ��
		setTitle("Winter is coming.");
									//���ô����Ƿ���ʾ
		setVisible(true);
		
		Toolkit tool=Toolkit.getDefaultToolkit();	
		int width=tool.getScreenSize().width;//��ȡ��Ļ��С
		int height=tool.getScreenSize().height;	//�߶ȺͿ��	
		
		//���ô���λ��
		setLocation((width-x1)/2, (height-y1)/2);		//x,y	
		//���ô���Ĺرռ�����
		addWindowListener(
				//������
				new WindowAdapter() {
					//����ر���
					@Override
					public void windowClosing(WindowEvent e) {
						//�˳�Ӧ�ó���
						System.exit(0);
					}
					
				}
		);
		//���ü��̼�����
		 addKeyListener  (
			new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					ply.Key_Pressed(e);
					if (e.getKeyCode()==KeyEvent.VK_ENTER && m==0)
					{m=1;
					music.playBgSound("music/����.MP3");
					}
					else if (e.getKeyCode()==KeyEvent.VK_ESCAPE  &&  m==0)
					{System.exit(0);}
					else if (e.getKeyCode()==KeyEvent.VK_ESCAPE  &&  m==9)
					{m=0;}
					else if(e.getKeyCode()==KeyEvent.VK_ENTER && m==3)//����������Ѫ����
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
					else if(e.getKeyCode()==KeyEvent.VK_ESCAPE && m==3)//���������˳�
					{System.exit(0);}
					else if (e.getKeyCode()== KeyEvent.VK_F1)
					{m=4;}//ply.Move(e);
					else if (e.getKeyCode()==KeyEvent.VK_F9 && m==0){
						m=9;
					}
					else if (e.getKeyCode()==KeyEvent.VK_ESCAPE && m==8){	//ʤ������
						System.exit(0);
					}
					else if (e.getKeyCode()==KeyEvent.VK_F2 && m==0){	//���Խ���
						m=1000;
						
					}
				}
				@Override
				public void keyReleased(KeyEvent key) {
					
						ply.Key_Released(key);	
				}
				
			});

			
				
		
		this.setResizable(false); // ���ڴ�С���ɸı�
		this.setVisible(true);
	}
	
	
	//���´���ʵ��˫����
	//���廭��Graphics g update�����Ǵ���ط���
	//Graphics hc_g ����ͼƬ�Ļ���
	@Override
	public void update(Graphics g) {
	//	if(hc_img == null){
			hc_img = createImage(getWidth(),getHeight());//�봰��ͬ��С�Ļ���ͼƬ
			//	}
		//�õ�����ͼƬ�Ļ���
		Graphics hc_g = hc_img.getGraphics();
		
		//�޸Ļ�����ɫ
		hc_g.setColor(Color.white);
		//��մ���ͼ��
		hc_g.fillRect(0,0,getWidth(), getHeight());
		//ʹ�û��廭�ʵ���paint����
		paint(hc_g);
		//�ѻ���ͼƬ���ڴ�����
		g.drawImage(hc_img,0,0,this);
	}
	
	int time=0;
	//��д����滭���� Graphics ����
	//@Override
	public void paint(Graphics g) {
		//hb=1000;
		if (m==0){	//��Ϸ��ʼ
		
		g.drawImage(Game_begin,0,0,600,500,this);
		}
		
		//���ǵ�һĻС�ֿ���
	else if (m==1){						//����һĻС��
		bg_val=0;						//����ͼѡȡ0��
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
	else if (m==4){		//��BOSS 
		
		bg_val=1;
		background.P_Paint(g);		//������
		
		
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
		
		else if(m==3)// ��Ϸ����
		{
			g.drawImage(Game_over,0,0,600,500,this);
		}
		else if(m==8)// ��Ϸ����
		{
			g.drawImage(Game_win,0,0,600,500,this);
		}
		else if(m==9)// ��Ϸ����
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
			//��ͣ���ػ洰��
			while(true){
			//if (m==0) {
				try {
					Thread.sleep(10);	//�߳����� 1000ms
				//��ʱ������
					time++;
					
				} catch (Exception e) {	
				}
		
				repaint();
			}
//			else if (m==90){
//				try {
//					Thread.sleep(2000);	//�߳����� 1000ms
//				//��ʱ������
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
