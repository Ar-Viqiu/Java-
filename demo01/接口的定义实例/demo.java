//接口的定义实例。

//这个实例就是定义一个接口，其他什么也没有。所谓的接口，就是特殊的类，类里的方法都是抽象方法。
//这个类里的方法，都只是定义里方法名、参数列表、返回值，没有方法体，方法体留到了调用它的类里去实现。
package inheritanceAndPolymorphism;

interface CharStorage{		//关键字interface。
	void put(char c);		//抽象方法。
	char get();		//抽象方法。
}
