//抽象示例。

package inheritanceAndPolymorphism;

abstract class Employeee {		//这是一个抽象类，关键字是abstract。抽象类就是类里定义方法，但是没有具体的方法体。
	int casic = 2000;
	abstract void salary();		//这里定义了方法，却没有具体的方法体。
}
class Managerr extends Employeee{
	void salary() {		//这是从父类继承来的抽象方法，抽象方法的方法体要在子类里实现。
		System.out.println("薪资等于" + casic*5);		//这里实现（具体的功能）了父类的那个抽象方法。
	}
}
class Worker extends Employeee{
	void salary() {		//从父类继承来的抽象方法。
		System.out.println("薪资等于" + casic*2);		//这里实现了父类的那个抽象方法。
	}
}

//上面的这些都是类的定义，没有实际的输出，要输出到屏幕上，就得在主函数里调用这些类、方法。

public class demo12{		//整个文件只能有一个public class类，并且后面的类名要和文件名一致！！！
public static void main(String args[]) {		//主函数。各种操作要在这里实现。
	Managerr c = new Managerr();		//创建了一个类的实例。类都需要创建一个实例，才能调用其中的方法。
	c.salary();		//用创建的实例类调用上面的那个抽象方法，看看输出的对不对。
	Worker d = new Worker();
	d.salary();
}
}
