package Demo0711;



/*
 * �ڸ�����Ϸ�Ļ����ϣ���ӡ��ڡ�,��L��,��T����ͼ��(ÿ��ͼ�ζ���4���������)��
ͼ����й��ܣ�
1��������һ����λ��
2�������� һ����λ��
3��������һ����λ
4��������n����λ��
��ǽֽ���ܴ�ӡͼ���磺
- - - - - - - - - - - - - - - - - - 
- - - - # # - - - - - - - - - - -
- - - - # # - - - - - - - - - - -
- - - - - - - - - - - - - - - - - -
 */
public class Demo0711_04 {
	int x;//���Ӻ�����
	int y;//����������
	
	//ǽֽ�ĳ���
	int length;
	int hight;
	
	public void printWall(Demo0711_04 cell) {
		//��λǽֽ�������λ��
		for(int p=0;p<y;p++) {
			System.out.println();
		}
		//��ӡǽֽ��ͬʱ��λ������
		for(int i=0;i<y+hight;i++) {//��

			for(int j=0;j<x+length;j++) {//��
				//��λǽֽ�������λ��
				if(j<x) {
					System.out.print(" ");
				}else if(cell.x==j && cell.y==i) {//��ӡ����
					System.out.print("#");
				}else {//��ӡ"-"
					System.out.print("-");
				}
			}
				System.out.println();
	
		}
		
	}
	
	public static void main(String[] args) {
		Demo0711_04 cell=new Demo0711_04();
	}
}
