package Demo0711;



/*
 * 在格子游戏的基础上，添加”口”,”L”,”T”字图像(每个图形都是4个格子组成)。
图像具有功能：
1、向左移一个单位。
2、向右移 一个单位。
3、向下移一个单位
4、向下移n个单位。
在墙纸上能打印图像，如：
- - - - - - - - - - - - - - - - - - 
- - - - # # - - - - - - - - - - -
- - - - # # - - - - - - - - - - -
- - - - - - - - - - - - - - - - - -
 */
public class Demo0711_04 {
	int x;//格子横坐标
	int y;//格子纵坐标
	
	//墙纸的长宽
	int length;
	int hight;
	
	public void printWall(Demo0711_04 cell) {
		//定位墙纸纵坐标的位置
		for(int p=0;p<y;p++) {
			System.out.println();
		}
		//打印墙纸的同时定位横坐标
		for(int i=0;i<y+hight;i++) {//行

			for(int j=0;j<x+length;j++) {//列
				//定位墙纸横坐标的位置
				if(j<x) {
					System.out.print(" ");
				}else if(cell.x==j && cell.y==i) {//打印格子
					System.out.print("#");
				}else {//打印"-"
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
