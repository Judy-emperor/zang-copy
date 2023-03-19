package mypack1;
/*
 * 方法覆写与重载--子类
 */
public class SmartTool extends Tool{

	//子类覆写父类方法
	public int min(int a,int b) {
		return a<b ?b:a;
	}
	//重载方法，可以理解为对min方法的不同表现形式
	public int min() {
		return 0;
		
	}
	public static void main(String[] args) {
		SmartTool smarttool = new SmartTool();
		smarttool.min();
		smarttool.min(3, 4);
	}

}
