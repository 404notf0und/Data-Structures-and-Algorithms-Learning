//汉诺塔问题，来源于：https://mp.weixin.qq.com/s/paOrlfpdMwvCUDywda0EvQ
package test;

public class Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="塔A";
		String b="塔B";
		String c="塔C";
		hanoi(10,a,b,c);
	}
	public static void hanoi(int n,String sourceTower,String tempTower,String targetTower) {
		if (n==1) {
			move(n,sourceTower,targetTower);
		}else {
			hanoi(n-1,sourceTower,tempTower,targetTower);
			move(n,sourceTower,targetTower);
			hanoi(n-1,tempTower,sourceTower,targetTower);
			
		}
	}
	private static void move(int n,String sourceTower,String targetTower) {
		System.out.println("第"+n+"号盘子 move:"+sourceTower+"--->"+targetTower);
	}

}
