import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class Player{

	Toolkit tool = Toolkit.getDefaultToolkit();

	// »ñµÃÍ¼Æ¬ ¾ø¶Ô¶¨Î» ***
	// Image img = tool.getImage("D:\\2.jpg");
	
	Image youci_img[]=null;

	// Ïà¶Ô¶¨Î» ****
	Image img0 = tool.getImage(GameStart.class
			.getResource("/Image/standright.png"));// ²»¶¯Ê±
	Image img1 = tool.getImage(GameStart.class
			.getResource("/Image/standleft.png"));// ×ó²»¶¯
	Image img2 = tool.getImage(GameStart.class
			.getResource("/Image/standright.png"));// ÓÒ²»¶¯
	Image img3 = tool.getImage(GameStart.class.getResource("/Image/left.gif"));// Ïò×óÊ±
	Image img4 = tool.getImage(GameStart.class.getResource("/Image/right.gif"));// ÏòÓÒÊ±
	Image img5 = tool.getImage(GameStart.class
			.getResource("/Image/pingkan.gif"));// ×óÆ½¿³
	Image img6 = tool.getImage(GameStart.class
			.getResource("/Image/youpingkan.gif"));// ÓÒÆ½¿³
	Image img7 = tool.getImage(GameStart.class.getResource("/Image/zuoci.gif"));// ×ó´Ì
	Image img8 = tool.getImage(GameStart.class.getResource("/Image/youci.gif"));// ÓÒ´Ì
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
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³10.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó¿³10.png"))};
	Image zuoci[] = {
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó´Ì9.png"))};
	Image youci[] = {
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì9.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ´Ì9.png"))};
	Image youdazhao[] = {
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/ÓÒ°ëÔÂ8.png"))}
			;
	Image zuodazhao[] = {
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ1.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ2.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ3.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ4.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ5.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ6.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ7.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ8.png")),
			tool.getImage(GameStart.class.getResource("/Hero/×ó°ëÔÂ8.png"))}
			;

	Image temp = img0;
	int index = 0;	//Èı¸öË÷Òı
	int index1=0;
	int index2=0;
	int hp1 = 0;
	int rl = 0; // ÅĞ¶¨ÃæÏò×óÓÒ,0ÎªÓÒ£¬1Îª×ó
	int act = 0; // ÅĞ¶¨µ±Ç°ÈÎÎñ×´Ì¬£¬0ÎªÕ¾×Å£¬1ÊÇ¹¥»÷1,2ÊÇ¹¥»÷2,3ÊÇ¹¥»÷3
	int i = 0;
	int j = 0;
	int rec_x = 240;
	int rec_y = 300;
	int rec_x1 = 0;
	int rec_y1 = 0;
	Rectangle Rec = new Rectangle(rec_x, rec_y, rec_x1, rec_y1);
	boolean a = false, s = false, d = false, w = false;
	// GameSound gs = new GameSound();

	// ÉèÖÃÍ¼Æ¬×ø±ê
	int img_x1 = 240; // ÆğÊ¼×ø±ê
	int img_y1 = 300;
	int img_x2 = 68; // »úÌå³¤¿í
	int img_y2 = 72;
	Image imgx[]= null;
	GameStart gs = null;
	int limit_y[]={-170,-220};

	public Player (GameStart g) {
		gs = g;
		//super.hp1 = 10;// ³õÊ¼ÑªÁ¿
		
		//dimgx[1] = gs.tp.youkan[1];
	}

	// °´ÏÂ¼üÅÌµÄ¼àÌıÆ÷
	public void Key_Pressed(KeyEvent key) {
		switch (key.getKeyCode()) {
		case KeyEvent.VK_A: // Ïò×ó×ß
			if (act == 0 && gs.background.img_x <= 0) {// ¶¯×÷×´Ì¬Îª0Ê±²ÅÄÜ×ß¶¯
				rl = 1; // Á³³¯×ó
				temp = img3;// ¸ù¾İ°´ÏÂµÄ·½Ïò¼üµ÷ÓÃ²»Í¬µÄÍ¼Æ¬
				a = true;
				// gs.background.img_x=gs.background.img_x+10;
			}
			break;
		case KeyEvent.VK_S: // ÏòÏÂ×ß
			if (act == 0 && gs.background.img_y >= -220) {
				if (rl == 0) // Èç¹ûÁ³³¯ÓÒ
				{
					temp = img4;
				} else {
					temp = img3;
				}// Èç¹û³¯×ó
				s = true;

				// gs.background.img_y = gs.background.img_y-10;
			}
			break;
		case KeyEvent.VK_D:// ÏòÓÒ×ß
			if (act == 0 && gs.background.img_x >= -2800) {
				rl = 0;
				temp = img4;
				d = true;
				// System.out.println("img_x"+gs.background.img_x);
				// gs.background.img_x=gs.background.img_x-10;
			}
			break;
		case KeyEvent.VK_W:// ÏòÉÏ×ß
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
		//	gs.music.playSound("music/¿³.MP3");
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
		//	gs.music.playSound("music/´Ì.MP3");
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
			
			else if (gs.background.img_x < 0 && img_x1==240) {// µØÍ¼±ß¿ò£¬³¬³öÔò²»ÄÜ¼ÌĞø³¯Õâ¸ö·½ÏòÒÆ¶¯	Ïò×óÒÆ¶¯
				
				gs.background.img_x += 3;
				
			}
			else if (gs.background.img_x <=-2600 && img_x1>240 ){
				img_x1-=2;
			}
		}
		if (s) {								//ÏòÏÂÒÆ¶¯			³¡¾°µ×±ß´Ë´¦ĞŞ¸Ä
			if(gs.background.img_y<=limit_y[gs.control_val] && gs.background.img_y>-320 && img_y1<=420)		//¿ØÖÆ ÈËÎï¶¯ yÖá
			{img_y1+=2;}
			else if (gs.background.img_y > limit_y[gs.control_val]) {
				gs.background.img_y -= 2;
			}
		}
		if (d) {																			//ÆÁÄ»×îÓÒ
			
			if (img_x1<240 ){
				img_x1 +=2;
			}
			else if (gs.background.img_x > -2600) {
				gs.background.img_x -= 3;
			}
			else if (gs.background.img_x <= -2600 && img_x1 >=240 && img_x1<=520){		//ÅĞ¶Ï µØÍ¼²»¶¯ ÈËÎï¿ªÊ¼¶¯
				
				img_x1 +=2;
			}
		}
		if (w) {																		//¿ØÖÆÈËÎïÏòÉÏ
			if (gs.background.img_y < 0 && img_y1>=300)
			{img_y1-=2;}
			else if (gs.background.img_y < 0) {												//µØÍ¼ÒÆ¶¯
				gs.background.img_y += 2;

			}
		}
	}

	public void P_Paint(Graphics g) {
		if (temp == img4 || temp == img3) {
			g.drawImage(temp, img_x1, img_y1 - 6, 68, 80, gs);} 
		else if (temp == img5) {	//×óÆ½¿³
			g.drawImage(zuokan[index], img_x1 - 40, img_y1+5, 139, 83, gs);
			index++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index == youkan.length){
			
				index = 0;
				// g.drawImage(temp, img_x1 + 28, img_y1 + 18, 117, 59, gs);
				temp = img1;
				}}
		else if (temp == img6) {	//ÓÒÆ½¿³ 
				g.drawImage(youkan[index], img_x1-12 , img_y1+5,139,83,gs);
			// ÏÂ±êÔö¼Ó
			index++;
			// ÅĞ¶ÏĞ§¹ûÊÇ·ñÍê±Ï
			rec_x1 = 0;
			rec_y1 = 0;

			if (index == youkan.length){
				
				index = 0;
				// g.drawImage(temp, img_x1 + 28, img_y1 + 18, 117, 59, gs);
				temp = img0;	
				}}
		else if (temp == img7) {// ×ó´Ì
			g.drawImage(zuoci[index1], img_x1 - 68, img_y1 + 15, 117, 59, gs);
			index1++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index1 == zuoci.length){
				
				index1 = 0;
				// g.drawImage(temp, img_x1 + 28, img_y1 + 18, 117, 59, gs);
				temp = img1;
			}	} 
		else if (temp == img8) {// ÓÒ´Ì
			g.drawImage(youci[index1], img_x1+20, img_y1+20, 117, 59, gs);
			index1++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index1 == youci.length){
				
				index1 = 0;
				// g.drawImage(temp, img_x1 + 28, img_y1 + 18, 117, 59, gs);
				temp = img2;
			}	} 
		else if (temp == img10) {// ÓÒ´óÕĞ
			g.drawImage(youdazhao[index2], img_x1-5, img_y1-50, 143, 150, gs);
			index2++;
			rec_x1 = 0;
			rec_y1 = 0;
			if (index2 == youdazhao.length){
				index2 = 0;
				temp = img2;
			}	} 
		else if (temp == img9) {// ×ó´óÕĞ
			
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
