//这个实例，创建了一个二维的数组，然后用嵌套循环，将它们完整地输出。这里的嵌套循环，很值得一看。

package demo1;

public class demo03 {
	public static void main(String args[]) {
		int myTable[][] = {
				{23,45,65,34,21,67,78},
				{46,14,18,46,98,63,88},
				{98,81,64,90,21,14,23},
				{54,43,55,76,22,43,33}
		};//创建一个二维数组。
		for (int row = 0; row < 4; row ++) {//循环第一维，循环到4时，循环结束。
			for (int col = 0; col < 7; col ++)//循环第二维，循环到7。
				System.out.print(myTable[row][col] + " ");//上一个循环为row = 0，也就是第一维的第一个元素，而这个循环col则从0循环到7。也就是输出了myTable数组的第一维的第一个元素内所有的数字，循环7次后，才跳出。
		System.out.println();//这时第一个循环才结束，输出了第一维第一个元素的全部数字后，这行使其换行。
		}
	}
}
