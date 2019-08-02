//这个实例，演示了输入输出的实现，输入一些字符，系统自动打印出来。

package demo1;

import java.util.Scanner;

public class demo04 {
	public static void main(String args[]) {
		String message;//这是一个变量，下面从键盘读入时，就是存在这个变量里的。
		Scanner scan = new Scanner(System.in);//创建从键盘输入的对象。
		System.out.println("打个字：");
		message = scan.nextLine();//从键盘读入一行。
		System.out.println("你打的是： \" " + message + " \" ");//显示文字。这里，\ 是转义符号，两个 \ ，各输出了一个 " ，凑成了一个双引号。
	}
}
