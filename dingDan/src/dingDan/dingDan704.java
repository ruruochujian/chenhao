package dingDan;

import java.util.Scanner;

/*
 * 吃货联盟 订单系统
 */
public class dingDan704 {

	public static void main(String[] args) {
		//循环，显示系统菜单，用户根据输入的数字执行相应的功能
		
		int num =-1;//用户输入0返回主菜单，否则退出系统
		boolean isExit=false;
		
		
		//定义菜品数组。及数据
		String cai[]= {"红烧肉","红烧带鱼","火锅","麻辣烫"};//菜名
		double caijiage[]= {20,25,30,15};//菜得价格
		int greatNum[]=new int[5];//点赞数0，默认为0
		
		
		//定义订单数组，用户最多四条订单
		String[] names =new String[4];//订餐人姓名
		String[] usercai =new String[4];//所选菜品，包括菜品及份数
		int[] time =new int[4];//送餐时间
		String[] diZhi =new String [4];//送餐地址
		int[] zhuangTai=new int[4];//送餐状态
		double[] jinEr=new double[4];//订单价格
		do {
			Scanner input =new Scanner(System.in);
			System.out.println("欢迎使用“吃货联盟订单系统”");
			System.out.println("***********************************");
			System.out.println("1.我要订餐");
			System.out.println("2.查看餐袋");
			System.out.println("3.签收订单");
			System.out.println("4.删除订单");
			System.out.println("5.我要点赞");
			System.out.println("6.退出系统");
			System.out.println("***********************************");
			
			System.out.println("请选择：");
			int userChooseNum=input.nextInt(); //用户输入数字选择菜单功能
			
			//根据用户输入功能编号，执行相应的功能
			switch(userChooseNum) {
				case 1:
					//我要订餐
					
					System.out.println("*****我要订餐*****");
					boolean isAdd=false;//标识是否可以订餐，即订餐数组是否已经满
					//多次订餐需校验订餐是否已满
					for(int j=0;j<names.length;j++) {
						if(names[j]==null) {//找到第一个空位，下订单信息
							isAdd=true;
					//显示菜品
					System.out.println("序号"+"		"+"菜名"+"		"+"单价"+"		"+"点赞数");
					for(int i=0;i<cai.length-1;i++){
						String caijiages=caijiage[i]+"元";
						String greatNums=(greatNum[i]>0 ? greatNum[i]+"赞" :"0");
						System.out.println((i+1)+"\t\t"+cai[i]+"\t\t"+caijiages+"\t\t"+greatNums);
					}
					
					
					//用户选择菜品
					System.out.println("请输入订餐人姓名：");
					String name=input.next();
					System.out.println("请输入你要点的菜品编号：");
					int chooseNum=input.nextInt();
					System.out.println("请输入您需要的份数：");
					int fenShu=input.nextInt();
					System.out.println("请输入送餐时间（送餐时间是10点至20点整点送餐）");
					int songTime=input.nextInt();
					while(songTime<10 || songTime>20) {
						System.out.println("您的输入有误，请输入10~20之间的整数：");
						songTime=input.nextInt();
					}
					
					System.out.println("请输入送餐地址：");
					String songDiZhi=input.next();
					
					System.out.println("订餐成功");
					String canFen=cai[chooseNum-1]+fenShu+"份";
					System.out.println("您定的是:"+cai[chooseNum-1]+fenShu+"份");
					System.out.println("送餐时间："+songTime+"点");
					
					//订餐金额
					double canFei=caijiage[chooseNum-1]*fenShu;
					//餐费满50免送餐费，否则加5元送餐费
					double songCanFei=canFei>50 ? 0 : 5;
					System.out.println("餐费："+canFei+"元，  送餐费"+songCanFei+"元，  总计： "+(canFei+songCanFei)+"元");
					
						
					//将订单信息放入订单数组中
					names[j]=name;
					usercai[j]=canFen;
					time[j]=songTime;
					diZhi[j]=songDiZhi;
					jinEr[j]=canFei+songCanFei;
					
					break;
			}
					if(!isAdd) {// isAdd为 false 表示餐袋已满 不能下单
						System.out.println("对不起，您的餐袋已满！");
					}
	}
					break;
				case 2:
					//查看餐袋
					System.out.println("*****查看餐袋*****");
					System.out.println("序号        订餐人        餐品信息        送餐时间        送餐地址        总金额        订单状态");
					for(int i=0;i<names.length;i++) {
						if(names[i]!=null) {//
							String zhuangtai=(zhuangTai[i]==0) ? "已预订" : "已签收";
							System.out.println((i+1)+"\t"+names[i]+"\t"+usercai[i]+"\t"+time[i]+"\t"+diZhi[i]+"\t"+jinEr[i]+"\t"+zhuangtai);
						}
							
					}
					
					break;
				case 3:
					//签收订单
					System.out.println("*****签收订单*****");
					boolean isSignFind=false;
					System.out.println("请选择要签收的订单序号：");
					int qianShouNum=input.nextInt();
					for(int i=0;i<names.length;i++) {
						if(zhuangTai[i]==0 && names[i]!=null && qianShouNum==i+1) {
							zhuangTai[i]=1;
							System.out.println("订单签收成功！");
							isSignFind=true;
						}else if(names[i]!=null && zhuangTai[i]==1 && qianShouNum==i+1) {
							System.out.println("您选择的订单已经签收，不能再次签收");
							isSignFind=true;
						}
						
					}
					if(!isSignFind) {
						System.out.println("您选择的订单不存在！");
				}
					break;
				case 4:
					//删除订单
					System.out.println("*****删除订单*****");
					boolean isDelFind=false;//标记是否找到要删除的订单
					System.out.println("请输入要删除的订单编号：");
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
							System.out.println("删除订单成功！");
							break;
						}else if(names[i]!=null && zhuangTai[i]!=0 &&shanChuNum==i+1) {
							System.out.println("您选择的订单未签收，不能删除！");
							isDelFind=true;
							break;
						}
						
						
						
					}
					if(!isDelFind) {
						System.out.println("您要删除的订单不存在！");
					}
					break;
				case 5:
					//我要点赞
					System.out.println("*****我要点赞*****");
					
					System.out.println("序号\t"+"菜名\t"+"单价");
					for(int i=0;i<cai.length;i++) {
						String greatNums=greatNum[i]>0 ? greatNum[i]+"赞" :"";
						System.out.println((i+1)+"\t"+cai[i]+"\t"+caijiage[i]+"\t"+greatNums);
					}
					System.out.println("请输入您要点赞的菜品序号：");
					int dianZanNum=input.nextInt();
					greatNum[dianZanNum-1]++;
					System.out.println("点赞成功！");
					break;
				case 6:
					//退出系统
				//	System.out.println("*****退出系统*****");
				//	break;
				default :
					//功能编号录入错误，认为退出系统
					isExit=true;
					break;
					
							
			}
			
			if(!isExit) {//不退出系统，录入0可以返回菜单
				System.out.println("输入0返回：");
				num=input.nextInt();
			}else {
				input.close();//关闭键盘录入
				break;
			}
			
		}while(num==0);
	}

}
