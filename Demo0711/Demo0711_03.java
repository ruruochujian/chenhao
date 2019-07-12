package Demo0711;

import java.util.Scanner;

/*
 * 创建一个工具类，以后可以使用这个工具类，提供一下功能：
1、通过传入整数x,返回随机1—x的随机数。[1,x]
2、获取当前系统时间。 （核心代码System.currentTimeMillis()）
3、1到整数x的求和。
4、整数x的阶乘
 */
public class Demo0711_03 {
		int num;
	
		Scanner input=new Scanner(System.in);
		//通过传入整数x,返回随机1—x的随机数。[1,x]
		public int show() {
			
			System.out.println("请输入整数：");
			num=input.nextInt();
			int randomNum=(int) Math.random()*num+1;
			System.out.println(randomNum);
			return randomNum;
		}
		
		//1到整数x的求和。
		public int show1(int x) {
			int sum=0;
			for(int i=1;i<=x;i++) {
				sum+=1;
				i++;
			}
			return sum;
			
		}
		
		//整数x的阶乘
		public void show3(int x) {
			int sum=1;
			for(int i=1;i<=x;i++) {
				sum*=x;
			}
		}
		
		

}
