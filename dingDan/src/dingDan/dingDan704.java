package dingDan;

import java.util.Scanner;

/*
 * �Ի����� ����ϵͳ
 */
public class dingDan704 {

	public static void main(String[] args) {
		//ѭ������ʾϵͳ�˵����û��������������ִ����Ӧ�Ĺ���
		
		int num =-1;//�û�����0�������˵��������˳�ϵͳ
		boolean isExit=false;
		
		
		//�����Ʒ���顣������
		String cai[]= {"������","���մ���","���","������"};//����
		double caijiage[]= {20,25,30,15};//�˵ü۸�
		int greatNum[]=new int[3];//������0��Ĭ��Ϊ0
		
		
		//���嶩�����飬�û������������
		String[] names =new String[4];//����������
		String[] usercai =new String[4];//��ѡ��Ʒ��������Ʒ������
		int[] time =new int[4];//�Ͳ�ʱ��
		String[] diZhi =new String [4];//�Ͳ͵�ַ
		int[] zhuangTai=new int[4];//�Ͳ�״̬
		double[] jinEr=new double[4];//�����۸�
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
			switch(userChooseNum) {
				case 1:
					//��Ҫ����
					
					System.out.println("*****��Ҫ����*****");
					//��ʾ��Ʒ
					System.out.println("���"+"		"+"����"+"		"+"����"+"		"+"������");
					for(int i=0;i<cai.length-1;i++){
						String caijiages=caijiage[i]+"Ԫ";
						String greatNums=(greatNum[i]>0 ? greatNum[i]+"��" :"0");
						System.out.println((i+1)+"\t\t"+cai[i]+"\t\t"+caijiages+"\t\t"+greatNums);
					}
					
					
					//�û�ѡ���Ʒ
					System.out.println("�����붩����������");
					String name=input.next();
					System.out.println("��������Ҫ��Ĳ�Ʒ��ţ�");
					int chooseNum=input.nextInt();
					System.out.println("����������Ҫ�ķ�����");
					int fenShu=input.nextInt();
					System.out.println("�������Ͳ�ʱ�䣨�Ͳ�ʱ����10����20�������Ͳͣ�");
					int songTime=input.nextInt();
					System.out.println("�������Ͳ͵�ַ��");
					String songDiZhi=input.next();
					System.out.println("���ͳɹ�");
					System.out.println("��������:"+cai[chooseNum-1]+fenShu+"��");
					System.out.println("�Ͳ�ʱ�䣺"+songTime+"��");
					
					double canFei=caijiage[chooseNum-1]*fenShu;
					double songCanFei=canFei>50 ? 0 : 5;
					System.out.println("�ͷѣ�"+canFei+"Ԫ��  �Ͳͷ�"+songCanFei+"Ԫ��  �ܼƣ� "+canFei+"Ԫ");
					
					
					
					
					break;
				case 2:
					//�鿴�ʹ�
					System.out.println("*****�鿴�ʹ�*****");
					break;
				case 3:
					//ǩ�ն���
					System.out.println("*****ǩ�ն���*****");
					break;
				case 4:
					//ɾ������
					System.out.println("*****ɾ������*****");
					break;
				case 5:
					//��Ҫ����
					System.out.println("*****��Ҫ����*****");
					break;
				case 6:
					//�˳�ϵͳ
				//	System.out.println("*****�˳�ϵͳ*****");
				//	break;
				default :
					//���ܱ��¼�������Ϊ�˳�ϵͳ
					isExit=true;
					break;
					
							
			}
			
			if(!isExit) {//���˳�ϵͳ��¼��0���Է��ز˵�
				System.out.println("����0���أ�");
				num=input.nextInt();
			}else {
				break;
			}
			
		}while(num==0);
	}

}
