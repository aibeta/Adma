import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

//import javax.swing.RepaintManager;		//����



public class Background {
	GameStart gs=null;
	Toolkit tool=Toolkit.getDefaultToolkit();

	//��������ͼƬ
	Image background_img0=tool.getImage(GameStart.class.getResource("/background/62.png"));
	Image background_img1=tool.getImage(GameStart.class.getResource("/Image/beijing4.png"));
	Image background_img2=tool.getImage(GameStart.class.getResource("/background/49.png"));
	
	int img_x=0;
	int img_y=0;
	
//	int width=tool.getScreenSize().width;//��ȡ��Ļ��С
//	int height=tool.getScreenSize().height;	//�߶ȺͿ��	
	
	
	
	public Background(GameStart g){
		gs=g;
	}
	
	
	public void P_Paint(Graphics g){
		if (gs.bg_val==0){
		g.drawImage(background_img0,img_x,img_y-50,3200,720,gs);}
		else if(gs.bg_val==1){
			g.drawImage(background_img1,img_x,img_y,3200,720,gs);}
		else if(gs.bg_val==2){
			g.drawImage(background_img2,img_x,img_y,3200,720,gs);}
			
		}		
	
}
