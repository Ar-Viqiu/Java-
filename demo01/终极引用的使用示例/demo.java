//终极引用的使用示例。

package inheritanceAndPolymorphism;

class Car{
	int number = 1234;
}
public class demo11{
	public static void main(String args[]) {
		final Car mycar= new Car();		//终极变量，引用类型。
		mycar.number = 8888;		//可以，修改的是number的值，而不是mycar的值。
		mycar = new Car();		//错误，mycar不能指向其他的对象。
	}
}
