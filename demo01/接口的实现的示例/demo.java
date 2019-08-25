//接口的实现示例。

//前面咱们定义了一个接口，这里就是演示实现接口的一个小示例。
package inheritanceAndPolymorphism;

class Stacks implements CharStorage{		//关键字implements，表示调用了接口ChaerStorage。
	private char mem[] = new char[10];		
	private int point = 0;
	public void put(char c) {		//这里就实现了前面的接口里的方法。
		mem[point] = c;
		point++;
	}
	public char get() {		//实现方法。
		point--;
		return mem[point];
	}
}
