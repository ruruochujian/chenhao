package Demo0711;
/*
 * �ڿ���̨����žų˷������ݶ�ά�����ṩѭ��������
 */
public class Demo0711 {
		
		
		public void show() {
			String [][]arr=new String[9][9];
			for(int i=1;i<=arr.length;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(j+"*"+i+"  ");
				}
				System.out.println();
			}
			
		}
		
		
		public static void main(String[] args) {
			Demo0711 NO1=new Demo0711();
			NO1.show();
		}
}
