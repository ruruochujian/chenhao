package duixiang0708;

public class duixiang0708_03 {
		String name;
		int age;
		String gender;
		int num;	
		
public static void main(String[] args) {
			duixiang0708_03 xiaowang=new duixiang0708_03();
			
			xiaowang.name="小王";
			xiaowang.age=25;
			xiaowang.gender="男";
			xiaowang.num=01;
			
			System.out.println(xiaowang.name+"  "+xiaowang.age+"  "+xiaowang.gender+"  "+xiaowang.num);
			
			duixiang0708_03 xiaohong=new duixiang0708_03();
			xiaohong.name="小红";
			xiaohong.age=20;
			xiaohong.gender="女";
			xiaohong.num=2;
			System.out.println(xiaohong.name+"  "+xiaohong.age+"  "+xiaohong.gender+"  "+xiaohong.num);
		}

}
