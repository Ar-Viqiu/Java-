//计算某两个数组的相乘积。

package demo1;

public class demo02 {
	public static void main(String args[]) {
		int [] [] agas = new int [4] [7];//声明并创建数组agas。
		int [] firstArray = agas [0];//声明并创建数组firstArray，并且赋值为agas的第一维元素数。
		System.out.println(firstArray.length * agas.length);//这样两个数组相乘，就是第一维的元素数乘第二维的元素数。
	}
}
