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
		int greatNum[]=new int[5];//������0��Ĭ��Ϊ0
		
		
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
					boolean isAdd=false;//��ʶ�Ƿ���Զ��ͣ������������Ƿ��Ѿ���
					//��ζ�����У�鶩���Ƿ�����
					for(int j=0;j<names.length;j++) {
						if(names[j]==null) {//�ҵ���һ����λ���¶�����Ϣ
							isAdd=true;
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
					while(songTime<10 || songTime>20) {
						System.out.println("������������������10~20֮���������");
						songTime=input.nextInt();
					}
					
					System.out.println("�������Ͳ͵�ַ��");
					String songDiZhi=input.next();
					
					System.out.println("���ͳɹ�");
					String canFen=cai[chooseNum-1]+fenShu+"��";
					System.out.println("��������:"+cai[chooseNum-1]+fenShu+"��");
					System.out.println("�Ͳ�ʱ�䣺"+songTime+"��");
					
					//���ͽ��
					double canFei=caijiage[chooseNum-1]*fenShu;
					//�ͷ���50���Ͳͷѣ������5Ԫ�Ͳͷ�
					double songCanFei=canFei>50 ? 0 : 5;
					System.out.println("�ͷѣ�"+canFei+"Ԫ��  �Ͳͷ�"+songCanFei+"Ԫ��  �ܼƣ� "+(canFei+songCanFei)+"Ԫ");
					
						
					//��������Ϣ���붩��������
					names[j]=name;
					usercai[j]=canFen;
					time[j]=songTime;
					diZhi[j]=songDiZhi;
					jinEr[j]=canFei+songCanFei;
					
					break;
			}
					if(!isAdd) {// isAddΪ false ��ʾ�ʹ����� �����µ�
						System.out.println("�Բ������Ĳʹ�������");
					}
	}
					break;
				case 2:
					//�鿴�ʹ�
					System.out.println("*****�鿴�ʹ�*****");
					System.out.println("���        ������        ��Ʒ��Ϣ        �Ͳ�ʱ��        �Ͳ͵�ַ        �ܽ��        ����״̬");
					for(int i=0;i<names.length;i++) {
						if(names[i]!=null) {//
							String zhuangtai=(zhuangTai[i]==0) ? "��Ԥ��" : "��ǩ��";
							System.out.println((i+1)+"\t"+names[i]+"\t"+usercai[i]+"\t"+time[i]+"\t"+diZhi[i]+"\t"+jinEr[i]+"\t"+zhuangtai);
						}
							
					}
					
					break;
				case 3:
					//ǩ�ն���
					System.out.println("*****ǩ�ն���*****");
					boolean isSignFind=false;
					System.out.println("��ѡ��Ҫǩ�յĶ�����ţ�");
					int qianShouNum=input.nextInt();
					for(int i=0;i<names.length;i++) {
						if(zhuangTai[i]==0 && names[i]!=null && qianShouNum==i+1) {
							zhuangTai[i]=1;
							System.out.println("����ǩ�ճɹ���");
							isSignFind=true;
						}else if(names[i]!=null && zhuangTai[i]==1 && qianShouNum==i+1) {
							System.out.println("��ѡ��Ķ����Ѿ�ǩ�գ������ٴ�ǩ��");
							isSignFind=true;
						}
						
					}
					if(!isSignFind) {
						System.out.println("��ѡ��Ķ��������ڣ�");
				}
					break;
				case 4:
					//ɾ������
					System.out.println("*****ɾ������*****");
					boolean isDelFind=false;//����Ƿ��ҵ�Ҫɾ���Ķ���
					System.out.println("������Ҫɾ���Ķ�����ţ�");
					int shanChuNum=input.nextInt();
					for(int i=0;i<names.length;i++) {
						if(names[i]!=null && zhuangTai[i]!=0 && shanChuNum==i+1 ) {
							isDelFind=true;
							for(int j=shanChuNum;j<names.length;j++) {
								names[j]=names[j+1];
								usercai[j]=usercai[j+1];
								time[j]=time[j+1];
								diZhi[j]=diZhi[j+1];
								zhuangTai[j]=zhuangTai[j+1];
								jinEr[j]=jinEr[j+1];
							}
							int endIndex=names.length-1;
							names[endIndex]=null;
							usercai[endIndex]=null;
							time[endIndex]=0;
							diZhi[endIndex]=null;
							zhuangTai[endIndex]=0;
							jinEr[endIndex]=0;
							System.out.println("ɾ�������ɹ���");
							break;
						}else if(names[i]!=null && zhuangTai[i]!=0 &&shanChuNum==i+1) {
							System.out.println("��ѡ��Ķ���δǩ�գ�����ɾ����");
							isDelFind=true;
							break;
						}
						
						
						
					}
					if(!isDelFind) {
						System.out.println("��Ҫɾ���Ķ��������ڣ�");
					}
					break;
				case 5:
					//��Ҫ����
					System.out.println("*****��Ҫ����*****");
					
					System.out.println("���\t"+"����\t"+"����");
					for(int i=0;i<cai.length;i++) {
						String greatNums=greatNum[i]>0 ? greatNum[i]+"��" :"";
						System.out.println((i+1)+"\t"+cai[i]+"\t"+caijiage[i]+"\t"+greatNums);
					}
					System.out.println("��������Ҫ���޵Ĳ�Ʒ��ţ�");
					int dianZanNum=input.nextInt();
					greatNum[dianZanNum-1]++;
					System.out.println("���޳ɹ���");
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
				input.close();//�رռ���¼��
				break;
			}
			
		}while(num==0);
	}

}
