package Demo0711;

import java.util.Scanner;

/*
 * 编写Java程序用于显示人的姓名和年龄。 定义一个人类Person该类中应该有两个属性：姓名name和年龄age。
定义构造方法用来初始化数据成员(数据自定义)。再定义显示display方法将姓名和年龄打印出来。 在main方法中创建人类的实例然后将信息显示。
 */
public class Demo0711_Person {
			String name;
			String age;
			
			
			public void message() {
				Scanner input=new Scanner(System.in);
				System.out.println("输入姓名：");
				
				name=input.next();
				
				System.out.println("请输入年龄：");
				age=input.next();
				
			}
			
			public void display() {
				System.out.println(name+"  "+age);
			}
			public static void main(String[] args) {
				Demo0711_Person chen =new Demo0711_Person();
				chen.message();
				chen.display();
			}
}
