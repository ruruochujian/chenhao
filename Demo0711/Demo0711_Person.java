package Demo0711;

import java.util.Scanner;

/*
 * ��дJava����������ʾ�˵����������䡣 ����һ������Person������Ӧ�����������ԣ�����name������age��
���幹�췽��������ʼ�����ݳ�Ա(�����Զ���)���ٶ�����ʾdisplay�����������������ӡ������ ��main�����д��������ʵ��Ȼ����Ϣ��ʾ��
 */
public class Demo0711_Person {
			String name;
			String age;
			
			
			public void message() {
				Scanner input=new Scanner(System.in);
				System.out.println("����������");
				
				name=input.next();
				
				System.out.println("���������䣺");
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
