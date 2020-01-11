//这是一个break语句、标记语句的示例。
//也有流程控制语句的知识点在里面（for循环、while语句、if语句）。
package demo1;

public class demo08 {
 public static void main (String args[]) {
	 int i,x = 20;
	 out: for(i=2; i<10;i++) {		//开头的“out”就是一个标记，与下面的那个“out”相对应。
		 System.out.println("begin i="+i);
		 while (x<1000) {
			 System.out.println("i="+i+",x="+x);
			if (i*x>=80) break out;		//这里的“out”就是标记的结束处，当i*x=80时，就会跳出out所标记的语句，
										//即上面的for语句，直接跳出整个for语句，到下面的输出“after out block"那里去了。
			else x +=5;
		 }
/**
在这里讲一下那几个流程语句相嵌套的情况，这里的流程语句是for语句套着while语句，在套着if语句。
那么这里就会从“最内层”的if语句那里开始执行，执行到i*x=80后，如果这里没有break跳出语句的话，它就会接着执行while语句的内容。
然后因为while语句没有让x增加的语句，所以x永远到不了1000，所以整个语句会一直循环地输出i=2，x=20，这一条语句，永远不会结束。
如果我们将if语句删去，在while语句中加入“x+=100;”，那么while语句就会执行10次，直到x<1000后，结束while语句，执行for语句。
所以，由此可以看出，在Java中，流程语句的多层嵌套，它的执行顺序就是从“最内层”一直执行到“最外层”的。
**/
	 }
	 System.out.println("after out block.");
 }
}
