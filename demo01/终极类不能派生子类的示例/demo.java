//终极类不能派生子类的示例。

package inheritanceAndPolymorphism;		//这是一个终极类。

final public class demo9 {
	int menberar;
	void menberMethod() {
		
	};
}
class SubFinalClass extends demo9{		//错误。因为终极类不能派生出子类。
	int submenbervar;
	void subMemberMethod() {};
}
