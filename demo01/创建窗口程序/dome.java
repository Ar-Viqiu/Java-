package PG.zjq.game;

import javax.swing.JFrame;

/** 
* @author 作者:Vinsky 
* @version 创建时间：2020年2月28日 下午9:58:24 
* 类说明 ：游戏主窗口类
*/



//这是一个最最基础的窗口程序了，定义了主窗口，大小和窗口初始位置。

public static void main(String agrs[]) {
	JFrame f=new JFrame("窗口");//定义窗口
	f.setVisible(true);//窗口显示
	f.setSize(300,300);//窗口大小
	f.setLocation(500,300);//窗口初始位置
	f.setDefaultCloseOperation(EXIT_ON_CLOSE);//关闭后台运行
}
