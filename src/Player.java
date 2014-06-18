import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Player{

	Toolkit tool = Toolkit.getDefaultToolkit();

	// ���ͼƬ ���Զ�λ ***
	// Image img = tool.getImage("D:\\2.jpg");
	
	Image youci_img[]=null;

	// ��Զ�λ ****
	Image img0 = tool.getImage(GameStart.class
			.getResource("/Image/standright.png"));// ����ʱ
	Image img1 = tool.getImage(GameStart.class
			.getResource("/Image/standleft.png"));// �󲻶�
	Image img2 = tool.getImage(GameStart.class
			.getResource("/Image/standright.png"));// �Ҳ���
	Image img3 = tool.getImage(GameStart.class.getResource("/Image/left.gif"));// ����ʱ
	Image img4 = tool.getImage(GameStart.class.getResource("/Image/right.gif"));// ����ʱ
	Image img5 = tool.getImage(GameStart.class
			.getResource("/Image/pingkan.gif"));// ��ƽ��
	Image img6 = tool.getImage(GameStart.class
			.getResource("/Image/youpingkan.gif"));// ��ƽ��
	Image img7 = tool.getImage(GameStart.class.getResource("/Image/zuoci.gif"));// ���
	Image img8 = tool.getImage(GameStart.class.getResource("/Image/youci.gif"));// �Ҵ�
	Image img9 =  tool.getImage(GameStart.class.getResource("/Image/youpingkan5.png"));
	Image img10;
	Image youkan[] = {
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/youpingkan10.png"))};
	Image zuokan[] = {
			tool.getImage(GameStart.class.getResource("/Hero/��1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/��10.png"))};
	Image zuoci[] = {
			tool.getImage(GameStart.class.getResource("/Hero/���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/���9.png"))};
	Image youci[] = {
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ҵ�9.png"))};
	Image youdazhao[] = {
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�Ұ���8.png"))}
			;
	Image zuodazhao[] = {
			tool.getImage(GameStart.class.getResource("/Hero/�����1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/�����8.png"))}
			;

	Image temp = img0;
	int index = 0;	//��������
	int index1=0;
	int index2=0;
	int hp1 = 0;
	int rl = 0; // �ж���������,0Ϊ�ң�1Ϊ��
	int act = 0; // �ж���ǰ����״̬��0Ϊվ�ţ�1�ǹ���1,2�ǹ���2,3�ǹ���3
	int i = 0;
	int j = 0;
	int rec_x = 240;
	int rec_y = 300;
	int rec_x1 = 0;
	int rec_y1 = 0;
	Rectangle Rec = new Rectangle(rec_x, rec_y, rec_x1, rec_y1);
	boolean a = false, s = false, d = false, w = false;
	// GameSound gs = new GameSound();

	// ����ͼƬ����
	int img_x1 = 240; // ��ʼ����
	int img_y1 = 300;
	int img_x2 = 68; // ���峤��
	int img_y2 = 72;
	Image imgx[]= null;
	GameStart gs = null;
	int limit_y[]={-170,-220};

	public Player (GameStart g) {
		gs = g;
		//super.hp1 = 10;// ��ʼѪ��
		
		//dimgx[1] = gs.tp.youkan[1];
	}

	// ���¼��̵ļ�����
	public void Key_Pressed(KeyEvent key) {
		switch (key.getKeyCode()) {
		case KeyEvent.VK_A: // ������
			if (act == 0 && gs.background.img_x <= 0) {// ����״̬Ϊ0ʱ�����߶�
				rl = 1; // ������
				temp = img3;// ���ݰ��µķ�������ò�ͬ��ͼƬ
				a = true;
				// gs.background.img_x=gs.background.img_x+10;
			}
			break;
		case KeyEvent.VK_S: // ������
			if (act == 0 && gs.background.img_y >= -220) {
				if (rl == 0) // ���������
				{
					temp = img4;
				} else {
					temp = img3;
				}// �������
				s = true;

				// gs.background.img_y = gs.background.img_y-10;
			}
			break;
		case KeyEvent.VK_D:// ������
			if (act == 0 && gs.background.img_x >= -2800) {
				rl = 0;
				temp = img4;
				d = true;
				// System.out.println("img_x"+gs.background.img_x);
				// gs.background.img_x=gs.background.img_x-10;
			}
			break;
		case KeyEvent.VK_W:// ������
			if (act == 0 && gs.background.img_y <= 0) {
				if (rl == 0) {
					temp = img4;
				} else {
					temp = img3;
				}
				w = true;
				// System.out.println("img_y"+gs.background.img_y);
				// gs.background.img_y = gs.background.img_y+10;
			}
			break;
		case KeyEvent.VK_J:
	//		gs.music.playSound("music/kare.MP3");
			if (rl == 0) {

				temp = img6;
				rec_x1 = 100;
				rec_y1 = 83;
			} else if (rl == 1) {
				temp = img5;
				rec_x1 = 100;
				rec_y1 = 83;
			}
			break;
		case KeyEvent.VK_K:
		//	gs.music.playSound("music/��.MP3");
			if (rl == 0) {

				
				temp = img8;
				rec_x1 = 100;
				rec_y1 = 83;

			} else if (rl == 1) {
				temp = img7;
				rec_x1 = 100;
				rec_y1 = 83;
			}

			break;
		case KeyEvent.VK_L:
		//	gs.music.playSound("music/��.MP3");
			if (rl == 0) {

				temp = img10;
				rec_x1 = 100;
				rec_y1 = 83;
			} 
			else if (rl == 1) {
				temp = img9;
				rec_x1 = 100;
				rec_y1 = 83;
			}

			break;
			
		}
	}
	public void Key_Released(KeyEvent e) {
		if (act == 0) {
			switch (e.getKeyCode()) {
			case KeyEvent.VK_A:
				a = false;
				if (w == false && s == false && d == false) {
					temp = img1;
				}
				if (d == true) {
					temp = img2;
				}
				break;
			case KeyEvent.VK_S:
				s = false;
				if (w == false && a == false && d == false) {
					if(rl==0) {
						temp = img2;
					} else {
						temp = img1;
					}
				}
				break;
			case KeyEvent.VK_D:
				d = false;
				if (w == false && s == false && a == false) {
					if (rl==0){temp = img2;}
				}
				if (a == true) {
					temp = img1;
				}
				break;
			case KeyEvent.VK_W:
				w = false;
				if (a == false && s == false && d == false) {
					if (rl == 0) {
						temp = img2;
					} else {
						temp = img1;
					}
				}
				break;
			case KeyEvent.VK_J:
				if (rl == 0) {

					temp = img6;
					rec_x1 = 0;
					rec_y1 = 0;
				} else if (rl == 1) {
					temp = img5;
					rec_x1 = 0;
					rec_y1 = 0;
				}
				break;
			case KeyEvent.VK_K:
				if (rl == 0) {

				
					temp = img8;
					rec_x1 = 0;
					rec_y1 = 0;

				} else if (rl == 1) {
					temp = img7;
					rec_x1 = 0;
					rec_y1 = 0;
				}

				break;
			case KeyEvent.VK_L:
				if (rl == 0) {

					
					temp = img10;
					rec_x1 = 0;
					rec_y1 = 0;
				} 
				else if (rl == 1) {
					temp = img9;
					rec_x1 = 0;
					rec_y1 = 0;
				}

				break;
			}
		}
	}

	public Rectangle getplyRect() {
		
		return new Rectangle(img_x1, img_y1, rec_x1, rec_y1);

	}
	public Rectangle getplyRect1() {
		
		return new Rectangle(img_x1, img_y1, 70, 70);

	}
	
	public void move() {
		if (a) {
			if(gs.background.img_x==0 && img_x1>0)
			{
				img_x1 -=2;
			}
			
			else if (gs.background.img_x < 0 && img_x1==240) {// ��ͼ�߿򣬳������ܼ�������������ƶ�	�����ƶ�
				
				gs.background.img_x += 3;
				
			}
			else if (gs.background.img_x <=-2600 && img_x1>240 ){
				img_x1-=2;
			}
		}
		if (s) {								//�����ƶ�			�����ױߴ˴��޸�
			if(gs.background.img_y<=limit_y[gs.control_val] && gs.background.img_y>-320 && img_y1<=420)		//���� ���ﶯ y��
			{img_y1+=2;}
			else if (gs.background.img_y > limit_y[gs.control_val]) {
				gs.background.img_y -= 2;
			}
		}
		if (d) {																			//��Ļ����
			
			if (img_x1<240 ){
				img_x1 +=2;
			}
			else if (gs.background.img_x > -2600) {
				gs.background.img_x -= 3;
			}
			else if (gs.background.img_x <= -2600 && img_x1 >=240 && img_x1<=520){		//�ж� ��ͼ���� ���￪ʼ��
				
				img_x1 +=2;
			}
		}
		if (w) {																		//������������
			if (gs.background.img_y < 0 && img_y1>=300)
			{img_y1-=2;}
			else if (gs.background.img_y < 0) {												//��ͼ�ƶ�
				gs.background.img_y += 2;

			}
		}
	}

	public void P_Paint(Graphics g) {
		if (temp == img4 || temp == img3) {
			g.drawImage(temp, img_x1, img_y1 - 6, 68, 80, gs);} 
		else if (temp == img5) {	//��ƽ��
			g.drawImage(zuokan[index], img_x1 - 40, img_y1+5, 139, 83, gs);
			index++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index == youkan.length){
			
				index = 0;
				// g.drawImage(temp, img_x1 + 28, img_y1 + 18, 117, 59, gs);
				temp = img1;
				}}
		else if (temp == img6) {	//��ƽ�� 
				g.drawImage(youkan[index], img_x1-12 , img_y1+5,139,83,gs);
			// �±�����
			index++;
			// �ж�Ч���Ƿ����
			rec_x1 = 0;
			rec_y1 = 0;

			if (index == youkan.length){
				
				index = 0;
				// g.drawImage(temp, img_x1 + 28, img_y1 + 18, 117, 59, gs);
				temp = img0;	
				}}
		else if (temp == img7) {// ���
			g.drawImage(zuoci[index1], img_x1 - 68, img_y1 + 15, 117, 59, gs);
			index1++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index1 == zuoci.length){
				
				index1 = 0;
				// g.drawImage(temp, img_x1 + 28, img_y1 + 18, 117, 59, gs);
				temp = img1;
			}	} 
		else if (temp == img8) {// �Ҵ�
			g.drawImage(youci[index1], img_x1+20, img_y1+20, 117, 59, gs);
			index1++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index1 == youci.length){
				
				index1 = 0;
				// g.drawImage(temp, img_x1 + 28, img_y1 + 18, 117, 59, gs);
				temp = img2;
			}	} 
		else if (temp == img10) {// �Ҵ���
			g.drawImage(youdazhao[index2], img_x1-5, img_y1-50, 143, 150, gs);
			index2++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index2 == youdazhao.length){
				index2 = 0;
				temp = img2;
			}	} 
		else if (temp == img9) {// �����
			
			g.drawImage(zuodazhao[index2], img_x1-5, img_y1-50, 143, 150, gs);
			index2++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index2 == zuodazhao.length){
				index2 = 0;
				temp = img1;
			}	} 
		else if (temp == img1 || temp==img0 ||temp == img2){
			g.drawImage(temp, img_x1, img_y1, 68, 80, gs);}
	}
}
