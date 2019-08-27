//数组下标越界异常。
//这里演示了一个关于数组越界的异常示范。

package inheritanceAndPolymorphism;

public class demo17 {
	public static void main(String agrs[]) {		
		int i = 0;
		String greetings [] = {		//创建一个String类型的数组。
				"Hello World!",		//这里三个是数组的具体内容。
				"No,I mean it!",
				"HELLO WORLD!"		};
		while(i<4) {		//这里搞了一个while循环，i要循环4次，0/1/2/3。这里如果叫4改为3，就没什么毛病了。
			System.out.println(greetings[i]);		//在这里就会发生异常，因为greethings数组只有3个元素，在下标为3那里会出现数组下标越界的异常。
			i++;
		}
	}
}
