package duixiang0709;
/*
 * ���ݲ�ͬ���ο�������䣬������Ʊ���á�
��Ʊ����10�꼰���£���Ʊ��ѣ�10��60�꣬��ƱȫƱ������60�꣬��Ʊ���
Ч����ʾ���£�
 */
import java.util.Scanner;

public class duixiang0709_01 {

	public static void main(String[] args) {
		
		duixiang0709_person  youKe=new duixiang0709_person();
		
		Scanner input=new Scanner(System.in);
			
			for(int i=1;i<=3;i++) {
				System.out.println("������������");
				String name=input.next();
				youKe.name=name;
				
				System.out.println("���������䣺");
				int ages=input.nextInt();
				youKe.age=ages;
				
				if(ages==0 &&ages<=10) {
					System.out.println("��Ʊ��ѣ�");
				}else if(ages>10 && ages<=60) {
					System.out.println("��ƱȫƱ");
				}else {
					System.out.println("��Ʊ���");
				}
				
				System.out.println("�Ƿ������1/2����");
				int num=input.nextInt();
				
				if(num==2) {
					System.out.println("���������");
					break;
				}
			}
				
			System.out.println("��Ʊ���꣡");
			
			
		
		

	}

}
