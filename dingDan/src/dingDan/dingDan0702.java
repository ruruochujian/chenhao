package dingDan;

import java.util.Scanner;

/*
 * �Ի����� ����ϵͳ
 */
public class dingDan0702 {

	public static void main(String[] args) {
		//ѭ������ʾϵͳ�˵����û��������������ִ����Ӧ�Ĺ���
		
		int num =-1;//�û�����0�������˵��������˳�ϵͳ
		boolean isExit=false;
		do {
			Scanner input =new Scanner(System.in);
			System.out.println("��ӭʹ�á��Ի����˶���ϵͳ��");
			System.out.println("***********************************");
			System.out.println("1.��Ҫ����");
			System.out.println("2.�鿴�ʹ�");
			System.out.println("3.ǩ�ն���");
			System.out.println("4.ɾ������");
			System.out.println("5.��Ҫ����");
			System.out.println("6.�˳�ϵͳ");
			System.out.println("***********************************");
			
			System.out.println("��ѡ��");
			int userChooseNum=input.nextInt(); //�û���������ѡ��˵�����
			
			//�����û����빦�ܱ�ţ�ִ����Ӧ�Ĺ���
			
			
			if(!isExit) {//���˳�ϵͳ��¼��0���Է��ز˵�
				System.out.println("����0���أ�");
				num=input.nextInt();
			}
			
		}while(num==0);
	}

}
