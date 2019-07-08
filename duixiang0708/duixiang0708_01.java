package duixiang0708;

public class duixiang0708_01 {
		public double add1(double num1,double num2) {
			return num1+num2;	
		}
		public double add2(double num1,double num2,double num3) {
			return num1+num2+num3;
		}
		
		public static void main(String[] args) {
			duixiang0708_01 cals=new duixiang0708_01();
			double sum1=cals.add1(1,2);
			System.out.println(sum1);
			double sum2=cals.add2(10, 20, 30);
			System.out.println(sum2);
		}
}
