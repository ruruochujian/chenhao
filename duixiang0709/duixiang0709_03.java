package duixiang0709;

public class duixiang0709_03 {

	public static void main(String[] args) {
		duixiang0709_03_cup[] cup= new duixiang0709_03_cup[5];;
		
		duixiang0709_03_cup cup1=new duixiang0709_03_cup();
		cup1.name="一个水杯";
		cup[0]=cup1;
		
		duixiang0709_03_cup cup2=new duixiang0709_03_cup();
		cup2.name="一个水杯";
		cup[1]=cup2;
		
		duixiang0709_03_cup cup3=new duixiang0709_03_cup();
		cup3.name="一个水杯";
		cup[2]=cup3;
		
		duixiang0709_03_cup cup4=new duixiang0709_03_cup();
		cup4.name="一个水杯";
		cup[3]=cup4;
		
		duixiang0709_03_cup cup5=new duixiang0709_03_cup();
		cup5.name="一个水杯";
		cup[4]=cup5;
		
		for(int i=0;i<cup.length;i++) {
			System.out.println(cup[i].name);
			}
		}

}
