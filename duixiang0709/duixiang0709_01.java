package duixiang0709;
/*
 * 根据不同的游客类的年龄，计算门票费用。
门票规则：10岁及以下，门票免费；10—60岁，门票全票；超过60岁，门票半价
效果显示如下：
 */
import java.util.Scanner;

public class duixiang0709_01 {

	public static void main(String[] args) {
		
		duixiang0709_person  youKe=new duixiang0709_person();
		
		Scanner input=new Scanner(System.in);
			
			for(int i=1;i<=3;i++) {
				System.out.println("请输入姓名：");
				String name=input.next();
				youKe.name=name;
				
				System.out.println("请输入年龄：");
				int ages=input.nextInt();
				youKe.age=ages;
				
				if(ages==0 &&ages<=10) {
					System.out.println("门票免费！");
				}else if(ages>10 && ages<=60) {
					System.out.println("门票全票");
				}else {
					System.out.println("门票半价");
				}
				
				System.out.println("是否继续（1/2）？");
				int num=input.nextInt();
				
				if(num==2) {
					System.out.println("程序结束！");
					break;
				}
			}
				
			System.out.println("余票售完！");
			
			
		
		

	}

}
