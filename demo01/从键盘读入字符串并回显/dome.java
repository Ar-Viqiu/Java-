//这是一个Scanner类的输入示例。
//程序为读入字符串并回显在屏幕上。

package demo1;
import java.util.Scanner;		//引入Scanner类。
public class ScannerDemo {
	public static void main (String[] args) {
		String message;		//创建一个变量。
		Scanner scan=new Scanner (System.in);		//创建从键盘输入的对象scan。
		System.out.println("Enter a line of text:");	
		message=scan.nextLine();		//从键盘读入一行。
		System.out.println("You entered:\""+message+"\"");		//在屏幕上显示出上一行读取的字符。
	}
}
