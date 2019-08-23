//多态示例。

package inheritanceAndPolymorphism;


class SuperClass{
	public void method() {
		System.out.println("superclass!");
		}
	}
class SubClasss extends SuperClass{
	public void method() {		//覆盖了上面的方法。子类与父类的方法名相同，参数列表相同，方法体不同，就是方法覆盖。
		System.out.println("subclass!");
		}
	}

//一条方法能执行不同的功能，就是多态。

public class demo8{
	public static void main(String args[]) {
		SuperClass superc = new SuperClass();		//静态类型与动态类型一致。
			SubClasss subc = new SubClasss();		//静态类型与动态类型一致。
			SuperClass ssc = new SubClasss();		//静态类型与动态类型不一致。
			
			//静态类型：出现在声明中的类型。动态类型：变量指向的对象的类型。
			//简单地说，静态就是等号左边的，动态就是右边的。
			
			superc.method();		//执行父类方法。
			subc.method();		//执行子类方法。
			ssc.method();		//执行子类方法。
			
			//都是方法method，执行的结果却不一样，这就是多态。
		}
	}

