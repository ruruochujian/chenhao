package Demo0711;
/*
 * �ڿ���̨������£������ݶ�ά�����ṩѭ����������
	1 2 3 4 5 6
	6 5 4 3 2 1
	6 5 4 3 2 1
	1 2 3 4 5 6
 */
public class Demo0711_02 {
	
		
		public void show() {
			int[][] sum={{1,2,3,4,5,6},{6,5,4,3,2,1},{6,5,4,3,2,1},{1,2,3,4,5,6}};
			for(int i=0;i<sum.length;i++) {
				for(int j=0;j<sum[i].length;j++) {
					System.out.print(sum[i][j]);
				}
				System.out.println();
			}
		}
		
		public static void main(String[] args) {
			Demo0711_02 num=new Demo0711_02();
			num.show();
		}
}
