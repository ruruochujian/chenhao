package duixiang0709;
/*
 * 提取笔记本的属性，并使用三种方法，显示笔记本的信息
 */
public class duixiang0709_02 {

	public static void main(String[] args) {
		duixiang0709_conputer no1=new duixiang0709_conputer();
		
		no1.name="华硕";
		no1.price=13212.5;
		no1.chanDi="北京";
		
		//第一种输出方式
		no1.show1(no1);
		
		//第二种输出方式
		no1.show2(no1.name,no1.price,no1.chanDi);
		
		//第三种
		no1.show3();

	}

}
