package duixiang0708;

import java.util.Scanner;

public class duixiang0708_04 {
		String name;
		int age;
		double score;
		
		
		public void  remark(String remarks) {
	System.out.println(remarks);
}

		public static void main(String[] args) {
				Scanner input=new Scanner(System.in);
				
				duixiang0708_04 zhangsan =new duixiang0708_04();
				System.out.println("������");
				zhangsan.name=input.next();
				System.out.println("���䣺");
				zhangsan.age=input.nextInt();
				System.out.println("�ɼ���");
				zhangsan.score=input.nextDouble();
				System.out.println("��ʦ��ע��");
		}
}
