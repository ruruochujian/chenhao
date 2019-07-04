package dingDan;

import java.util.Scanner;

/*
 * 吃货联盟 订单系统
 */
public class dingDan703 {

	public static void main(String[] args) {
		//循环，显示系统菜单，用户根据输入的数字执行相应的功能
		
		int num =-1;//用户输入0返回主菜单，否则退出系统
		boolean isExit=false;
		do {
			Scanner input =new Scanner(System.in);
			System.out.println("欢迎使用“吃货联盟订单系统”");
			System.out.println("***********************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("***********************************");
			
			System.out.println("请选择：");
			int userChooseNum=input.nextInt(); //用户输入数字选择菜单功能
			
			//根据用户输入功能编号，执行相应的功能
			switch(userChooseNum) {//每个分支的功能详见dingDan704.java
				case 1:
					//我要订餐
					
					System.out.println("*****我要订餐*****");
					break;
				case 2:
					//查看餐袋
					System.out.println("*****查看餐袋*****");
					break;
				case 3:
					//签收订单
					System.out.println("*****签收订单*****");
					break;
				case 4:
					//删除订单
					System.out.println("*****删除订单*****");
					break;
				case 5:
					//我要点赞
					System.out.println("*****我要点赞*****");
					break;
				case 6:
					//退出系统
				//	System.out.println("*****退出系统*****");
				//	break;
				default :
					//功能编号录入错误，认为退出系统
					isExit=true;
					break;
					
							
			}
			
			if(!isExit) {//不退出系统，录入0可以返回菜单
				System.out.println("输入0返回：");
				num=input.nextInt();
			}else {
				break;
			}
			
		}while(num==0);
	}

}
