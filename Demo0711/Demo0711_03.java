package Demo0711;

import java.util.Scanner;

/*
 * ����һ�������࣬�Ժ����ʹ����������࣬�ṩһ�¹��ܣ�
1��ͨ����������x,�������1��x���������[1,x]
2����ȡ��ǰϵͳʱ�䡣 �����Ĵ���System.currentTimeMillis()��
3��1������x����͡�
4������x�Ľ׳�
 */
public class Demo0711_03 {
		int num;
	
		Scanner input=new Scanner(System.in);
		//ͨ����������x,�������1��x���������[1,x]
		public int show() {
			
			System.out.println("������������");
			num=input.nextInt();
			int randomNum=(int) Math.random()*num+1;
			System.out.println(randomNum);
			return randomNum;
		}
		
		//1������x����͡�
		public int show1(int x) {
			int sum=0;
			for(int i=1;i<=x;i++) {
				sum+=1;
				i++;
			}
			return sum;
			
		}
		
		//����x�Ľ׳�
		public void show3(int x) {
			int sum=1;
			for(int i=1;i<=x;i++) {
				sum*=x;
			}
		}
		
		

}
